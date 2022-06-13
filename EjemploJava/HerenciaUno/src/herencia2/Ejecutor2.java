
package herencia2;

import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        EstudiantePresencial estudiante = new EstudiantePresencial();
        
        System.out.println("Ingrese el nombre del estudiante: ");
        String nom = sc.nextLine();
        
        System.out.println("Ingrese el apellido: ");
        String ape = sc.nextLine();
        
        System.out.println("Ingrese la identificacion del estudiante: ");
        String id = sc.nextLine();
        
        System.out.println("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();
        
        System.out.println("Ingrese el número de creditos: ");
        int numCred = sc.nextInt();
        
        System.out.println("Ingrese el costo del credito: ");
        double costoCred = sc.nextDouble();
        
        estudiante.establecerNombresEstudiante(nom);
        estudiante.establecerApellidoEstudiante(ape);
        estudiante.establecerIdentificacionEstudiante(id);
        estudiante.establecerEdadEstudiante(edad);
        estudiante.establecerNumeroCreditos(numCred);
        estudiante.establecerCostoCredito(costoCred);
        estudiante.calcularMatriculaPresencial();
        
        System.out.printf("%s\n", estudiante);
        
    }
}
