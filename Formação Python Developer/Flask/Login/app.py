from flask import Flask, request, redirect, url_for, render_template
from database import Database


app = Flask(__name__)
db = Database()

@app.route('/', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        username = request.form['username']
        password = request.form['password']
        
        # Aqui você pode verificar se o usuário e a senha estão corretos
        # Se estiverem corretos, redirecione o usuário para a próxima página
        # Senão, exiba uma mensagem de erro para o usuário
        
        return redirect(url_for('next_page'))
    
    return render_template('login.html')


@app.route('/register_user', methods=['GET', 'POST'])
def register():  
    if request.method == 'POST':
        username = request.form['seu usuário']
        password = request.form['sua senha']

        result = db.insert_credential(username=username, password=password)
        return render_template('validated.html', result=result)
        # return redirect(url_for('register_user.html'))
    
    return render_template('register_user.html')


if __name__ == '__main__':
    app.run(debug=True, port=5000)
