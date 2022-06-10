/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Edificio;
import paquete1.Empresa;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio Central");
        edf1.establecerCosto(20000);
        //System.out.println(edf1);
        Edificio edf2 = new Edificio("Edificio Norte");
        edf2.establecerCosto(30000);
        
        Edificio edf3 = new Edificio("Edificio Sur");
        edf3.establecerCosto(10000);
        
        Edificio edf4 = new Edificio("Edificio Secundario");
        edf4.establecerCosto(5000);
        
//        Edificio[] edificios = new Edificio[4];
//        edificios[0] = edf1;
//        edificios[1] = edf2;
//        edificios[3] = edf3;
//        edificios[3] = edf4;

        Edificio[] edificios = {edf1, edf2, edf3, edf4};
        
        // Crear un objeto de tipo Empresa:
        Empresa miEmpresa = new Empresa();
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        miEmpresa.establecerNombre("Empresa de Hojas");
        miEmpresa.establecerEdificios(edificios);
        miEmpresa.establecerCostoBienesInmuebles();
        
        // Imprimir el costo de los bienes inmuebles de la empresa
        //System.out.printf("%.2f\n", miEmpresa.obtenerCostoBienesInmuebles());
        
        System.out.println(miEmpresa);
    }
}
