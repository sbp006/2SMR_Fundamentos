package Tema4.Casos_practicos;

public class cp3 {
    public static void main(String[] args) {
          int edad = 15;
        boolean vaConAdulto = true;
        boolean tieneEntrada = false;

        boolean puedeEntrar = edad >= 18 || vaConAdulto;
        boolean puedeSentarse = puedeEntrar && tieneEntrada;

        System.out.println("Puede entrar: " + puedeEntrar);
        System.out.println("Puede sentarse: " + puedeSentarse);
        System.out.println("No tiene entrada: " + !tieneEntrada);

    //Puede entrar: true (Por que va con un adulto, pero no tiene 18 pero al ser (||) significa que una es verdadera)
    //Puede sentarse: false (Por que no tiene entrada, pero no va con un adulto y (&&) obliga a que sean 2 true)
    //No tiene entrada: true (Por que tiene una ! delante y cambia su valor era false pero al tener ! cambia a tue)
    
    }
    
}
