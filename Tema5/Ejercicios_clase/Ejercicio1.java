package Tema5.Ejercicios_clase;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un numero entero: ");
    int nm1 = sc.nextInt();

         if (nm1  >=  0) {
            System.out.println(nm1 + " Es positivo ");
        } else {
            System.out.println(nm1 + " Es negativo");
        }

        sc.close();
        

    }
    
}
