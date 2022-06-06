
package examenprogramacion;

import java.util.Scanner;


public class ArregloBuscar extends RegistrarDatos {
    
    public  String  [][] buscarDep(int cantidadDep){
        Scanner leer= new Scanner (System.in);
        String departamento;
        int puntajeActual = 0;
        String[][] buscarDep = new String[cantidadDep][3];
        for (int fila = 0; fila < buscarDep.length; fila++) {
            System.out.println("-------------------------------------------------");
            System.out.print("Ingrese el nombre del departamento " + fila + ": ");
            departamento = leer.next();
           buscarDep[fila][0] = departamento;
           System.out.println("----------------------------------------------------");
            for (int columna = 1; columna < buscarDep[fila].length; columna++) {
                System.out.print("Ingrese el puntaje y posicion del pais " + fila + ": ");
                puntajeActual = leer.nextInt();
                buscarDep[fila][columna] = Integer.toString(puntajeActual);
                System.out.println("-------------------------------------------------");
            }
            
        }

        return buscarDep;
    
                
    }
    

}
    



