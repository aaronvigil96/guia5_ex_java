/*
    Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
    Después haremos otra función o procedimiento que imprima el vector.
*/
package ejercicio_3;

public class Ejercicio_3 {

    public static void main(String[] args) {
        int[] vector = new int[5];
        for (int i = 0; i < vector.length; i++) {
            if(i <= 1){
                vector[i] = 1;
            }else{
                vector[i] = vector[i - 1] + vector[i - 2];
            }
            System.out.println(vector[i]);
        }
    }
    
}
