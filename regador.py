# -*- coding: utf-8 -*-
import re

""" La función mostrar_reglas() muestra las reglas de la expresión regular para la construcción de las cadenas válidas. """
def mostrar_reglas():
    print("∑={0,1}") #sp32
    print("Expresión regular: ((0|1)(0|1)(0|1)(0|1)(0|1))((0|1)(0|1)(0|1)(0|1)(0|1))*") #sp32
    print("L = {Lenguaje de todas las cadenas del alfabeto ∑ cuya longitud es de 5 caracteres o múltiplos de 5 que son la combinación de 0’s o 1’s.}")
    print("Reglas:")
    print("1. La cadena debe contener únicamente los caracteres 0 y 1.")
    print("2. La cadena no puede estar vacía.")
    print()


""" La función validar_cadena() valida la cadena que se ingrese mediante la expresión regular. """
def validar_cadena(cadena):
    patron = re.compile("((0|1)(0|1)(0|1)(0|1)(0|1))((0|1)(0|1)(0|1)(0|1)(0|1))*")
    
    if patron.fullmatch(cadena) is not None:#?fullmatch retorna none si no hay matcheo en cadena por ende si no es none la cadena es valida
        return "Cadena válida"
    else:
        return "Cadena inválida: no cumple con las reglas"

""" La función salir() genera un letrero informativo antes de que el programa termine de ejecutarse. """
def salir():
    print("saliendo del programa gracias por participar en esta prueba")




""" Esta sección de código lista las opciones con su respectiva ejecución de código, dependiendo de la opción que ingrese el usuario, será la función que se ejecutará """
#*definimos una variable de tipo entero inicializada en cero
opcion = 0
opciones = {
    1:mostrar_reglas,
    2:lambda:print(validar_cadena(input("Ingrese la cadena a validar: "))),
    3:salir
}

""" Esta sección de código permite mostrar un menú contextual para que el usuario vea las opciones y dependiendo de la opción que eliga se va a ejecutar una función """

while opcion != 3:
    print("Menú:")
    print("1. Ver reglas y expresión regular") 
    print("2. Validar cadena")
    print("3. Salir")
    try:
        opcion = int(input("Seleccione una opción(1-3): "))

        if opcion in opciones:
            opciones[opcion]()#ejecuta lo que se mande a llamar en la opcion ingresada (1,2,3)
        else:
            print("ELIJA UNA OPCION VALIDA")
    except ValueError:
        print("Favor de ingresar un número")
