
package examenprogramacion;

import java.util.ArrayList;
import java.util.Scanner;


public class Lista extends RegistrarDatos {
    
    ArrayList <String>listaDep;
    
    public void leerOpcion(){
       
    Scanner teclado= new Scanner(System.in);
    int opcion;
    do{
        System.out.println("1.-Registrar Departamentos--->");
        System.out.println("2.-Mostrar Departamentos  --->");
        System.out.println("3.-Buscar Departamentos   --->");
        System.out.println("4.-Vaciar/Eliminar lista  --->");
        System.out.println("5.-salir                  --->\n");
        System.out.println("Ingrese una opcion--->");
        opcion=teclado.nextInt();
        
        switch (opcion){
            case 1:
                registrarDepartamento();
                break;
            case 2:
                mostrarDepartamento();
                break;
            case 3:
                buscarDepartamento();
                break;
            case 4:
                vaciarLista();
    
    }
    }while(opcion!=5);
     
    }
    
    public void registrarDepartamento(){
        Scanner teclado =new Scanner(System.in);
        String departamento;
        System.out.println( "******************************************");
        System.out.println( "Ingrese el Nombre del Departamento:");
        departamento= teclado.nextLine();
        listaDep.add(departamento);
        System.out.println( "*************************************\n");
        }
    
    public void mostrarDepartamento(){
        if (!listaDep.isEmpty()){
        System.out.println("Los Departamentos Registrados en la lista son:");
        for (int i=0; i<listaDep.size();i++){
         System.out.println(listaDep.get(i));
        }
        } else {
         System.out.println(" No existen los datos ingresados en la lista");
        }
    }
    public void buscarDepartamento(){
        Scanner teclado =new Scanner (System.in);
        String departamento;
        int indice=0;
        System.out.println("Departamento a buscar:");
        departamento=teclado.nextLine();
        indice=listaDep.indexOf(departamento);
        if(indice !=-1){
        System.out.println("El departamento se ingreso en la posicion :"+ indice);
        
        }else{
            System.out.println("El departamento no fue encontrado");
        }
        
        }
    
    public void vaciarLista(){
     Scanner inc=new Scanner (System.in);
     String valor;
     int indice;
     System.out.println("Datos a eliminar");
     valor=inc.nextLine();
     indice=listaDep.lastIndexOf(valor);
     if (indice !=-1){
     listaDep.remove(indice);
     System.out.println("El dato a sido eliminado");
     }else {
     System.out.println("El dato no se encuentra");
     }
    
    }
    
    }

