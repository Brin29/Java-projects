package com.mycompany.salariosemanal2;

import javax.swing.JOptionPane;

public class SalarioSemanal2 {

    public static void main(String[] args) {
        Integer salaryPerHours = Integer.parseInt(JOptionPane.showInputDialog("Digite el salario por hora: "));
        Integer workedHours = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas del empleado: "));
        
        int weeklySalary = salaryPerHours * workedHours;
        
        JOptionPane.showMessageDialog(null, "El salario semanal del empleado es: " + weeklySalary);
        
    }
}
