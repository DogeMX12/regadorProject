import misPlantillas.LeerDato;

import java.io.*;
import java.io.IOException;
public class regador {
    //------------------------ CONTRUCTOR -----------------------------------//
    public regador(){}
    //------------------------ VARIBLES MIEMBRO -----------------------------------//
    LeerDato objLeer = new LeerDato();
    //------------------------ MENU-----------------------------------//
    public int menu(int res)throws IOException {
        do{
            System.out.println ("┌──────────────────────────────────────────────┐");
            System.out.println ("│             Sistema de Riego                 │");
            System.out.println ("├──────────────────────────────────────────────┤");
            System.out.println ("│            ELIGE UNA OPCION                  │");
            System.out.println ("│         1.- Instruccion                      │");
            System.out.println ("│         2.- Ingresar ER                      │");
            System.out.println ("│         3.- SALIR                            │");
            System.out.println ("└──────────────────────────────────────────────┘");
            System.out.println("\n ELIGE UNA OPCION");
            res=objLeer.leer(0);
            if((res<1)||(res>3)){
                System.out.println ("OPCION INVALIDA");
            }
        }while((res<1)||(res>3));
        return res;
    }
    //------------------------ MENU-----------------------------------//
    public void expresionRegular(int res)throws IOException {

    }

    //------------------------ MENU-----------------------------------//
    public static void main(String[] args) throws IOException{
        regador objRegar = new regador();
        int r1=0;
        do {
            r1=objRegar.menu(0);
            switch (r1){
                case 1:
                    objRegar.expresionRegular(1);
                    break;
                case 2:

                    break;
            }
        }while (r1!=3);
    }
}
