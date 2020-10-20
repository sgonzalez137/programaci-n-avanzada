from flask import Flask, redirect,url_for,request
from flask.templating import render_template
app =Flask(__name__)

@app.route('/')
def select1():
    return render_template('login.html')

@app.route('/home.html')
def select2():
    return render_template('home.html')

@app.route('/contacto.html')
def select3():
    return render_template('contacto.html')

@app.route('/datosp.html')
def select4():
    return render_template('datosp.html')

@app.route('/formaciona.html')
def select5():
    return render_template('formaciona.html')

@app.route('/proyecciones.html')
def select6():
    return render_template('proyecciones.html')

@app.route('/datosBasicos.html')
def select7():
    return render_template('/datosBasicos.html')

@app.route('/formacionM.html')
def select8():
    return render_template('formacionM.html')

@app.route('/tecnologiasInteres.html')
def select9():
    return render_template('tecnologiasInteres.html')

@app.route('/principal.html')
def select10():
    return render_template('principal.html')


@app.route('/login',methods = ['POST','GET'])
def login():
    if request.method == 'POST':
        user = request.form["name"]
        if user == 'sebastian':
            return render_template('home.html')
        elif user == 'alejandro':
            return render_template('datosp.html')
        elif user == 'miguel':
            return render_template('principal.html')
        else:
            return render_template('login.html')

if __name__ == '__main__':
    app.run(debug=True)
