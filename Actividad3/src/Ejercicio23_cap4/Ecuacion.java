/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio23_cap4;

public class Ecuacion {
    private double A, B, C;

    public Ecuacion(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double calcular_valor() {
        return Math.pow(B, 2) - (4 * A * C);
    }

    public String resolverEcuacion() {
        

        double valor = calcular_valor();

        if (valor > 0) {
            double x1 = (-B + Math.sqrt(valor)) / (2 * A);
            double x2 = (-B - Math.sqrt(valor)) / (2 * A);
            return "Los resultados son:" + x1 + " y " + x2;
        } else if (valor == 0) {
            double x =  -B/ (2 * A);
            return "La ecuacion tiene una solucion: " + x;
        } else {
            return "La ecuacion no tiene soluciones reales.";
        }
    }

    // Método principal de prueba
    public static void main(String[] args) {
        // Crear una instancia de la clase con valores de prueba
        Ecuacion ecuacion = new Ecuacion(1, -3, 2);

        // Resolver la ecuación y mostrar el resultado
        String resultado = ecuacion.resolverEcuacion();
        System.out.println(resultado);
    }
}
