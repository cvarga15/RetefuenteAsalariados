/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retefuente;

/**
 * Aplicación para realiza la liquidación de la retención en la fuente para asalariados segun lo establecido en el articulo 383 del ET.
 * @author Cristian Camilo Vargas González
 * @version 1.1
 */
public class Contribuyente {
    //Encapsulamiento de los atributos de la clase
    public String _nombre; //nombre del contribuyente
    public int _cedula; //identificacion del contribuyente
    //Constructor de la clase
    public Contribuyente(String _nombre, int _cedula) {
        this._nombre = _nombre;
        this._cedula = _cedula;
    }
    //Métodos de la clase (getter and setter)
    public String getNombre() {
        return _nombre;
    }

    public int getCedula() {
        return _cedula;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public void setCedula(int _cedula) {
        this._cedula = _cedula;
    }
    
    //Método para imprimir los datos almacenados en las variables encapsuladas
    public void mostrarDatos(){
        System.out.println("Datos del Contribuyente:"+
                "\nNombre: "+_nombre+
                "\nCedula: "+_cedula);
    }

    void getNombre(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String setNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void getCedula(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
