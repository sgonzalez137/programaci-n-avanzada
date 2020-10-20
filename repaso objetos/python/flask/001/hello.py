from flask import Flask
app = Flask(__name__)
@app.route('/')
def hello_world():
    return 'Hellow World'

@app.route('/flask')
def hello_world_flask():
    return 'Hellow World in flask'

if __name__ == '__main__':
    app.run(debug=True)