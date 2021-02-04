from flask import Flask, request, redirect, url_for, render_template, session
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)
app.config["SQLALCHEMY_DATABASE_URI"]= "sqlite:///inventario.db"
app.config["SECRET_KEY"] = "123"

db = SQLAlchemy(app)

class producto(db.Model):
    id = db.Column("producto_id", db.Integer, primary_key= True)
    producto_nombre = db.Column(db.String(100))
    producto_valor = db.Column(db.Integer)
    producto_cantidad = db.Column(db.Integer)

    def __init__(self, datos):
        self.producto_nombre = datos["nombre"]
        self.producto_valor = datos["valor"]
        self.producto_cantidad = datos["cantidad"]


@app.route("/")
def principal():
    return render_template("lista.html", productos = producto.query.all())
   

@app.route("/agregar/<nombre>/<int:valor>/<int:cantidad>")
def agregar(nombre, valor, cantidad):
    datos = {"nombre": nombre, 
             "valor": cantidad, 
             "cantidad": valor
    }

    p = producto(datos)
    db.session.add(p)
    db.session.commit()
    return principal()


@app.route("/sacar/<int:id>/<int:cantidad>")
def sacar(id, cantidad):
    p = producto.query.filter_by(id=id).first()
    if cantidad >= p.producto_cantidad :
        p.producto_cantidad = p.producto_cantidad - cantidad
        db.session.commit()  
    
    return principal()

@app.route("/actualizar/<int:id>/<int:valor>")
def actualizar(id, valor):
    pass

@app.route("/limpiar/")
def limpiar():
    productos=producto.query.all()
    for p in productos:
        db.session.delete(p)
        db.session.commit()
    return principal()

@app.route("/vaciar/")
def vaciar():
    producto.query.filter().delete()
    return principal()


@app.route("/eliminar/<int:id>")
def eliminar(id):
    p = producto.query.filter_by(id=id).first()
    db.session.delete(p)
    db.session.commit()
    return principal()


if __name__=="__main__":
    db.create_all()
    app.run(debug=True)

