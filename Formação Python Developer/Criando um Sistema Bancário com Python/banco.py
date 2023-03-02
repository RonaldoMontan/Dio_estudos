from datetime import datetime


saldo = 0
def choice():
    escolha = str(input("""
    _______Menu_______

    [s] - sacar
    [d] - depositar
    [e] - extrato
    [q] - sair
    __________________
    >>""")).lower()[0]
    return escolha


def sacar(saldo):
    saldoatual = saldo_atual(0)
    valor_s = int(input("Você pode sacar até R$500,00\n>>"))
    while valor_s > 500:
        valor_s = int(input(f"O valor R${valor_s:.2f} INVALIDO, maximo permitido 500,00\n>>"))

    while valor_s > saldoatual:
        valor_s = int(input(f"""
        Você não pode sacar mais do que tem !
        seu saldo é de............. R${saldoatual:.2f}
        """))

    if valor_s <=500:
        saldo_atual(-valor_s)


def depositar():
    valor_d = int(input("Qual valor do deposito ?\n>>"))
    while valor_d <0:            
        valor_d = int(input(f"Valor R${valor_d:.2f} invalido, Informe um valor positivo !\n>>"))
    
    saldo_atual(valor_d)


def saldo_atual(valor):
    
    if valor < 0:
        data = datetime.now().strftime("%d/%m/%Y %H:%M:%S")        
        acoes.append(f'Saque no valor de R${valor:.2f} realizado as {data}')
    else:
        data = datetime.now().strftime("%d/%m/%Y %H:%M:%S")
        acoes.append(f'Deposito de R${valor:.2f} realizado as {data}')
    
    saldo += valor
    print(f'=========== {saldo}')
    for acao in acoes:
        print(acao)
    print(f'saldo atual..... R${saldo:.2f}')
    return saldo

acoes = []
saque = 3
escolha = choice()
while escolha != 'q':

    if escolha == 's':
        sacar()
        escolha = choice()


    elif escolha == 'd':
        depositar()
        escolha = choice()

        
    elif escolha == 'e':
        saldo_atual()
        escolha = choice()


    elif escolha == 'q':
        break

    else:
        escolha = choice()

print('Operação finalizada')