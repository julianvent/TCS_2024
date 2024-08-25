#ifndef FILE_CLASSES_H
#define FILE_CLASSES_H
#include "file_interfaces.h"
#include <iostream>

class File
{
protected:
    std::string m_file_name;
    std::string m_owner_username;
    std::string m_owner_group_name;

public:
    File(const std::string& file_name, const std::string& owner_username, const std::string& owner_group_name)
        : m_file_name{file_name}
        , m_owner_username{owner_username}
        , m_owner_group_name{owner_group_name}
    {}

    void printData()
    {
        std::cout << "Nombre del archivo: " << m_file_name << '\n';
        std::cout << "Propietario: " << m_owner_username << '\n';
        std::cout << "Grupo propietario: " << m_owner_group_name << '\n';
    }
};


class LocalFile
    : public File
    , public FileInterface
    , public SupportsChangeOfOwnershipInterface
{

private:
    void rename(const std::string& file_name)
    {
        m_file_name = file_name;
    }

    void changeOwnership(const std::string& owner_username, const std::string& owner_group_name)
    {
        m_owner_username = owner_username;
        m_owner_group_name = owner_group_name; 
    }

public:
    LocalFile(const std::string& file_name, const std::string& owner_username, const std::string& owner_group_name)
        : File{file_name, owner_username, owner_group_name}
    {}
};


class DropboxFile
    : public File
    , public FileInterface
{
private:
    void rename(const std::string& file_name)
    {
        m_file_name = file_name;
    }

public:
    DropboxFile(const std::string& file_name, const std::string& owner_username, const std::string& owner_group_name)
        : File{file_name, owner_username, owner_group_name}
    {}
};

#endif