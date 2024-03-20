package com.mycompany.salariosemanal;

import java.util.Scanner;

public class SalarioSemanal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite las horas trabajadas: ");
        int hoursWorked = input.nextInt();
        
        System.out.print("Digite el valor del salario por hora: ");
        int salaryPerHours = input.nextInt();
        
        int weeklySalary = hoursWorked * salaryPerHours;
        
        System.out.println("El salario semanal del empleado es: " + weeklySalary);
    }
}
