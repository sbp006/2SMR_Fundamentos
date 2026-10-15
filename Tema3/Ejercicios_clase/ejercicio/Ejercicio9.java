package Tema3.Ejercicios_clase.ejercicio;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce la cantidad en pesetas: "); 
    double pesetas = sc.nextDouble(); 

    final double cambio = 166.386;
    
    double euros  = pesetas / cambio;
    System.out.println("Son " +euros+ (" Euros"));
    sc.close();  
    }
    
}
