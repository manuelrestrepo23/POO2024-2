/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio23_cap4;
import java.util.Scanner;


public class Ejercicio23 {
        public static void main(String[] args) {
            double A,B,C;
            
            Scanner entrada = new Scanner(System.in);
        
            System.out.println("Escriba el valor de A: ");
            A = entrada.nextDouble();
            System.out.println("Escriba el valor de B: ");
            B = entrada.nextDouble();
            System.out.println("Escriba el valor de C: ");
            C = entrada.nextDouble();
            
            Ecuacion ecuacion = new Ecuacion(A, B, C);

            String resultado = ecuacion.resolverEcuacion();
            System.out.println(resultado);
        }
}