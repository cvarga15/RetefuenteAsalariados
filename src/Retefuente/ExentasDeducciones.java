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
//Clase "ExentasDeducciones" heredada de la SuperClase "Retefuente"
public class ExentasDeducciones extends Retefuente {
    //Encapsulamiento de los atributos de la clase
    private int _deducciones;
    private int _exentas;
    //Constructor de la clase
    public ExentasDeducciones(int _deducciones, int _exentas, int _salario, int _otrosIngresos, int _eps, int _pension, int _fondoSolidaridadPension, int _voluntariosPension, int _interesesVivienda, int _prepagada, int _dependientes, int _afc, int _rentaExenta25) {
        super(_salario, _otrosIngresos, _eps, _pension, _fondoSolidaridadPension, _voluntariosPension, _interesesVivienda, _prepagada, _dependientes, _afc, _rentaExenta25);
        this._deducciones = _deducciones;
        this._exentas = _exentas; 
    }
    //Métodos de la clase (getter and setter)
    public int getDeducciones() {
        return getInteresesVivienda()+getPrepagada()+getDependientes();// Fórmula para el cálculo de deducciones totales
    }

    public int getExentas() {
        return getAfc()+getRentaExenta25(); // Fórmula para el cálculo de rentas exentas totales
    }

    public void setDeducciones(int _deducciones) {
        this._deducciones = _deducciones;
    }

    public void setExentas(int _exentas) {
        this._exentas = _exentas;
    }
    
    
}
