#ifndef FILE_INTERFACES_H
#define FILE_INTERFACES_H
#include <string>

class FileInterface
{
public:
    virtual void rename(const std::string& name) = 0;
};


class SupportsChangeOfOwnershipInterface
{
public:
    virtual void changeOwnership(const std::string& user, const std::string& group) = 0;
};


#endif