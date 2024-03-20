package com.mycompany.classmath;

public class ClassMath {

    public static void main(String[] args) {
        // Raiz Cuadrada
        double raiz = Math.sqrt(9);
        // Para numero enteros
        int raizEntera = (int)Math.sqrt(9);
        
        // Elevacion
        double base = 5, 
                exponente = 2;
        
        double resultado = Math.pow(base, exponente);
        
        // Redondear
        double numero = 4.56;
        
        // Para double se debe usar long
        long resultadoRedondeo = Math.round(numero);
        
        // Para float se debe usar int
        double numeroFlotante = 4.56f;
        int resultadoFlotanteRedondeado = (int)Math.round(numeroFlotante);
        
        double numeroRandom = Math.random();
        
        
        System.out.println("Raiz Decimal: " + raiz);      
        System.out.println("Raiz Entera: " + raizEntera);
        System.out.println("Elevacion: " + resultado);

    }
}
