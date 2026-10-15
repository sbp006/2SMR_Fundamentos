package Tema3.Ejercicios_clase.ejercicio;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
    
     System.out.print("Introduzca su letra: "); 
     char letra = sc.nextLine().charAt(0); 

    System.out.println("Tu letra es: " +letra);
     sc.close();
    }
}
