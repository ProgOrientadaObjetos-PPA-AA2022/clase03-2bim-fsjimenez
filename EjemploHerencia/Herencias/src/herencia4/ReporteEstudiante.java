/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    
    public ReporteEstudiante(String c){
        super(c);
    }
    
    public void establecerLista(ArrayList<Estudiante> listado){
        lista = listado;
    }
    
    public void calcularPromedio(){
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i).getMatricula();
        }
        promedioMatriculas = suma/lista.size();
    }
    
    public ArrayList<Estudiante> obtenerLista(){
        return lista;
    }
    
    public double obtenerPromedio(){
        return promedioMatriculas;
    }
    
    @Override
    
    public String toString(){
        String cadena = String.format("Reporte de Estudiantes (%s): \n", 
                super.toString());
        
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%s. %s\n", cadena, i+1 ,lista.get(i));
        }
        
        cadena = String.format("%sPromedio de Matriculas: %.2f\n", cadena,
                                                                promedioMatriculas);
        
        return cadena;
    }
}
