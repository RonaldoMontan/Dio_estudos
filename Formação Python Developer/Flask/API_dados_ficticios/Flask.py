from flask import Flask
from dataset import criadados

app = Flask(__name__)


#rota padrão Flask
@app.route("/")
def mensagem():    
    return """<h1>Bem vindo a pagina inicial da API </h1>
            <h2>Acrecente apos a porta '/new/' e informe seu nome</h1> <br> 
            <h2>Ou infomre '/dados/' para acessar uma base de dados fake !</h1>
    
        """
    #retornamos uma mensagem em estrutura html para exibir no Navegador.


@app.route("/new/<nome>")
def nome(nome):

    return f"""<h1>{nome}</h1> <br>
                <h2>Caso queira voltar para a pagina inicial</h2> 
                <a href= "http://localhost:5000">
                    <button>Aqui</button>
                </a>

            """
    #conseguimos capturar o nome digitado na url para exibir.


@app.route("/dados/")
def dados():
    chamada = criadados()
    return chamada
    #Realiza a importação de uma função de outro arquivo que gera 100 registros fake a cada requisição

app.run(host= "0.0.0.0", debug=True, port=5000)