from flask import Flask, request, redirect, url_for, render_template

app = Flask(__name__)

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

@app.route('/next_page')
def next_page():
    return render_template('next_page.html')

if __name__ == '__main__':
    app.run(debug=True, port=5000, host='192.168.99.119')
