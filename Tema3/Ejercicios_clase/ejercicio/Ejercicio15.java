package Tema3.Ejercicios_clase.ejercicio;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
    
    System.out.print("Edad: "); 
     int Edad = sc.nextInt(); 
     sc.nextLine();

     System.out.print("Nombre: "); 
     String nombre = sc.nextLine(); 

     System.out.println("Hola, " +nombre+ " tienes " +Edad+ " años");

    sc.close();
    }
    
}
