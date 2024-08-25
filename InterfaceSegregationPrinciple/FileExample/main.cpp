#include "file_clients.h"
#include <iostream>
int main()
{
    LocalFile local {"Archivo local", "Usuario 1", "Grupo 1"};

    DropboxFile dropbox{"Archivo dropbox", "Usuario 2", "Grupo 2"};

    FileImporter importer{};
    FilePermissionManager permission_manager{};

    local.printData();
    std::cout << '\n';
    dropbox.printData();

    std::cout << '\n';

    importer.import(local);
    permission_manager.transferOwnership(local);
    local.printData();

    std::cout << '\n';

    importer.import(dropbox);
    // permission_manager.transferOwnership(dropbox);
    dropbox.printData();

    return 0;
}
