package adivinanumero;

import javax.swing.JOptionPane;

public class AdivinaNumero {

    public static void main(String[] args) {
        
        int numero = (int) Math.floor(Math.random() * 50), 
            intentos = 10;
        
        Integer numeroAux = 0;
        
        JOptionPane.showMessageDialog(null, "Juego de adivina el numero");
        
        while (numero != numeroAux && intentos !=  0){
            numeroAux = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero del 1 al 50"));
            
            if (numero == numeroAux){
                JOptionPane.showMessageDialog(null, "El numero ingresado es correcto");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero ingresado es incorrecto");
                
                if (numeroAux > numero){
                    JOptionPane.showMessageDialog(null, "La respuesta es un numero mas pequeño");
                }
                
                if (numeroAux < numero){
                    JOptionPane.showMessageDialog(null, "La respuesta es un numero mas grande");
                }
                
                intentos --;
                
                if (intentos == 0){
                    JOptionPane.showMessageDialog(null, "Lo sentimos, te quedaste sin intentos");
                }
                
                else{
                    JOptionPane.showMessageDialog(null, "Intentos disponibles " + intentos);
                }
            }
        }
    }
    
}
