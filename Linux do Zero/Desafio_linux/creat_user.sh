#!/bin/bash

echo "Criando usuarios do sistema !"

userad guest10 -c "usuario convidado" -s /bin/bash -m -p $(openssl passwd -crypt senha123)
passwd guest10 -e

userad guest11 -c "usuario convidado" -s /bin/bash -m -p $(openssl passwd -crypt senha123)
passwd guest11 -e

userad guest12 -c "usuario convidado" -s /bin/bash -m -p $(openssl passwd -crypt senha123)
passwd guest12 -e

userad guest13 -c "usuario convidado" -s /bin/bash -m -p $(openssl passwd -crypt senha123)
passwd guest13 -e

echo "Procedimento finalizado !"

