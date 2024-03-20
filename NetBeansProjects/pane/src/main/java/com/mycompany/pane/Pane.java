package com.mycompany.pane;

import javax.swing.JOptionPane;

public class Pane {

    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimalLargo;
        float decimal;
        
        // cadena de caracteres
        cadena = JOptionPane.showInputDialog("Digite una palabra");
        
        //enteros se transforma con la clase Integer y parseInt lo parsea a entero
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        // charAt tome la letra JOptionPane es un string hereda las atributos y metodos de un string
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
       
        // Double.parseDouble para double
        decimalLargo = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero decimal largo: "));
        
        decimal = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero decimal: "));
        
        JOptionPane.showMessageDialog(null, "El valor de la palabra es: " + cadena);
        JOptionPane.showMessageDialog(null, "El valor del numero es: " + entero);
        JOptionPane.showMessageDialog(null, "El valor de la letra es: " + letra);
        JOptionPane.showMessageDialog(null, "El valor del decimal largo es: " + decimalLargo);
        JOptionPane.showMessageDialog(null, "El valor del decimal es: " + decimal);

        
    }
}
