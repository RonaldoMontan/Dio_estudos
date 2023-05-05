from flask import Flask, request, redirect, url_for, render_template
from database import Database


app = Flask(__name__)
db = Database()

@app.route('/', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':

        username = request.form['username'].upper()
        password = request.form['password']
        result = db.consult_credential(username=username)
        print(result)
        if result == None:
            return render_template('autenticatefail.html')
        
        elif result['password'] == password:
            return redirect(url_for('principal'))
            
    
    return render_template('login.html')


@app.route('/register_user', methods=['GET', 'POST'])
def register():  
    if request.method == 'POST':

        username = request.form['seu usuário'].upper()
        password = request.form['sua senha']
        result = db.insert_credential(username=username, password=password)

        return render_template('validated.html', result=result)
        
    return render_template('register_user.html')


@app.route('/principal')
def principal():
        
    return render_template('principal.html')


if __name__ == '__main__':
    app.run(debug=True, port=5000)
