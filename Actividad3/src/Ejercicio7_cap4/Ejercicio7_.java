/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7_cap4;

import java.util.Scanner;


public class Ejercicio7_ {
    public static void main(String[] args) {
        double a, b;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del numero a : ");
        a = entrada.nextInt();
        
        System.out.println("Ingrese el valor del numero b : ");
        b = entrada.nextInt();
        
        if (a>b){
        System.out.println(a + " es mayor que " + b);
        }
        else if (a==b){
        System.out.println(a + " es igual que " + b);
        }
        else {
        System.out.println(a + " es menor que " + b);
        }
        
        
        
    }
    
}
