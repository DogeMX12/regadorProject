import misPlantillas.LeerDato;

import java.io.*;
import java.io.IOException;

public class regador {
    //------------------------ CONTRUCTOR -----------------------------------//
    public regador() {
    }

    //------------------------ VARIBLES MIEMBRO -----------------------------------//
    LeerDato objLeer = new LeerDato();
    String erUsuario = null;

    //------------------------ MENU-----------------------------------//
    public int menu(int res) throws IOException {
        do {
            System.out.println("┌──────────────────────────────────────────────┐");
            System.out.println("│             Sistema de Riego                 │");
            System.out.println("├──────────────────────────────────────────────┤");
            System.out.println("│            ELIGE UNA OPCION                  │");
            System.out.println("│         1.- Instruccion                      │");
            System.out.println("│         2.- Ingresar ER                      │");
            System.out.println("│         3.- SALIR                            │");
            System.out.println("└──────────────────────────────────────────────┘");
            System.out.println("\n ELIGE UNA OPCION");
            res = objLeer.leer(0);
            if ((res < 1) || (res > 3)) {
                System.out.println("OPCION INVALIDA");
            }
        } while ((res < 1) || (res > 3));
        return res;
    }

    //------------------------ validar expresion regular-----------------------------------//
    public String expresionRegular() throws IOException {
        //variables locales
        boolean band = true;
        boolean bandCaracteres = true;
        String cadena = null;

        //inicio do while para corroborar que la er enviada sea valida
        do {
            cadena = null;
            band = true;
            try {
                //Solicitamos cadena
                System.out.print("\nIngrese su expresion regular a continucacion --> ");
                erUsuario = objLeer.leer(null);
                //cambiamos de int a string
                cadena = String.valueOf(erUsuario);
                //corroboramos que la longitud sea unicamente de 3
                if (!(cadena.length() == 3)) {
                    band = false;
                    System.out.println("\n!!!!!Error, la cadena debe de tener SOLO 3 valores");
                } else {
                    //evaluamos si solo contiene 0 o 1
                    if (!((bandCaracteres = revisarCaracteres(cadena)) == true)) {
                        band = false;
                        System.out.println("\n!!!!!Error, la cadena debe de tener SOLO 1 y 0");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("\nError, favor de corregir el valor ingresado");
            }
        } while (band == false); //fin do while corroboracion cadena

        switch (cadena) {
            case "000":
                System.out.println("ENTRO A");
                cadena = "Tanque basio, NO regar";
                ;
            case "001":
                System.out.println("ENTRO B");
                cadena = "Tanque basio, SI regar";
                ;
            case "010":
                System.out.println("ENTRO C");
                cadena = "Tanque medio lleno, NO regar";
                ;
            case "011":
                System.out.println("ENTRO D");
                cadena = "Tanque medio lleno, SI regar";
                ;
            case "100":
                System.out.println("ENTRO E");
                cadena = "Tanque CASI lleno, NO regar";
                ;
            case "101":
                System.out.println("ENTRO F");
                cadena = "Tanque CASI lleno, SI regar";
                ;
            case "110":
                System.out.println("ENTRO G");
                cadena = "Tanque lleno, NO regar";
                ;
            case "111":
                System.out.println("ENTRO H");
                cadena = "Tanque lleno, SI regar";
                ;
        }

        return cadena;
    }

    //------------------------ validar letras-----------------------------------//
    public boolean revisarCaracteres(String palabra) {
        boolean bandCaracteres = true;
        char[] cadena = palabra.toLowerCase().toCharArray();

        for (int i = 0; i < 3; i++) {
            if (
                    !((String.valueOf(cadena[i]).equals("0")) || (String.valueOf(cadena[i]).equals("1")))) {
                bandCaracteres = false;
            }
        }
        return bandCaracteres;
    }


    //------------------------ MENU-----------------------------------//
    public static void main(String[] args) throws IOException {
        //Creamos objeto en el cual vamosa trabajar
        regador objRegar = new regador();
        //variable para controlar menu
        int r1 = 0;
        //variable, ER del usuario
        //varaible, resultado de expresionregular
        String erCadena;
        //inicio do-while iteraciones menu
        do {
            //almacenamios opcion elegida por el usuarios - menu
            r1 = objRegar.menu(0);
            //inicio swtich-case de opciones menu
            switch (r1) {
                //caso 1, descripcion instrucciones
                case 1:
                    break;
                //caso 2, insercion de ER
                case 2:
                    erCadena = objRegar.expresionRegular();
                    String erUsuario = objRegar.erUsuario;
                    System.out.println("\nLa expresion regular de " + erUsuario + " es = ");
                    System.out.println(erCadena);
                    break;
                //caso 3, salida del menu
                case 3:
                    System.out.println("******* Fin del Programa *******");
                    break;
                //fin switch opciones menu
            }
            // fin do-while que controla iteraciones menu
        } while (r1 != 3);
    }
}
