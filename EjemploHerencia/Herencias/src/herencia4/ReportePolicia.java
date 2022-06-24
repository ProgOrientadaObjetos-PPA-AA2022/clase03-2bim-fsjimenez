/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;
    
    public ReportePolicia(String c){
        super(c);
    }
    
    public void establecerLista(ArrayList<Policia> listado){
        lista = listado;
    }
    
    public void calcularPromedio(){
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i).getEdad();
        }
        promedioEdades = suma/lista.size();
    }
    
    public ArrayList<Policia> obtenerLista(){
        return lista;
    }
    
    public double obtenerPromedio(){
        return promedioEdades;
    }
    
    @Override
    
    public String toString(){
        String cadena = String.format("Reporte de Policias (%s): \n", 
                super.toString());
        
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%s. %s\n", cadena, i+1 ,lista.get(i));
        }
        
        cadena = String.format("%sPromedio de Edades: %.2f\n", cadena,
                                                              promedioEdades);
        
        return cadena;
    }
}
