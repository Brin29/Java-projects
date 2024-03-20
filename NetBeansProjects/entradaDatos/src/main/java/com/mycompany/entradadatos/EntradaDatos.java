package com.mycompany.entradadatos;

import java.util.Scanner;

public class EntradaDatos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        /*
        
        System.out.print("Digite un numero: ");
        int numero = entrada.nextInt();
        
        System.out.print("Digite un numero: ");
        float decimal = entrada.nextFloat();
        
        System.out.print("Digite un numero: ");
        double largo = entrada.nextDouble();     
           
        */
        
        System.out.print("Digite una frase: ");
        String cadenaCaracter = entrada.nextLine();

        System.out.print("Digite una letra: ");
        char letra = entrada.next().charAt(0);
              
        //next = hasta el espacio - nextLine = toda la frase
       
        
        System.out.println("La palabra es: " + letra);
        System.out.println("La frase es: " + cadenaCaracter);
        
    }
}
