from datetime import datetime

def choice():
    escolha = str(input("""
    _______Menu_______

    [s] - sacar
    [d] - depositar
    [e] - extrato
    [u] - cadastrar cliente
    [c] - cadastrar conta
    [q] - sair
    __________________
    >>""")).lower()[0]
    return escolha


def sacar(saldo):

    if saldo < 0:
        print(f'Seu saldo é R${saldo:.2f} e você não pode sacar')
    
    else:
        valor_s = int(input("Você pode sacar até R$500.00\n"))
        while valor_s > 500:
            valor_s = int(input(f"O valor R${valor_s:.2f} INVALIDO, maximo permitido R$500.00\n"))

        while valor_s > saldo:
            valor_s = int(input(f"""
            Você não pode sacar mais do que tem !
            seu saldo é de..............R${saldo:.2f}
            """))

    if valor_s <=500:
        saldo_atual(-valor_s)
    return valor_s


def depositar():
    valor_d = int(input("Qual valor do deposito ?\n>>"))
    while valor_d <0:            
        valor_d = int(input(f"Valor R${valor_d:.2f} invalido, Informe um valor positivo !\n>>"))
    
    saldo_atual(valor_d)
    return valor_d


def saldo_atual(valor=0):
    if valor == 0:
        pass
    else:        
        if valor < 0:
            data = datetime.now().strftime("%d/%m/%Y %H:%M:%S")        
            acoes.append(f'Saque no valor de R${valor:.2f} realizado as {data}')
        else:
            data = datetime.now().strftime("%d/%m/%Y %H:%M:%S")
            acoes.append(f'Deposito de R${valor:.2f} realizado as {data}')
        
    return acoes
   

def cadastra_cliente():
    todos_clientes = []
    achei =0
    cpf = (int(input("Informe o cpf sem pontos:  ")))
    # while len(cpf) != 13:
    #     cpf = (int(input("Informe o cpf sem pontos e com 11 digitos:  ")))
    for i in todos_clientes:
        if i['cpf'] == cpf:           
            achei = i['cpf']
            
    if achei == cpf:
         print('CPF ja cadastrado !')
    
    else:
        dados_clinetes ={
            "nome": str(input("Nome completo:  ")),
            "data_nascimento": str(input("Data de nascimento dd/mm/aaaa:  ")),
            "cpf": cpf,
            "endereco": str(input("seu endereço no formato: rua/av, bairro, cidade/sigla"))
        }
        todos_clientes.append(dados_clinetes)

def cria_conta():
    pass

saldo = 0
acoes = []
saque = 3
escolha = choice()
while escolha != 'q':

    if escolha == 's':
        if saque == 0:
            print('Você ja realizou 3 saques hoje !')
            
        retorno_s = sacar(saldo)
        saldo -= retorno_s
        saque -= 1
        escolha = choice()


    elif escolha == 'd':
        retorno_d = depositar()
        saldo += retorno_d
        escolha = choice()
       
        
    elif escolha == 'e':
        retorno_e = saldo_atual(0)
        for i in retorno_e:
            print(i)
        print(f'saldo atual..... R${saldo:.2f}')
        escolha = choice()


    elif escolha == 'u':
        pass

    elif escolha == 'c':
        pass

    elif escolha == 'q':
        break

    else:
        escolha = choice()

print('Operação finalizada')