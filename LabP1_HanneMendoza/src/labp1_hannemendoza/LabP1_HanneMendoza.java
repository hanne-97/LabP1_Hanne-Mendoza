/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labp1_hannemendoza;

import java.util.Scanner;
public class LabP1_HanneMendoza {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 2;
        char character = 'a';
        double doble = 1.25;
        boolean VoF = true;
        System.out.println("Elija el ejercicio:");
        numero = sc.nextInt();
        
        if (numero ==1){
            int num1 = 15;
            int num2 = 30;
            int resultado;
            resultado = 15*30;
            System.out.print("Resultado: ");
            System.out.println(resultado);
            
        }else if(numero ==2){
            System.out.println("Ingrese un número entero: ");
            int numeroUsuario1 = sc.nextInt();
            System.out.println("Ingrese un número entero: ");
            int numeroUsuario2 = sc.nextInt();
            System.out.println("Ingrese un número entero: ");
            int numeroUsuario3 = sc.nextInt();
            
            double promedio =  (numeroUsuario1 + numeroUsuario2 + numeroUsuario3)/3;
            
            System.out.println("Promedio: " + promedio);
            
        }else{
            System.out.println("Salio del programa.");
        }
        
    }
    
}
