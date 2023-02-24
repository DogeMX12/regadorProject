# -*- coding: utf-8 -*-
import re

def mostrar_reglas():
    print("∑={0,1}") #sp32
    print("Expresión regular: {0·00·(1|0)·(1|0)·000}|{1·(01|10|11)·[[(00)·(11)]|[(01)·(10)]|[(10)·(01)]·1]|[(11)·(00)]·0} · {0·00·(1|0)·(1|0)·000}|{1·(01|10|11)·[[(00)·(11)]|[(01)·(10)]|[(10)·(01)]·1]|[(11)·(00)]·0}*") #sp32
    print("Reglas:")
    print("1. La cadena debe contener únicamente los caracteres 0 y 1.")
    print("2. La cadena debe contener solamente las subcadenas 0000, 0101, 1010, 1111.")
    print("3. La cadena puede estar vacía.")
    print()

def validar_cadena(cadena):
    patron = re.compile("(000(1|0)(1|0)000)|(1(01|10|11)(((00)(11))|((01)(10))|((10)(01))1)|((11)(00))0)")
    if patron.fullmatch(cadena) is not None:#?fullmatch retorna none si no hay matcheo en cadena por ende si no es none la cadena es valida
        return "Cadena válida"
    else:
        return "Cadena inválida: no cumple con las reglas"
def salir():
    print("saliendo del programa gracias por participar en esta prueba")

#*definimos una variable de tipo entero inicializada en cero
opcion = 0
opciones = {
    1:mostrar_reglas,
    2:lambda:print(validar_cadena(input("Ingrese la cadena a validar: "))),
    3:salir
}

while opcion != 3:
    print("Menú:")
    print("1. Ver reglas y expresión regular")
    print("2. Validar cadena")
    print("3. Salir")
    opcion = int(input("Seleccione una opción(1-3): "))

    if opcion in opciones:
        opciones[opcion]()#ejecuta lo que se mande a llamar en la opcion ingresada (1,2,3)
    else:
        print("Elija una opcion valida")