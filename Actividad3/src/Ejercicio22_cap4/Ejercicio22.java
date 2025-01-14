/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio22_cap4;
import java.util.Scanner;


public class Ejercicio22 {
    public static void main(String[] args) {
        String NOM;
        double salhora,numhoras, salariototal;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado: ");
        NOM = entrada.next();
        System.out.println("Ingrese el salario basico por hora del empleado: ");
        salhora = entrada.nextDouble();
        System.out.println("Ingrese el numero de horas trabajadas al mes del empleado: ");
        numhoras = entrada.nextDouble();
        
        salariototal = salhora * numhoras;
        
        if (salariototal>450000){
        System.out.println("Nombre del empleado:" + NOM);
        System.out.println("salario men del empleado:" + salariototal);
        }
        else {
        System.out.println("Nombre del empleado:" + NOM);
        }
        
        
        
        
        
    }
}
