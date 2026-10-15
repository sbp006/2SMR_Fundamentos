package Tema3.Ejercicios_clase.ejercicio;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Cual es su edad: "); 
     int Edad = sc.nextInt(); 
     sc.nextLine();
     int edad5 = Edad + 5;

     System.out.println("Hola, dentro de 5 años tendra " + edad5);
    }
    
}
