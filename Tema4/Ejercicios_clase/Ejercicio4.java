package Tema4.Ejercicios_clase;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);
    
     System.out.print("Introduzca su letra: "); 
     char letra = sc.nextLine().charAt(0); 

    System.out.println("Tu letra es: " + (letra + 1));
     sc.close();
    }
    
}
