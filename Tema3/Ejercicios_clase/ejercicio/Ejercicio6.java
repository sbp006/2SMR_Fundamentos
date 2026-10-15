package Tema3.Ejercicios_clase.ejercicio;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);
    
    System.out.print("Dime la base de tu Triangulo: "); 
    int base = sc.nextInt(); 

    System.out.print("Dime la altura Triangulo: "); 
    int altura = sc.nextInt(); 

    int area = (base * altura/2);
    

    System.out.println("El Area es  " +(double)area);
    sc.close();
    }
    
}
