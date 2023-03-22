/*
    Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
*/
package ejercicio_5;

public class Ejercicio_5 {

    public static void main(String[] args) {
        int resultado = 0;
        int[][] matriz = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int)(Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
                resultado = resultado + matriz[i][j];
            }
        }
        System.out.println("");
        System.out.println(resultado);
    }
    
}
