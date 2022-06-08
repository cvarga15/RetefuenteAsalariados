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
//Clase "Liquidacion" heredada de la SuperClase "Retefuente"
public class Liquidacion extends Retefuente {
    //Encapsulamiento de los atributos de la clase
    private int _salarioMinimo;
    private int _valorUvt;
    private double _baseReUvt;
    private double _retencionUvt;
    private double _baseGravable;
    private int _valorRetencion;
    //Constructor de la clase
    public Liquidacion(int _salarioMinimo, int _valorUvt, double _baseReUvt, double _retencionUvt, double _baseGravable, int _valorRetencion, int _salario, int _otrosIngresos, int _eps, int _pension, int _fondoSolidaridadPension, int _voluntariosPension, int _interesesVivienda, int _prepagada, int _dependientes, int _afc, int _rentaExenta25) {
        super(_salario, _otrosIngresos, _eps, _pension, _fondoSolidaridadPension, _voluntariosPension, _interesesVivienda, _prepagada, _dependientes, _afc, _rentaExenta25);
        this._salarioMinimo = _salarioMinimo;
        this._valorUvt = _valorUvt;
        this._baseReUvt = _baseReUvt;
        this._retencionUvt = _retencionUvt;
        this._baseGravable = _baseGravable;
        this._valorRetencion = _valorRetencion;
    }
    //Métodos de la clase (getter and setter)
    public int getSalarioMinimo() {
        return _salarioMinimo = 1000000; //Asignación del valor de la constante Salario Mínimo
    }

    public int getValorUvt() {
        return _valorUvt = 38004; //Asignación del valor de la constante valor UVT vigente
    }

    public double getBaseReUvt() {
        return _baseReUvt;
    }

    public double getRetencionUvt() {
        return _retencionUvt;
    }

    public double getBaseGravable() {
        return _baseGravable;
    }

    public int getValorRetencion() {
        return _valorRetencion;
    }

    public void setSalarioMinimo(int _salarioMinimo) {
        this._salarioMinimo = _salarioMinimo;
    }

    public void setValorUvt(int _valorUvt) {
        this._valorUvt = _valorUvt;
    }

    public void setBaseReUvt(double _baseReUvt) {
        this._baseReUvt = _baseReUvt;
    }

    public void setRetencionUvt(double _retencionUvt) {
        this._retencionUvt = _retencionUvt;
    }

    public void setBaseGravable(double _baseGravable) {
        this._baseGravable = _baseGravable;
    }

    public void setValorRetencion(int _valorRetencion) {
        this._valorRetencion = _valorRetencion;
    }
    //Método para imprimir los datos almacenados en las variables encapsuladas
    public void mostrarBase(){
        System.out.println("Base Gravable: "+_baseGravable+
                "\nValor retencion a aplicar: "+_valorRetencion);
    }
    
}
