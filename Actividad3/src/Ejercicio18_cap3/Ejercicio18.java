/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio18_cap3;
import java.util.Scanner;



public class Ejercicio18 {

    public static void main(String[] args) {
        double codigo, retencion;
        double horastra, valhor, porce_retencion, salbru, salnet;
        String nombre;
        
        Scanner entrada = new Scanner(System.in);

        
        System.out.println("A continuacion ingrese los siguientes datos del empleado: ");
        System.out.println("Codigo: ");
        codigo = entrada.nextInt();

        System.out.println("Nombre: ");
        nombre = entrada.next();

        System.out.println("Numero de horas trabajadas al mes: ");
        horastra = entrada.nextDouble();

        System.out.println("Valor hora trabajada: ");
        valhor = entrada.nextDouble();
        
        System.out.println("Porcentaje de retencion en la fuente: ");
        porce_retencion = entrada.nextDouble();
        
        salbru = Empleado.calcular_salario_bruto(horastra, valhor);
        retencion = Empleado.calcular_retencion(salbru, porce_retencion);
        salnet = Empleado.calcular_salario_neto(salbru, retencion);

        
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("El salario neto es: " + salnet);
        System.out.println("El salatio bruto es: " + salbru);       
    }
    
}
