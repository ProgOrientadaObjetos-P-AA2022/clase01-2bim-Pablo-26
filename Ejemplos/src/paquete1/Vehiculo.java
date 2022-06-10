/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author UTPL
 */
public class Vehiculo {
    private String tipo;
    private String matricula;
    private double valor;
    
    public void establecerTipo(String n){
        tipo = n;
    }
    
    public void establecerMatricula(String n){
        matricula = n;
    }
    
    public void establecerValor(double n){
        valor = n;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public String obtenerMatricula(){
        return matricula;
    }
    
    public double obtenerValor(){
        return valor;
    }
}
