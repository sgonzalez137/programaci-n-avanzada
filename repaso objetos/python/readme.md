¿Qué es una metaclase? Pues es una clase cuyas instancias son clases en lugar de objetos. Es decir, si para construir un objeto usas una clase, para construir una clase usas una metaclase.

¿Y eso para qué sirve? Pues resulta muy útil principalmente para dos cosas:

Cuando no sea posible determinar el tipo de un objeto hasta el momento de la ejecución del programa, o cuando sea necesario crear una clase a la medida de las circunstancias. Se podría decir que en este caso la metaclase funciona como una “fábrica de clases” especializada.
Cuando se desea componer o modificar el comportamiento o características de una clase en el momento de su creación por medio de herencia o por mecanismos de construcción dinámicos. Es algo parecido a la Programación Orientada a Aspectos o como una generalización del patrón decorator.


type, la madre de todas las metaclases
A partir de Python 2.2 type() tiene un significado nuevo muy especial: permite crear nuevos tipos, es decir, es una metaclase, de hecho es la metaclase con la que están creados todos los tipos “built-in” de Python y todas las clases de “nuevo-estilo” (las que heredan de object); como ya he dicho, obviaré las “clases clásicas”.


Para crear una clase con type() se usa la siguiente sintaxis:

type(name, bases, dct)
name: es el nombre de la nueva clase
bases: son las clases de las que hereda
dct: es un diccionario con los métodos que implementa


Por ejemplo, 

Saludo = type('Saludo', (), {'hola': lambda self: 'hola metamundo!'})
s = Saludo()
print s.hola()

cualquier sentencia class de las que has usado hasta ahora implica realmente una invocación similar, puesto que type es la metaclase implícita cuando defines clases “normales”. Sin embargo, en el ejemplo anterior, type no se usa como metaclase; se emplea simplemente como “factoría de clases” puesto que se invoca como una función (o al menos, es lo que parece). Es decir, salvando las distancias, es algo equivalente a:

def class_factory(f):
   class retval: pass
   setattr(retval, f.__name__, f)
   return retval

def hola(self):
   return 'hola a todos!'

SaludoClass = class_factory(hola)
s = SaludoClass()
print s.hola()


Pero type no es una función, es una metaclase (una clase) y por tanto se puede heredar de ella. Y como type es una metaclase: cualquier subclase de type ES una metaclase;

__new__ e __init__

son dos de los métodos especiales que tienen todas las clases.


Este método se ejecuta después de construirse la instancia y se utiliza para inicializar los atributos que lo requieran y, en general, hacer trabajo de “setup” de la instancia.

El proceso de creación de un objeto (instancia) de una clase es más o menos así (después lo refinamos):

Se invoca la clase con los argumentos requeridos
Se ejecuta el método __new__ pasándose la clase a sí misma como primer argumento, y a continuación los argumentos que indicó el usuario en la “invocación” original.
__new__ retorna una nueva instancia (esto es obligatorio).
Se ejecuta el método __init__ pasando como primer argumento la instancia creada por __new__ y también todos los argumentos de la invocación original.

