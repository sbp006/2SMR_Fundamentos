package Tema3.Apuntes;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
         //Scaners ejemplos
    Scanner sc = new Scanner(System.in); //Crea el objeto Scanner, para interactuar con el usuario
    System.out.println("Dime tu nombre: "); //Creamos el print para el comentario
    String nombre = sc.nextLine(); //Creamos la variable nombre y selecionamos el sc.nextline
    System.out.println("Hola " +nombre); //finalizamos la interación con el usuario

   } 
}
