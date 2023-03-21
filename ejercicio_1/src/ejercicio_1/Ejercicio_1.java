/*
    Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
*/
package ejercicio_1;
import java.util.Scanner;


public class Ejercicio_1 {

    public static void main(String[] args) {
        int longitud, numero;
        int cantidad = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresá la longitud del vector");
        longitud = entrada.nextInt();
        int[] vector = new int[longitud];
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingresá un numero: ");
            numero = entrada.nextInt();
            cantidad = cantidad + numero;
        }
        System.out.println("La suma de todos los numeros da: " + cantidad);
    }
    
}
