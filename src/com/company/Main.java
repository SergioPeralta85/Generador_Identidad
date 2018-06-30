package com.company;

import java.lang.*;
import java.lang.invoke.SwitchPoint;

public class Main {

    public static void main(String[] args) {

        //Aleatorios para crear nombre y apellidos

        String Nombres[]={"Elena","Pepe","Juan","Emilio","Francisco","Raul","Ignacio","Tomas","Maribel","Sergio"};
        String Apellidos[]={"Gomez","Gutierrez","Moreira","Ramirez","Morales","Mejias","Salazar","Tomas","Peña","Gonzalez"};
        double Aleatorio_Nombre= (Math.random()*10);
        int Aleatorio_Nombre1= (int)Aleatorio_Nombre;
        double Aleatorio_1Apellido= (Math.random()*10);
        int Aleatorio_1Apellido1= (int)Aleatorio_1Apellido;
        double Aleatorio_2Apellido= (Math.random()*1);
        int Aleatorio_2Apellido2= (int)Aleatorio_2Apellido;

        //Aleatorios para crear NIF
        String LetraNif[]={"Q","W","E","R","T","Y","U","I","O","P",
                "A","S","D","F","G","H","J","K","L","Z",
                "X","C","V","B","N","M","A","G","H","D"};
        double Aleatorio_NIF= (Math.random()*1000000000);
        int Aleatorio_NIF2= (int)Aleatorio_NIF;
        double Aleatorio_Letra= (Math.random()*30);
        int Aleatorio_Letra1= (int)Aleatorio_Letra;

        //Aleatorio Ciudad

        String Ciudad[]={"","Madrid","Jaen","Barcelona","Valencia","La Coruña","Lugo","Toledo","Alicante","Zaragoza","Bilbao"};
        double Aleatorio_Ciudad= (Math.random()*10+1);
        int Aleatorio_Ciudad1= (int)Aleatorio_Ciudad;

        //Aleatorio para Telefono Fijo

        String Cadena_Fijo1="";
        String Cadena_Fijo2="";
        int PrefijoEsp=0;
        switch (Aleatorio_Ciudad1){
            case 1:PrefijoEsp=91;
                break;
            case 2:PrefijoEsp=953;
                break;
            case 3:PrefijoEsp=93;
                break;
            case 4:PrefijoEsp=96;
                break;
            case 5:PrefijoEsp=981;
                break;
            case 6:PrefijoEsp=982;
                break;
            case 7:PrefijoEsp=925;
                break;
            case 8:PrefijoEsp=96;
                break;
            case 9:PrefijoEsp=976;
                break;
            case 10:PrefijoEsp=94;
        }
        double Aleatorio_Prefijo= (Math.random()*1000);
        int Aleatorio_Prefijo1= (int)Aleatorio_Prefijo;
        double Aleatorio_Fijo1= (Math.random()*100);
        int Aleatorio_Fijo1_1= (int)Aleatorio_Fijo1;
        double Aleatorio_Fijo2= (Math.random()*100);
        int Aleatorio_Fijo2_2= (int)Aleatorio_Fijo2;
        if (Aleatorio_Prefijo1<100){
             Aleatorio_Prefijo1=(+100);
        }if(Aleatorio_Fijo1_1<10){
          Cadena_Fijo1="0";
            }if (Aleatorio_Fijo2_2<10){
            Cadena_Fijo2="0";
        }
        //Telefono movil

        String Cadena_Movil_2="";
        String Cadena_Prefijo_Movil="";
        String Cadena_Movil_1="";
        double Aleatorio_Prefijo_movil= (Math.random()*100);
        int Aleatorio_Prefijo_movil_1= (int)Aleatorio_Prefijo_movil;
        while(Aleatorio_Prefijo_movil_1<10){
            Cadena_Prefijo_Movil="0";
        }
        switch (Aleatorio_Prefijo_movil_1){
            case 100:
                Aleatorio_Prefijo_movil_1--;
                break;
        }
        double Aleatorio_Movil_1= (Math.random()*1000);
        int Aleatorio_Movil_1_1= (int)Aleatorio_Movil_1;
        if(Aleatorio_Movil_1_1<10){
            Cadena_Movil_1="00";
        }
        if(Aleatorio_Movil_1_1<100){
            Cadena_Movil_1="0";
        }
        double Aleatorio_Movil_2= (Math.random()*1000);
        int Aleatorio_Movil_2_1= (int)Aleatorio_Movil_2;
        if(Aleatorio_Movil_2_1<10){
            Cadena_Movil_2="00";
        }
        if(Aleatorio_Movil_2_1<100){
            Cadena_Movil_2="0";
        }
        System.out.println("=====================================");
        System.out.println("NOMBRE: "+Nombres[Aleatorio_Nombre1]+" "+Apellidos[Aleatorio_1Apellido1]+" "+Apellidos[Aleatorio_2Apellido2]);
        System.out.println("NIF: "+Aleatorio_NIF2+"-"+LetraNif[Aleatorio_Letra1]);
        System.out.println("CIUDAD: "+Ciudad[Aleatorio_Ciudad1]);
        System.out.println("Telefono Fijo: "+PrefijoEsp+" "+Aleatorio_Prefijo1+" "+Cadena_Fijo1+Aleatorio_Fijo1_1+" "+Cadena_Fijo2+Aleatorio_Fijo2_2);
        System.out.println("Movil: "+"6"+Cadena_Prefijo_Movil+Aleatorio_Prefijo_movil_1+" "+Cadena_Movil_1+Aleatorio_Movil_1_1+" "+Cadena_Movil_2+Aleatorio_Movil_2_1);
        System.out.println("=====================================");
        }
}
