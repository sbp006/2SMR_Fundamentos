package Tema3.Ejercicios_clase.ejercicio;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
    
        final double pi = 3.14159;
   
    System.out.print("Dime el radio de tu Circulo: "); 
    double radio = sc.nextDouble();  
    
    double area = pi * radio;
    
    System.out.print("Area:" + area);
    
    sc.close(); 
    }
    
}
