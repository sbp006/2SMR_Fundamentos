package Tema3.Ejercicios_clase.ejercicio;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce la cantidad en euros: "); 
    double euros = sc.nextDouble(); 

    final double cambio = 166.386;
    double pesetas = euros * cambio;
    System.out.println(euros+ " euros son " +pesetas + (" pesetas"));
    sc.close();
    }
    
}
