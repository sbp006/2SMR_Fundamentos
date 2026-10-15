package Tema3.Ejercicios_clase.ejercicio;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
         
      Scanner sc = new Scanner(System.in);
    System.out.print("Dime tu numero: "); 
    int num = sc.nextInt(); 

    System.out.println("Hola, tu numero es " +num);
    sc.close();
    }
    
}
