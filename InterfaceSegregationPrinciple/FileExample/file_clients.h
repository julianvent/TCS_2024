#ifndef FILE_CLIENTS_H
#define FILE_CLIENTS_H
#include "file_classes.h"

class FileImporter {
public:
    void import(FileInterface& file)
    {
        // logica para importar archivos...
        file.rename("Nuevo nombre");
        std::cout << "Archivo importado" << '\n';
    }

};


class FilePermissionManager
{
public:
    void transferOwnership(SupportsChangeOfOwnershipInterface& file)
    {
        file.changeOwnership("Nuevo usuario", "Nuevo grupo");
        std::cout << "Propietario cambiado" << '\n';
    }

};

#endif