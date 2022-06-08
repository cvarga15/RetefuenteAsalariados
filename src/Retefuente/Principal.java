/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Retefuente;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Aplicación para realiza la liquidación de la retención en la fuente para asalariados segun lo establecido en el articulo 383 del ET.
 * @author Cristian Camilo Vargas González
 * @version 1.1
 */
//Clase "Principal", de la aplicación versión 1.0 para ejecución por consola
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        DecimalFormat formateador = new DecimalFormat("###,###.##");
        System.out.println("Bienvenido al liquidador de retención en la fuente para asalariados"
                + " procedimiento 1 articulo 383 del estatuto tributario");
        
        //Solicitud datos contribuyente
        Contribuyente datos = new Contribuyente("NA",0);
        System.out.println("Por favor ingresa tu nombre");
        datos.setNombre(lectura.next());
        System.out.println("Por favor ingresa tu número de identificación");
        datos.setCedula(lectura.nextInt());
        //datos.mostrarDatos();// TODO code application logic here
        System.out.println("Comencemos a liquidar");
        
        //Solicitud ingresos del contribuyente y aportes
        Ingresos ingresos = new Ingresos(0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        System.out.println("¿Cuál es tu salario como empleado?");
        ingresos.setSalario(lectura.nextInt());
        //System.out.println(ingresos.getSalario());
        System.out.println("¿tienes otros ingresos?, si los tienes escríbelos");
        ingresos.setOtrosIngresos(lectura.nextInt());
        //System.out.println(ingresos.getIngresosBasicos());
        if (ingresos.getSalario()>4000000){
            ingresos.setFondoSolidaridadPension(ingresos.getSalario()*1/100); 
        }
        System.out.println("Si haces aportes voluntarios a pensión ingresa el valor de aporte mensual");
        ingresos.setVoluntariosPension(lectura.nextInt());
        
        //Solicitud y calculo deducciones
        ExentasDeducciones deducciones = new ExentasDeducciones(0,0,0,0,0,0,0,0,0,0,0,0,0);
        System.out.println("Si tienes créditos hipotecarios, ingresa el valor de los intereses");
        deducciones.setInteresesVivienda(lectura.nextInt());
        System.out.println("Si pagas medicina prepagada, ingresa el valor promedio mensual del año pasado");
        deducciones.setPrepagada(lectura.nextInt());
        System.out.println("¿Tienes dependientes económicos?, si la respuesta es si pon 1, si es no pon 0 (cero)");
        deducciones.setDependientes(lectura.nextInt());
        if (deducciones.getDependientes()==1){
            deducciones.setDependientes(ingresos.getIngresosBasicos()*10/100);
        }
        
        //solicitud Exentas
        ExentasDeducciones exentas = new ExentasDeducciones(0,0,0,0,0,0,0,0,0,0,0,0,0);
        System.out.println("¿Tienes AFC?, si es si pon el valor que aportas mensualmente.");
        exentas.setAfc(lectura.nextInt());
        exentas.setRentaExenta25(((ingresos.getIngresosNetos()-deducciones.getDeducciones()-exentas.getAfc())*25/100));
                
        //Liquidación
        Liquidacion base = new Liquidacion(0,0,0.0,0.0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        base.setBaseGravable(ingresos.getIngresosNetos()-deducciones.getDeducciones()-exentas.getExentas());
        base.setBaseReUvt(base.getBaseGravable()/base.getValorUvt());
        if (base.getBaseReUvt()<95){
            base.setRetencionUvt(base.getBaseReUvt()*0);
        }
            else if (base.getBaseReUvt()>95 && base.getBaseReUvt()<=150){
                base.setRetencionUvt((base.getBaseReUvt()-95)*19/100);
            }
                else if (base.getBaseReUvt()>150 && base.getBaseReUvt()<=360){
                    base.setRetencionUvt(((base.getBaseReUvt()-150)*28/100)+10);
                }
                    else if (base.getBaseReUvt()>360 && base.getBaseReUvt()<=640){
                        base.setRetencionUvt(((base.getBaseReUvt()-360)*33/100)+69);
                    }
                        else if (base.getBaseReUvt()>640 && base.getBaseReUvt()<=945){
                            base.setRetencionUvt(((base.getBaseReUvt()-640)*33/100)+162);
                        }
                            else if (base.getBaseReUvt()>945 && base.getBaseReUvt()<=2300){
                                base.setRetencionUvt(((base.getBaseReUvt()-945)*37/100)+268);
                            }
                                else if (base.getBaseReUvt()>2300){
                                    base.setRetencionUvt(((base.getBaseReUvt()-2300)*39/100)+770);
                                }
        base.setValorRetencion((int) (base.getRetencionUvt()*base.getValorUvt()));
        
        //Resultado
        //datos.mostrarDatos();
        //ingresos.mostrarIngresos();
        //base.mostrarBase();
        System.out.println("Resultado de la Liquidación");
        datos.mostrarDatos();
        System.out.println("Ingresos: "+ formateador.format(ingresos.getIngresosBasicos()));
        System.out.println("Ingresos No Constitutivos de Renta: "+ formateador.format(ingresos.getIngresosNoConstitutivos()));
        System.out.println("Ingresos Netos:"+ formateador.format(ingresos.getIngresosNetos()));
        System.out.println("Total Deducciones:"+ formateador.format(deducciones.getDeducciones()));
        System.out.println("Total Rentas Exentas: "+ formateador.format(exentas.getExentas()));
        System.out.println("Base Gravale: "+ formateador.format(base.getBaseGravable()));
        System.out.println("Base Gravable en UVT: "+ base.getBaseReUvt());
        System.out.println("Retención en UVT: "+ base.getRetencionUvt());
        System.out.println("Valor Retención a practivar: " + formateador.format(base.getValorRetencion()));
        //System.out.println("Ingreso: "+ formateador.format(ingresos.getSalario())+
        //        "\notros ingresos: " + ingresos.getOtrosIngresos()+
        //        "\neps: "+ ingresos.getEps()+
        //        "\npension: "+ ingresos.getPension()+
        //        "\nfondo de solidaridad: "+ ingresos.getFondoSolidaridadPension()+
        //        "\ningresos netos:"+ ingresos.getIngresosNetos()+
        //        "\nintereses vivienda: "+ deducciones.getInteresesVivienda()+
        //        "\nprepagada: "+ deducciones.getPrepagada()+
        //        "\ndependientes: "+ deducciones.getDependientes()+
        //        "\n Deducciones:"+ deducciones.getDeducciones()+
        //        "\nafc: "+ exentas.getAfc()+
        //        "\nrenta exenta 25%: "+ exentas.getRentaExenta25()+
        //        "\n Rentas Exentas: "+ exentas.getExentas()+
        //        "\nbase gravable: "+ base.getBaseGravable()+
        //        "\nbase gravable en uvt: "+ base.getBaseReUvt()+
        //        "\nRetencion en UVT: "+ base.getRetencionUvt()+
        //        "\nretencion : "+ formateador.format(base.getValorRetencion()));
        
    }
    
}
