/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio18_cap3;


public class Empleado {
    double retencion;
    double horastra, valhor, porce_retencion, salbru;
    
    
    public static double calcular_retencion(double salbru, double porce_retencion ){
            return salbru*(porce_retencion/100);
        }
    
    public static double calcular_salario_bruto(double horastra, double valhor ){
            return horastra*valhor;
        }
    public static double calcular_salario_neto(double salbru, double retencion ){
            return salbru - retencion;
        }
    
    
}
