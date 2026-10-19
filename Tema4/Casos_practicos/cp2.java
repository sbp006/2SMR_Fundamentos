

//Un alumno quiere mostrar la letra siguiente a 'A' (es decir, B), 
// pero el programa muestra 66. ¿Por qué? ¿Cómo se arregla?

package Tema4.Casos_practicos;

public class cp2 {
    public static void main(String[] args) {
        
        //Con un char asignamos a letra (A)
        char letra = 'A';
        
       //Lo harreglamos poniendo delante de l + 1 un char, 
       // pero tenemos que meter el char y el letra + 1 dentro de un mismo parentesis
       
       //Lo que hacemos es crear un print que imprima un (char), 
       // y posteriormente sumamos el char que creamos que es letra 
       // y le sumamos un 1 entonces A + 1 = a B si es mas 2 = C y asi.
       System.out.println((char) (letra + 1));   
    }
    
}
