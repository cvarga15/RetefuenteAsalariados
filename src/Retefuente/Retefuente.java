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
//SuperClase
public class Retefuente {
  //Encapsulamiento de los atributos de la clase
    public int _salario; //variable para guardar el valor entero de salario del empleado SE PIDE 
    public int _otrosIngresos; //variable para guardar el valor entero de otro ingresos del empleado SE PIDE
    public int _eps; //variable para guardar el valor entero de eps del empleado SE CALCULA
    public int _pension; //variable para guardar el valor entero de pension del empleado SE CALCULA
    public int _fondoSolidaridadPension; //variable para guardar el valor entero de fondo de solidaridad pensional del empleado SE CALCULA
    public int _voluntariosPension; //variable para guardar el valor entero de aportes voluntarios de pension del empleado SE PIDE
    public int _interesesVivienda; //variable para guardar el valor entero de intereses de vivienda del empleado SE PIDE
    public int _prepagada; //variable para guardar el valor entero de medicina prepagada del empleado SE PIDE
    public int _dependientes; //variable para guardar el valor entero de dependientes economicos del empleado SE CALCULA
    public int _afc; //variable para guardar el valor entero de aportes afc del empleado SE PIDE
    public int _rentaExenta25; //variable para guardar el valor entero de la renta exenta del 25% del empleado SE CALCULA
    //Constructor de la clase
    public Retefuente(int _salario, int _otrosIngresos, int _eps, int _pension, int _fondoSolidaridadPension, int _voluntariosPension, int _interesesVivienda, int _prepagada, int _dependientes, int _afc, int _rentaExenta25) {
        this._salario = _salario;
        this._otrosIngresos = _otrosIngresos;
        this._eps = _eps;
        this._pension = _pension;
        this._fondoSolidaridadPension = _fondoSolidaridadPension;
        this._voluntariosPension = _voluntariosPension;
        this._interesesVivienda = _interesesVivienda;
        this._prepagada = _prepagada;
        this._dependientes = _dependientes;
        this._afc = _afc;
        this._rentaExenta25 = _rentaExenta25;
    }
    //Métodos de la clase (getter and setter)
    public int getSalario() {
        return _salario;
    }

    public int getOtrosIngresos() {
        return _otrosIngresos;
    }

    public int getEps() {
        return (_salario*4/100);
    }

    public int getPension() {
        return (_salario*4/100);
    }

    public int getFondoSolidaridadPension() {
        return _fondoSolidaridadPension;
    }

    public int getVoluntariosPension() {
        return _voluntariosPension;
    }

    public int getInteresesVivienda() {
        return _interesesVivienda;
    }

    public int getPrepagada() {
        return _prepagada;
    }

    public int getDependientes() {
        return _dependientes;
    }

    public int getAfc() {
        return _afc;
    }

    public int getRentaExenta25() {
        return _rentaExenta25;
                //(((_salario+_otrosIngresos)-(_eps+_pension+_fondoSolidaridadPension+_voluntariosPension)-(_interesesVivienda+_prepagada+_dependientes+_afc))*25/100);
    }

    public void setSalario(int _salario) {
        this._salario = _salario;
    }

    public void setOtrosIngresos(int _otrosIngresos) {
        this._otrosIngresos = _otrosIngresos;
    }

    public void setEps(int _eps) {
        this._eps = _eps;
    }

    public void setPension(int _pension) {
        this._pension = _pension;
    }

    public void setFondoSolidaridadPension(int _fondoSolidaridadPension) {
        this._fondoSolidaridadPension = _fondoSolidaridadPension;
    }

    public void setVoluntariosPension(int _voluntariosPension) {
        this._voluntariosPension = _voluntariosPension;
    }

    public void setInteresesVivienda(int _interesesVivienda) {
        this._interesesVivienda = _interesesVivienda;
    }

    public void setPrepagada(int _prepagada) {
        this._prepagada = _prepagada;
    }

    public void setDependientes(int _dependientes) {
        this._dependientes = _dependientes;
    }

    public void setAfc(int _afc) {
        this._afc = _afc;
    }

    public void setRentaExenta25(int _rentaExenta25) {
        this._rentaExenta25 = _rentaExenta25;
    }
    
    
    
    
}
