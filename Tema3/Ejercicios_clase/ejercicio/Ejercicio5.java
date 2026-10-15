package Tema3.Ejercicios_clase.ejercicio;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
         
          
        Scanner sc = new Scanner(System.in);
    
    System.out.print("Dime la base de tu rectangulo: "); 
    int base = sc.nextInt(); 

    System.out.print("Dime la altura rectangulo: "); 
    int altura = sc.nextInt(); 

    int area = base * altura;
    

    System.out.println("El Area es  " +area);
    sc.close();
    }
}
