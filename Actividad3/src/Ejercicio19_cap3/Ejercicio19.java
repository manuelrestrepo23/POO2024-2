/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio19_cap3;

import java.util.Scanner;

/**
 *
 * @author restr
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        double lado,altura,perimetro,area;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Imprima el lado del triangulo equilatero: ");
        lado = entrada.nextInt();
        
        altura = Triangulo.calcular_altura(lado);
        perimetro = Triangulo.calcular_perimetro(lado);
        area = Triangulo.calcular_area(lado);
        
        System.out.println("La altura es: " + altura);
        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El area es: " + area);
        

        

    
}
}