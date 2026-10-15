package Tema3.Ejercicios_clase;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
    
    System.out.print("Dime un numero: "); 
    int num1 = sc.nextInt(); 

    System.out.print("Dime otro numero: "); 
    int num2 = sc.nextInt(); 

    int suma = num1 + num2;

    System.out.println("Hola, la suma es  " +suma);
    sc.close();
    }
    
}
