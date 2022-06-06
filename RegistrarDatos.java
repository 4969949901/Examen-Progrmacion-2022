
package examenprogramacion;

import java.util.ArrayList;
import java.util.Scanner;


public class RegistrarDatos {
    public static String dat[];
    Scanner intro =new Scanner (System.in);
    RegistrarDatos ot1[]=new RegistrarDatos[3];
    
    //Atributos
     String departamento,cabecera;
    int municipio,limite;
    private int contador;
    private String [] vectorAlmacenar;
    private double[] matriz;
    private int indiceVector;    
    
    //constructores
    
    public RegistrarDatos(){}
    
    public RegistrarDatos(String departamento, int muni){
    this.departamento= departamento;
    this.municipio=0;
    this.contador=0;
    vectorAlmacenar= new String [22];
    this.indiceVector=0;
    }
    public RegistrarDatos(String cabecera){
        this.cabecera=cabecera;
    }

    

    //SE GENERO UN GETTER/SETTER DE DEPARTAMENTO YA QUE SE TRABAJARA CON EL 
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCabecera() {
        return cabecera;
    }

    public void setCabecera(String cabecera) {
        this.cabecera = cabecera;
    }
    
    
    
    //metodos registro de departamento, municipio y cabecera
    public void RegistrarDepa(){
        System.out.println( "***********************************************************");
      
        System.out.println( "Ingrese el Nombre del Departamento:");
        departamento= intro.nextLine();departamento= intro.nextLine();
        this.registrarOperacione("Registro de:", departamento);
        System.out.println( "**********************************************************\n");
        
       
   
    }
    
    public void registrarMuni (){
        System.out.println( "******************************************");
        System.out.println( "Ingrese el Nombre del Municipio:");
        municipio= intro.nextInt();
        
        System.out.println( "*************************************\n");
    }
    
    public void registrarCabe(){
        System.out.println( "************************************************");
        System.out.println( "Ingrese el Numero de la Cabecera departamental:");
        cabecera= intro.nextLine();cabecera= intro.nextLine();
        
        System.out.println( "*********************************************\n");
    
    
    }
    
     public void registrarOperacione(String tipo,String departamentos){ 
        indiceVector=indiceVector+1;
        vectorAlmacenar[indiceVector]="  "+tipo+"  "+departamentos+" ";
    
    }
   
       public void mostrarOperaciones(){
        try{       
            for (int i=1; i<vectorAlmacenar.length;i++){
                if(vectorAlmacenar[i] != null){
                    System.out.println(vectorAlmacenar[i]);
                }
            }
            System.out.println("\n // Mostrara  el vector en la pantalla// \n");
            for(String operacion : vectorAlmacenar){
                if(operacion != null){
                    System.out.println(operacion);
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
}

    public void impares(){
    String []departamento= new String[6];
    
    departamento[0]="Guatemala";
    departamento[1]="Zacapa";
    departamento[2]="Izabal";
    departamento[3]="Peten";
    departamento[4]="Santa Rosa";
    departamento[5]="Quetzaltenango";
    
    for (String depa:departamento){
     System.out.println(" Departamentoregistrados:"+departamento);
    }
    
    System.out.println("----- POSICIONES IMPARES----");
    System.out.println(departamento[1]);
    System.out.println(departamento[3]);
    System.out.println(departamento[5]);
    System.out.println("-------------------------------");
    }
     
}
