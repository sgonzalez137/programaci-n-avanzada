from flask import Flask, render_template
from flaskext.mysql import MySQL

app = Flask(__name__)
mysql = MySQL()
app.config['MYSQL_DATABASE_USER'] = 'root'
app.config['MYSQL_DATABASE_PASSWORD'] = ''
app.config['MYSQL_DATABASE_DB'] = 'agendap'
app.config['MYSQL_DATABASE_HOST'] = 'localhost'
#app.config['MYSQL_DATABASE_PORT'] = 6603
mysql.init_app(app) 
conn = mysql.connect()
cursor =conn.cursor()

@app.route('/usuarios')
def ver_usuarios():
    cursor.execute("SELECT * from usuarios")
    data = cursor.fetchall()
    return render_template('usuarios.html', usuarios = data )

@app.route('/todos')
def ver_todos():
    cursor.execute("SELECT usu_nombre, con_nombre, con_apellido, con_telefono, cit_lugar, cit_fecha " +
                    "FROM usuarios as usu " + 
                    "LEFT JOIN contactos as con on (usu.usu_id = con.usu_id) " +
                    "LEFT JOIN citas as cit on (con.con_id = cit.con_id)")
    data = cursor.fetchall()
    return render_template('todos.html', citas = data )

@app.route('/update')
def actualizar_usuarios():
    cursor.execute("SELECT usu_nombre,usu_clave, con_nombre, con_apellido, con_telefono, cit_lugar, cit_fecha " +
                    "FROM usuarios as usu " + 
                    "LEFT JOIN contactos as con on (usu.usu_id = con.usu_id) " +
                    "LEFT JOIN citas as cit on (con.con_id = cit.con_id)")
    data = cursor.fetchall()
    return render_template('ingreso.html', usuarios = data )

if __name__ == '__main__':
    app.run(debug=True)
 