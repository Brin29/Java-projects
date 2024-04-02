package clasemath;

import javax.swing.JOptionPane;

public class ClaseMath {

    public static void main(String[] args) {
        
        // Math.sqrt = raiz cuadrada solo doubles
        
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de un numero para calcular su raiz: ")); 
        double raiz = Math.sqrt(numero);
        
        JOptionPane.showMessageDialog(null, "La raiz cuadrada del numero " + numero +  " es: " +  raiz);
        
        // Math.round = redondear un numero decimal
        
        float numeroFlotante = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor de un numero decimal:" ));
        
        int redondeo = Math.round(numeroFlotante);
        
        JOptionPane.showMessageDialog(null, "El numero redondeado es: " + redondeo);
        
        
        //En caso de que sea un numero Long
        //Se usa la refundicion para asignar el valor qie queremos  (int)
        double numeroDouble = 10;
        
        int redondeoDouble = (int)Math.round(numeroDouble);
    
        // Math.pow = Elevar un numero a una potencia
        
        double base = 10, potencia = 2;
        
        int elevacion = (int)Math.pow(base, potencia);
        
    }
    
}
