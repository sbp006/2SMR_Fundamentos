package Tema4.Casos_practicos;

public class cp1 {
    public static void main(String[] args) {
      
        //Esto es un double normal
        double nota = 9.75;
        
        //Como lo intentamos redondear  lo hacemoss con double si queremos con decimales si no un long 
        // ,el nombre de la variable y Math.round(nota) que es la parte importante para que rendoden
        double notaRedondeada = Math.round(nota); 
        
        //pinrt para imprimir en pantalla
        System.out.println(notaRedondeada);
    }
}
