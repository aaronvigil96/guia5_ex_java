/*
    Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
    Después haremos otra función o procedimiento que imprima el vector.
*/
package ejercicio_3;
import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bucle = true;
        int opcion, longitud;
        System.out.println("Ingresa la longitud del vector");
        longitud = entrada.nextInt();
        int[] vector = new int [longitud];
        do{
            System.out.println("¿Que desea hacer?");
            System.out.println("1)- Llenar vector");
            System.out.println("2)- Mostrar vector");
            System.out.println("0)- Salir");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: {
                    llenarVector(vector);
                    break;
                }
                case 2: {
                    mostrarVector(vector);
                    break;
                }
                case 0: {
                    bucle = false;
                    break;
                }
            }
        }while(bucle);
    }
    public static void llenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 10);
        }
    }
    public static void mostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
    
}
