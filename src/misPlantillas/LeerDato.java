package misPlantillas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerDato {
    //-------------------DECLARACI N DE MIEMBROS DE INSTANCIA----------------//
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
//-------------------CONSTRUCTOR----------------//

    public LeerDato() {
    }

    //-------------------LEER DOUBLE----------------//
    public double leer(double val)throws IOException{
        boolean ban=true;
        do{
            ban=true;
            try{
                val=Double.parseDouble(teclado.readLine());
            }catch(NumberFormatException e){
                System.out.println("ERROR!! INGRESO UN TIPO DE DATO NO VALIDO : "+e);
                ban=false;
            }
        }while(ban=false);
        return val;
    }
    //-------------------LEER INT----------------//
    public int leer(int val)throws IOException{
        boolean ban=true;
        do{
            ban=true;
            try{
                val = Integer.parseInt(teclado.readLine());
            }catch(NumberFormatException e){
                System.out.println("ERROR!! INGRESO UN TIPO DE DATO NO VALIDO : "+e);
                ban=false;
            }
        }while(ban=false);

        return val;
    }
    //-------------------LEER STRING----------------//
    public String leer(String val)throws IOException{
        try{
            val = teclado.readLine();
        }catch(NumberFormatException e){
            System.out.println("ERROR!! INGRESO UN TIPO DE DATO NO VALIDO : "+e);
        }
        return val;
    }
    //-------------------LEER FLOAT----------eption{
    public float leer(float val)throws IOException{
        boolean ban=true;
        do{
            ban=true;
            try{
                val=Float.parseFloat(teclado.readLine());
            }catch(NumberFormatException e){
                System.out.println("ERROR!! INGRESO UN TIPO DE DATO NO VALIDO : "+e);
                ban=false;
            }
        }while(ban=false);
        return val;
    }


}
