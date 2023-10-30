package PARTE_2;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2;
        double resultado;
        
        System.out.println("Introduce dos numeros para calcular su división: ");
        System.out.print("Introduce el primer número: ");
        numero1 = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        numero2 = teclado.nextInt();
        
        resultado = numero1 / numero2;
        
        System.out.println("El resultado de la división es: " + resultado);
    }
    
}
