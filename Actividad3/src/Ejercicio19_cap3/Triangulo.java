/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio19_cap3;

/**
 *
 * @author restr
 */
public class Triangulo {
    double lado;
    
    public static double calcular_altura(double lado){
        return (lado * Math.sqrt(3))/2;
    }
    public static double calcular_perimetro(double lado){
        return lado*3;
    }
    
    public static double calcular_area(double lado){
        return Math.pow(lado,2)*(Math.sqrt(3)/4);
    }
    
    
    
    
    
    
}
