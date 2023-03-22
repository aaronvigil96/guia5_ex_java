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
        
        double nota1, nota2, nota3, nota4, resultado;
        int desaprobados = 0;
        int aprobados = 0;
        
        double[] alumnos = new double[10];
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno: " + (i + 1));
            System.out.println("Nota de primer trabajo practico: ");
            nota1 = crearNota() * 0.1;
            System.out.println("Nota del segundo trabajo practico: ");
            nota2 = crearNota() * 0.15;
            System.out.println("Nota del primer integrador: ");
            nota3 = crearNota() * 0.25;
            System.out.println("Nota del segundo integrador: ");
            nota4 = crearNota()* 0.50;
            
            resultado = nota1 + nota2 + nota3 + nota4;
            
            alumnos[i] = resultado;
        }
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i] <= 6){
                desaprobados = desaprobados + 1;
            }else {
                aprobados = aprobados + 1;
            }
        }
        System.out.println("La cantidad de desaprobados son: " + desaprobados);
        System.out.println("La cantidad de aprobados son: " + aprobados);
        
    }
    public static double crearNota(){
        Scanner entrada = new Scanner(System.in);
        double nota;
        
        do{
            System.out.println("Ingresá una nota del 0 al 10");
            nota = entrada.nextDouble();
        }while(nota < 0 || nota > 10);
        
        return nota;
    }
}
