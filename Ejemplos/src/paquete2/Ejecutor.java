/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

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
        //Arreglo de tipo Vehiculo
        Vehiculo v1 = new Vehiculo("Auto", "LBB0011", 10000);
        Vehiculo v2 = new Vehiculo("Camioneta", "LCB0011", 20000);
        Vehiculo v3 = new Vehiculo("Auto", "LBD0012", 6000);
        Vehiculo v4 = new Vehiculo("Camioneta", "LCC0011", 10000);
        Vehiculo v5 = new Vehiculo("Camioneta", "LDC0011", 25000);
        
        Vehiculo[] vehiculos = {v1, v2, v3, v4, v5};
        
        // Crear un objeto de tipo Empresa:
        Empresa miEmpresa = new Empresa();
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        miEmpresa.establecerNombre("Empresa de Hojas");
        miEmpresa.establecerEdificios(edificios);
        miEmpresa.establecerVehiculos(vehiculos);
        miEmpresa.establecerCostoBienesInmuebles();
        miEmpresa.establecerCostoVehiculos();
        miEmpresa.establecerCostoTotalBienes();
        // Imprimir el costo de los bienes inmuebles de la empresa
        //System.out.printf("%.2f\n", miEmpresa.obtenerCostoBienesInmuebles());

        System.out.println(miEmpresa);
    }
}
