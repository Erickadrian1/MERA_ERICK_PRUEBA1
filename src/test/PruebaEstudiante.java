
package test;

import dominio.Estudiante;
import java.util.Scanner;

public class PruebaEstudiante {
    static Scanner datos = new Scanner(System.in);
    public static void main(String[] args){
 
        Estudiante[] estudiantes;
        int n = 3;
        estudiantes = new Estudiante[n];
        llenarDatos(estudiantes);
        System.out.println("Datos almacendos");
        for(int i=0;i<estudiantes.length;i++){
            System.out.println(estudiantes[i]);
    }
    }
    public static void llenarDatos(Estudiante est[]){
           String nombre;
        
        double nota;
        for(int i=0;i<est.length;i++){
            System.out.println("Nombre : ");
            nombre = datos.nextLine();
            System.out.println("Sexo ");
           
            System.out.println("Nota : ");
            nota= datos.nextDouble();
            est[i]= new Estudiante(nombre,nota);
            //limpia el buffer
            datos.nextLine();
        }
       
    }
    
}
