
package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        /*
        En el método **main**, se debe permitir ingresar objetos 
        de tipo Estudiante Distancia y Estudiante Presencial. 
        Uno a la vez. Si el usuario ingresa 1, se debe crear un 
        Estudiante Distancia por teclado; si ingresa 2, se debe crear un 
        Estudiante Presencial. Los datos de entrada serán ingresados por 
        teclado.

        Restricciones:
        * En el código solo debe usar por una sola ocasión la siguiente 
        sentencias
        ```
            nombres = sc.nextLine()
            apellidos = sc.nextLine()
            id = sc.nextLine()
            edad = sc.nextInt()
        ```
        * Si el usuario ingresa algo diferente de 1 o 2; el programa debe 
        presentar un mensaje que diga: "Error, opción no válida."
        
        */
        
        System.out.println("Estudiante Distancia   [1]");
        System.out.println("Estudiante Presencial  [2]");
        System.out.println("\nIngrese la opcion que deseee: ");
        int op = sc.nextInt();
        
        if(op < 1 || op > 2){
            System.out.println("Error, opción no válida.");
        }else{
            sc.nextLine();
            System.out.println("Ingrese el nombre del estudiante: ");
            String nom = sc.nextLine();

            System.out.println("Ingrese el apellido: ");
            String ape = sc.nextLine();

            System.out.println("Ingrese la identificacion del estudiante: ");
            String id = sc.nextLine();

            System.out.println("Ingrese la edad del estudiante: ");
            int edad = sc.nextInt();
                    
            switch(op){
                case 1:
                    EstudianteDistancia estudiante = new EstudianteDistancia();
                    
                    System.out.println("Ingrese el número de asignaturas: ");
                    int numAsig = sc.nextInt();

                    System.out.println("Ingrese el costo por asignatura: ");
                    double costoAsig = sc.nextDouble();
                    
                    estudiante.establecerNombresEstudiante(nom);
                    estudiante.establecerApellidoEstudiante(ape);
                    estudiante.establecerIdentificacionEstudiante(id);
                    estudiante.establecerEdadEstudiante(edad);
                    estudiante.establecerNumeroAsginaturas(numAsig);
                    estudiante.establecerCostoAsignatura(costoAsig);
                    estudiante.calcularMatriculaDistancia();
                    
                    System.out.printf("%s\n", estudiante);
                    break;
                case 2: 
                    EstudiantePresencial estudiante2 = new EstudiantePresencial();

                    System.out.println("Ingrese el número de creditos: ");
                    int numCred = sc.nextInt();

                    System.out.println("Ingrese el costo del credito: ");
                    double costoCred = sc.nextDouble();
                    
                    estudiante2.establecerNombresEstudiante(nom);
                    estudiante2.establecerApellidoEstudiante(ape);
                    estudiante2.establecerIdentificacionEstudiante(id);
                    estudiante2.establecerEdadEstudiante(edad);
                    estudiante2.establecerNumeroCreditos(numCred);
                    estudiante2.establecerCostoCredito(costoCred);
                    estudiante2.calcularMatriculaPresencial();

                    System.out.printf("%s\n", estudiante2);
                    break;
            } 

        }

        
        
    }
}
