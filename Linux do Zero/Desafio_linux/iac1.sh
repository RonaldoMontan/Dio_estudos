#!/bin/bash

echo "Criando diretorios..."

mkdir /publico
mkdir /adm
mkdir /vendedor
mkdir /secretaria

echo "Criando grupor de usuarios... "

groupadd GRP_ADM
groupadd GRP_VEN
groupadd GRP_SEC

echo "Criando usuarios..."

useradd carlos -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_ADM
useradd maria -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_ADM
useradd joao -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_ADM

useradd debora -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_VEN
useradd matheus -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_VEN
useradd ronaldo -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_VEN

useradd mariana -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_SEC
useradd camila -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_SEC
useradd andre -m -s /bin/bash -p $(openssl passwd -crypt Senha123) -G GRP_SEC

echo "Especificando permissões dos diretórios..."

chown root:GRP_ADM /adm
chown root:GRP_VEN /vendedor
chown root:GRP_SEC / secretaria

chmod 770 /adm
chmod 770 /vendedor
chmod 770 /secretaria
chmod 770 /publico

echo "Procedimento finalizado !"

