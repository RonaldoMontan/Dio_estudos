from datetime import datetime

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

saldo = 0
acoes = []
saque = 3
escolha = choice()
while True:

    if escolha == 's':
        valor_s = int(input("Você pode sacar até R$500,00\n>>"))
        while valor_s > 500:
            valor_s = int(input(f"O valor R${valor_s:.2f} INVALIDO, maximo permitido 500,00\n>>"))

        while valor_s > saldo:
            valor_s = int(input(f"""
            Você não pode sacar mais do que tem !
            seu saldo é de............. R${saldo:.2f}
            """))

        if valor_s <=500:
            data = datetime.now().strftime("%d/%m/%Y %H:%M:%S")
            saldo -= valor_s
            acoes.append(f'Saque no valor de R${valor_s:.2f} realizado as {data}')
            
        escolha = choice()
        saque -=1
        if saque == 0:
            print('>> Limite de saque atingido <<')
            break


    elif escolha == 'd':
        valor_d = int(input("Qual valor do deposito ?\n>>"))
        while valor_d <0:            
            valor_d = int(input(f"Valor R${valor_d:.2f} invalido, Informe um valor positivo !\n>>"))
        saldo += valor_d

        data = datetime.now().strftime("%d/%m/%Y %H:%M:%S")
        acoes.append(f'Deposito de R${valor_d:.2f} realizado as {data}')

        escolha = choice()

    elif escolha == 'e':
        for acao in acoes:
            print(acao)
        print(f'saldo atual..... R${saldo:.2f}')
        escolha = choice()

    elif escolha == 'q':
        break

    else:
        escolha = choice()

print('Operação finalizada')