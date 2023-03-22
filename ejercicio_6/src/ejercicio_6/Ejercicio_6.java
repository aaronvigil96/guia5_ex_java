/*
    Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando,
    construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria.
    Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
    Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
*/
package ejercicio_6;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int contadorLetra = 0;
        String[][] matriz = new String[20][20];
        String palabra, letra;
        
        do{
            do{ 
                System.out.println("Ingresa una palabra que sea de maximo 5 caracteres y minimo 3");
                palabra = entrada.nextLine();
            }while(palabra.length() < 3 || palabra.length() > 5);
           
           
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if(matriz[i][j] == null && contadorLetra < palabra.length()){ 
                        letra = palabra.substring(contadorLetra, contadorLetra + 1);
                        matriz[i][j] = letra;
                        contadorLetra += 1;
                    }
                }
                contadorLetra = 0;
            }
            
            for (int i = 0; i < matriz.length; i++) {
                System.out.println("");
                for (int j = 0; j < matriz.length; j++) {
                    System.out.println("["+i+"]"+"["+j+"]: "+ matriz[i][j]);
                }
            }
            contador += 1;
        }while(contador < 5);
        
    }
    
}
