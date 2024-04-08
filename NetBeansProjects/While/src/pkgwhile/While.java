package pkgwhile;

import javax.swing.JOptionPane;

public class While {

    public static void main(String[] args) {
        
        String contraseña = JOptionPane.showInputDialog("Ingrese su contraseña nueva:");
        String validarContraseña = "";
        
        while (contraseña.equals(validarContraseña)==false){
            validarContraseña = JOptionPane.showInputDialog("Ingrese nuevamente la contraseña:");
                    
            if (contraseña.equals(validarContraseña)== false){
                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta ❌");
            }
            
            else{
             JOptionPane.showMessageDialog(null, "Contraseña Exitosa ✅");   
            }
        }
    }
}
