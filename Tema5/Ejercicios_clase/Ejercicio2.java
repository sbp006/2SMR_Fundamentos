package Tema5.Ejercicios_clase;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca su edad: ");
        int edad = sc.nextInt();
       
        if (edad >= 18){

            System.out.print(" Eres mayor de edad, puedes entrar :) ");
        }
        else{
            System.out.println(" Eres menor de edad, no puedes entrar :( ");
        }
        sc.close();
    }
    
}
