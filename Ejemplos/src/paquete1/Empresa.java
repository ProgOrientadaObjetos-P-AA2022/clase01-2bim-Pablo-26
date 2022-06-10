/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {
    private String nombre;
    private Edificio[] edificios;
    private Vehiculo[] vehiculos;
    private double costoBienesInmuebles;
    private double costoVehiculos;
    private double costoTotalBienes;
    
//    public Empresa(String nom, Edificio[] lista){
//        nombre = nom;
//        edificios = lista;
//    }
    
    public void establecerNombre(String m){
        nombre = m;
    }
    
    public void establecerEdificios(Edificio[] m){
        edificios = m;
    }
    
    public void establecerVehiculos(Vehiculo[] m){
        vehiculos = m;
    }
    
    public void establecerCostoBienesInmuebles(){
        double suma = 0;
        for(int i = 0; i < obtenerEdificios().length; i++){
            suma += obtenerEdificios()[i].obtenerCosto();
        }
        costoBienesInmuebles = suma;
    }
    
    public void establecerCostoVehiculos(){
        double suma = 0;
        for(int i = 0; i < obtenerVehiculos().length; i++){
            suma += obtenerVehiculos()[i].obtenerValor();
        }
        costoVehiculos = suma;
    }
    
    public void establecerCostoTotalBienes(){
        costoTotalBienes = obtenerCostoBienesInmuebles() + 
                obtenerCostoVehiculos();
    }
            
            
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public Edificio[] obtenerEdificios(){
        return edificios;
    }
    
    public Vehiculo[] obtenerVehiculos(){
        return vehiculos;
    }
    
    public double obtenerCostoBienesInmuebles(){
        return costoBienesInmuebles;
    }
    
    public double obtenerCostoVehiculos(){
        return costoVehiculos;
    }
    
    public double obtenerCostoTotalBienes(){
        return costoTotalBienes;
    }
    @Override
    public String toString(){
        String reporte = String.format("%s\nLista de Edificios ",
                obtenerNombre());
        for(int i = 0; i < obtenerEdificios().length; i++){
            reporte = String.format("%s\n%d. %s (%.2f)\n", reporte,(i+1),
                    obtenerEdificios()[i].obtenerNombre().toUpperCase(),
                    obtenerEdificios()[i].obtenerCosto());
        }
        reporte = String.format("%s\nTotal de inmuebles: %.2f\n\n "
                + "Lista de Vehículos ", reporte,
                obtenerCostoBienesInmuebles());
        for(int i = 0; i < obtenerEdificios().length; i++){
            reporte = String.format("%s\n%d. %s, %s (%.2f)", reporte,
                    (i+1),
                    obtenerVehiculos()[i].obtenerTipo(),
                    obtenerVehiculos()[i].obtenerMatricula(),
                    obtenerVehiculos()[i].obtenerValor());
        }
        reporte = String.format("%s\nTotal de inmuebles: %.2f\n"
                + "\nTotal Bienes: %.2f", reporte,
                obtenerCostoVehiculos(), obtenerCostoTotalBienes());
        return reporte;
    }
}
