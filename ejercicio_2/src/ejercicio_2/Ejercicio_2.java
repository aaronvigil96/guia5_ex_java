/*
    Escriba un programa que averigüe si dos vectores de N enteros son iguales
    (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
*/
package ejercicio_2;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int longitud;
        System.out.println("Ingresá la longitud de los vectores");
        longitud = entrada.nextInt();
        int[] vectorA = new int[longitud];
        int[] vectorB = new int[longitud];
        System.out.print("vectorA: ");
        llenarVector(vectorA);
        System.out.print("vectorB: ");
        llenarVector(vectorB);
        compararVector(vectorA, vectorB);
    }
    public static void llenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 1 + 1);
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }
    public static void compararVector(int[] vectorA, int[] vectorB){
        boolean iguales = true;
        for (int i = 0; i < vectorA.length; i++) {
            if(vectorA[i] != vectorB[i]){
                System.out.println("Se encontró una diferencia en la posición: " + (i + 1));
                iguales = false;
                break;
            }
        }
        if(iguales){
            System.out.println("Felicitaciones, son iguales.");
        }
    }
}
