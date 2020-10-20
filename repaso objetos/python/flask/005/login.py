from flask import Flask, redirect,url_for,request
from flask.templating import render_template
app =Flask(__name__)

@app.route('/')
def mainp():
    return render_template('login.html')

@app.route('/home.html')
def sebastian1():
    return render_template('home.html')

@app.route('/contacto.html')
def sebastian2():
    return render_template('contacto.html')

@app.route('/datosp.html')
def sebastian3():
    return render_template('datosp.html')

@app.route('/formaciona.html')
def sebastian4():
    return render_template('formaciona.html')

@app.route('/proyecciones.html')
def sebastian5():
    return render_template('proyecciones.html')

@app.route('/datosBasicos.html')
def miguel1():
    return render_template('/datosBasicos.html')

@app.route('/formacionM.html')
def miguel2():
    return render_template('formacionM.html')

@app.route('/tecnologiasInteres.html')
def miguel3():
    return render_template('tecnologiasInteres.html')

@app.route('/principal.html')
def miguel4():
    return render_template('principal.html')

@app.route('/academia.html')
def alejandro1():
    return render_template('academia.html')

@app.route('/home1.html')
def alejandro2():
    return render_template('home1.html')
@app.route('/personaldata.html')
def alejandro3():
    return render_template('personaldata.html')

@app.route('/tecnology.html')
def alejandro4():
    return render_template('tecnology.html')

@app.route('/login',methods = ['POST','GET'])
def login():
    if request.method == 'POST':
        user = request.form["name"]
        if user == 'sebastian':
            return render_template('home.html')
        elif user == 'alejandro':
            return render_template('home1.html')
        elif user == 'miguel':
            return render_template('principal.html')
        else:
            return render_template('login.html')

if __name__ == '__main__':
    app.run(debug=True)
