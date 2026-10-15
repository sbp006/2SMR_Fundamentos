package Tema3.Ejercicios_clase.ejercicio;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
     System.out.print("Ponga su primera nota: "); 
     double nota1 = sc.nextDouble(); 

     System.out.print("Ponga su segunda nota: "); 
     double nota2 = sc.nextDouble(); 

     System.out.print("Ponga su tercera nota: "); 
     double nota3 = sc.nextDouble(); 

     double media = nota1 + nota2 + nota3;

     System.out.println("La media de sus tres notas es: " +media/3);
     sc.close();
     
    }
    
}
