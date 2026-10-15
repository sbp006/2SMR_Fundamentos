package Tema3.Ejercicios_clase.ejercicio;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
    
  
     System.out.print("Ponga aqui su numero: "); 
     int numero = sc.nextInt(); 
     sc.nextLine();

     int doble = numero * 2;
     int triple = numero * 3;

     System.out.println("El doble de " +numero+ " es " +doble);
     System.out.println("El triple de " +numero+ " es " +triple);
     sc.close();
    }
}
