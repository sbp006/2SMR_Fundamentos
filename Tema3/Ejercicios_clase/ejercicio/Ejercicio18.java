package Tema3.Ejercicios_clase.ejercicio;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
     System.out.print("Minutos: "); 
     int numero = sc.nextInt(); 
     sc.nextLine();

     final int minuto = 60;

     int cambio = numero * minuto;

     System.out.println(+numero+ " minuto/s son " + cambio + " segundos");
     sc.close();
     
    }
    
}
