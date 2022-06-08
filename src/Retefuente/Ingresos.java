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
//Clase "Ingresos" heredada de la SuperClase "Retefuente"
public class Ingresos extends Retefuente {
    //Encapsulamiento de los atributos de la clase
    private int _ingresosBasicos;
    private int _ingresosNoConstitutivos;
    private int _ingresosNetos;
    //Constructor de la clase
    public Ingresos(int _ingresosBasicos, int _ingresosNoConstitutivos, int _ingresosNetos, int _salario, int _otrosIngresos, int _eps, int _pension, int _fondoSolidaridadPension, int _voluntariosPension, int _interesesVivienda, int _prepagada, int _dependientes, int _afc, int _rentaExenta25) {  
        super(_salario, _otrosIngresos, _eps, _pension, _fondoSolidaridadPension, _voluntariosPension, _interesesVivienda, _prepagada, _dependientes, _afc, _rentaExenta25);
        this._ingresosBasicos = _ingresosBasicos;
        this._ingresosNoConstitutivos = _ingresosNoConstitutivos;
        this._ingresosNetos = _ingresosNetos;
    }
    //Métodos de la clase (getter and setter)
    public int getIngresosBasicos() {
        return getSalario()+getOtrosIngresos(); // Fórmula para el cálculo de ingresos Brutos
    }

    public int getIngresosNoConstitutivos() {
        return getEps()+getPension()+getFondoSolidaridadPension()+getVoluntariosPension(); // Fórmula para el cálculo de ingresos no constitutivos
    }

    public int getIngresosNetos() {
        return getIngresosBasicos()-getIngresosNoConstitutivos(); // Fórmula para el cálculo de ingresos netos
    }

    public void setIngresosBasicos(int _ingresosBasicos) {
        this._ingresosBasicos = _ingresosBasicos;
    }

    public void setIngresosNoConstitutivos(int _ingresosNoConstitutivos) {
        this._ingresosNoConstitutivos = _ingresosNoConstitutivos;
    }

    public void setIngresosNetos(int _ingresosNetos) {
        this._ingresosNetos = _ingresosNetos;
    }
    //Método para imprimir los datos almacenados en las variables encapsuladas
    public void mostrarIngresos(){
        System.out.println("Ingresos Brutos: "+_ingresosBasicos+
                "\nIngresos No Constitutivos: "+_ingresosNoConstitutivos+
                "\nIngresos Netos: "+_ingresosNetos);
    }
}
