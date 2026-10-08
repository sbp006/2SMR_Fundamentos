package Tema3.Apuntes;

import java.util.Scanner;
        //Segundo ejemplo de Scaner
public class Ejemplo2 {  
    public static void main(String[] args) { //Como siempre abrimos el public
        Scanner sc = new Scanner(System.in); //Creamos el escaner para posteriormente interactuar con el user (Dato: En este caso creamos el Scaner con el nombre sc pero podriamos poner el nombre  que queramos, solo que tambien podriamos ese nombre en los demas datos como en una variable que este el scaner)
        System.out.print("Nombre: "); //Creamos el primer Texto que nos dara el script con un print
        String nombre = sc.nextLine(); //Creamos la variable nombre en la que podremos dar nuestro nombre
        

        System.out.print("Edad: "); //Creamos el segundo texto que nos da el Script
        int edad = sc.nextInt(); //Creamos la variable edad como es un numero entero ponemos un int a la derecha del netx
        sc.nextLine(); //Siempre que pongamos una varible decimal o entera y dentro de esa variable entera o decimal haya un next debajo pondremos "sc.nextLine();"

        System.out.print("Dime tu inicial");
        char inicial = sc.nextLine().charAt(0);
       
        System.out.println("Hola, " +nombre+ " Tienes " +edad+ " añosS"); //Finalizamos con el resultado que nos dara el Script al scribir los datos
        System.out.println("Tu inicial es: " +inicial);
    }
}
