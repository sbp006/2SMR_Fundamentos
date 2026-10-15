package Tema3.Ejercicios_clase.ejercicio;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce la baseImponible: "); 
    double baseImponible = sc.nextDouble(); 

    final double IVA = 0.21;
    double cantidadIva= baseImponible*IVA;
    double totalfactura = baseImponible + cantidadIva;
    System.out.println("IVA: " +cantidadIva);
    System.out.println("Total: " +totalfactura);

    sc.close();
    }
    
}
