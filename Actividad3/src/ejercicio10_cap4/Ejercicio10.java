/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10_cap4;
import java.util.Scanner;



public class Ejercicio10 {
    public static void main(String[] args) {
        int NI, ES;
        String NOM, APELL;
        double PAT, PAGO;
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de inscripcion del estudiante : ");
        NI = entrada.nextInt();
        System.out.println("Ingrese el nombre del estudiante : ");
        NOM = entrada.next();
        System.out.println("Ingrese el apellido del estudiante : ");
        APELL = entrada.next();
        System.out.println("Ingrese el patrimonio del estudiante : ");
        PAT = entrada.nextDouble();
        System.out.println("Ingrese el estrato social del estudiante : ");
        ES = entrada.nextInt();
        
        if((PAT>2000000) && (ES>3)){
            PAGO = Estudiante.obtener_pago(PAT);
    }
        else{ 
            PAGO = 50000;
        }
        
        System.out.println("El estudiante con numero de inscripcion: " + NI + " y nombre "+NOM+" " + APELL+" debe pagar:" +PAGO);
        
    }
}
