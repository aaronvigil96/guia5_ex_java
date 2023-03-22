/*
    Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 
    alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno 
    obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
    Primer trabajo práctico evaluativo 10%
    Segundo trabajo práctico evaluativo 15%
    Primer Integrador 25%
    Segundo integrador 50%
    Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
    Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
    teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

*/
package ejercicio_4;
import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4;
        Scanner entrada = new Scanner(System.in);
        int[] alumnos = new int[10];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingresá la nota del alumno " + alumnos[i]);
            System.out.println("Primer trabajo practico evaluativo");
            nota1 = entrada.nextDouble();
            System.out.println("Segundo trabajo practico evaluativo");
            nota2 = entrada.nextDouble();
            System.out.println("Primer integrador");
            nota3 = entrada.nextDouble();
            System.out.println("Segundo integrador");
            nota4 = entrada.nextDouble();
        }
    }
    
}
