package Tema3.Ejercicios_clase.ejercicio;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
    System.out.print("Ponga aqui su cantidad en euros: "); 
    double euros = sc.nextDouble(); 

    final double cambio = 1.10;

    double dolares = euros * cambio;
    System.out.println(+euros+ " euros son " + dolares);
    
   sc.close();
   
    }
}
