
package herencia2;

import herencia1.EstudianteDistancia;

public class Ejecutor {

    public static void main(String[] args) {
        
        EstudianteDistancia estudiante = new EstudianteDistancia();
        estudiante.establecerNombresEstudiante("Pablo");
        estudiante.establecerApellidoEstudiante("Ramón");
        estudiante.establecerIdentificacionEstudiante("1150632022");
        estudiante.establecerEdadEstudiante(18);
        estudiante.establecerCostoAsignatura(300);
        estudiante.establecerNumeroAsginaturas(5);
        estudiante.calcularMatriculaDistancia();
        
//        System.out.printf("%s - (%.2f)\n", 
//                estudiante.obtenerApellidoEstudiante(),
//                estudiante.obtenerMatriculaDistancia());

        System.out.printf("%s\n", estudiante);
    }
}
