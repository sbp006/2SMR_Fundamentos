package Tema3.Ejercicios_clase;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
    
    System.out.print("Dime un numero: "); 
    int num1 = sc.nextInt(); 

    System.out.print("Dime otro numero: "); 
    int num2 = sc.nextInt(); 

    int suma = num1 + num2;
    int resta = num1 - num2;
    int division = num1 / num2;
    int multiplicacion = num1 * num2;

    System.out.println("La suma es  " +suma);
    System.out.println("La resta es  " +resta);
    System.out.println("La multiplicacion es  " +multiplicacion);
    System.out.println("La division es  " +division);
    sc.close();
    }
    
}
