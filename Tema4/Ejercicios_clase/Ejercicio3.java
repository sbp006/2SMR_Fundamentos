package Tema4.Ejercicios_clase;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
    
     System.out.print("Ponga su primer numero: "); 
     int numero1 = sc.nextInt(); 

     System.out.print("Ponga su segundo numero: "); 
     int numero2 = sc.nextInt(); 

     

     double media = numero1 + numero2 ;

     System.out.println("La media de su dos numeros es : " +media/2);
     sc.close();
    }
    
}
