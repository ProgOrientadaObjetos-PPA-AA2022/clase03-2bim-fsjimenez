
package paquete05;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
        */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        boolean bandera = true;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        // inicio de solución
        while(bandera){
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial"
                    + " Ingrese (2) para Estudiante Distancia");

            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();
            
            if (tipoEstudiante != 1 && tipoEstudiante != 2) {
                System.out.println("Número no válido");
                break;
            }// if por si el usuario ingresa un número no correspondiente
            
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();

            if (tipoEstudiante == 1) {    // si el usuario ingresa 1, se procede a crear y leer unn objeto de tipo EstudiantePresencial


                EstudiantePresencial estudianteP = new EstudiantePresencial();

                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada crédito");
                costoCred = entrada.nextDouble();

                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);
                estudiantes.add(estudianteP);//se añade el objeto a la ArrayList
                
            } else if(tipoEstudiante == 2){
                
                    EstudianteDistancia estudianteD = new EstudianteDistancia();

                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = entrada.nextDouble();

                    estudianteD.establecerNombresEstudiante(nombresEst);
                    estudianteD.establecerApellidoEstudiante(apellidosEst);
                    estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                    estudianteD.establecerEdadEstudiante(edadEst);
                    estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                    estudianteD.establecerCostoAsignatura(costoAsig);
                    
                    estudiantes.add(estudianteD);//se añade el objeto a la ArrayList
                    
                                                      
            }
            
            entrada.nextLine();
            
            System.out.println("Ingrese S(mayúscula) para seguir introduciendo datos");
            continuar = entrada.nextLine();
            
            bandera = continuar.equals("S");//linea de codigo que reemplaza
                                            //el if else, haciendolo más simplificado
            
        }
        
        
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();
            
            System.out.printf("Datos Estudiante\n"
                        + "%s",                        
                  estudiantes.get(i));
            
        }
    }

}