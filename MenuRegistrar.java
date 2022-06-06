
package examenprogramacion;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuRegistrar {
    
    
    public void menuRegistroDepartamentos(){
        
    Scanner leer= new Scanner(System.in); 
    RegistrarDatos most= new RegistrarDatos();
    RegistrarDatos cosa[]= new RegistrarDatos[2];
    Lista nuevo= new Lista();
    ArregloBuscar obj=new ArregloBuscar();
    String cabeceras,registroDos,buscar;
    int opcion,opc;
    
       do{
            do{
        System.out.println("PROGRAMA PARA REGISTRAR LOS DEPARTAMENTOS DE ");
        System.out.println("-----------------GUATEMALA------------------ ");
        System.out.println("*******************************************"  );
        System.out.println("*  Bienvenido al Menú principal*"          );
        System.out.println("* 1.- Ingresar * Nombre del Departamento*" );
        System.out.println("* 2.- Metodos de Lista                  *" );
        System.out.println("* 3.- Metodos  Array                    *" );
        System.out.println("* 4.- Regresar                          *" );
        System.out.println("* 5.- Salir                             *" );
        System.out.println("********************************************" );

        System.out.println("__Elige una opción del menu:__ ");

        opc = leer.nextInt();
       

            switch (opc) {
                    
            case 1:
                    
                     most.RegistrarDepa();
                     most.registrarMuni();
                     most.registrarCabe();
                
                    System.out.println("************************************************");
                    System.out.println("**      ¿Deseas regresar al menú principal?   **");
                    System.out.println("**    --   4.- Regresar        5.- Salir    --  **");
                    System.out.println("************************************************");
                     opc=leer.nextInt();
                     


            break;

            case 2:
                System.out.println("--------------************************--------------");
                System.out.println("*  Submenú de:  listas                             *");
                System.out.println("*   1.- Registro de datos en Lista                 *");
                System.out.println("*   4.- Regresar a menu                            *");
                System.out.println("*   5.- Salir                                      *");
                System.out.println("--------------************************--------------");

                opc = leer.nextInt();
                if (opc == 1) {

                    System.out.println("**********************************************");
                    System.out.println("**            Elegiste la opción 1          **");
                    System.out.println("**   Mostrar los departamentos registrados  **");
                    System.out.println("**********************************************\n");
                      nuevo.leerOpcion();
                    
                    System.out.println("************************************************");
                    System.out.println("**      ¿Deseas regresar al menú principal?   **");
                    System.out.println("**         4.- Regresar        5.- Salir      **");
                    System.out.println("************************************************");
                     opc=leer.nextInt();                  

                }


            break;


            case 3:
                System.out.println("-----------------************************-----------------");
                System.out.println("*  Submenú de:  Historial por medio de Arrays            *");
                System.out.println("*   1.- Mostrar los departamentos registrados            *");
                System.out.println("*   2.- Buscar un Departamento                           *");
                System.out.println("*   3.- Mostrar Cabecera Departamental                   *");
                System.out.println("*   4.- Mostrar Deptos.registrados en posiciones impares *");
                System.out.println("*   5.- Regresar                                         *");
                System.out.println("*   6.- Salir                                            *");
                System.out.println("-----------------************************-----------------");

                opc = leer.nextInt();
                
                 if (opc == 1) {

                    System.out.println("**********************************************");
                    System.out.println("**            Elegiste la opción 1          **");
                    System.out.println("**   Mostrar los departamentos registrados  **");
                    System.out.println("**********************************************\n");
                    System.out.println("Los departamentos registrados son:\n");
                    most.mostrarOperaciones();
                    System.out.println("************************************************");
                    System.out.println("**      ¿Deseas regresar al menú principal?   **");
                    System.out.println("**         5.- Regresar        6.- Salir      **");
                    System.out.println("************************************************");
                     opc=leer.nextInt();                  

                    }
                     if (opc == 2) {

                    System.out.println("**********************************************");
                    System.out.println("**            Elegiste la opción 2          **");
                    System.out.println("**     Buscar un departamento registrado    **");
                    System.out.println("**********************************************\n");
                    
                         obj.buscarDep(0);
                
                    System.out.println("************************************************");
                    System.out.println("**      ¿Deseas regresar al menú principal?   **");
                    System.out.println("**         5.- Regresar        6.- Salir      **");
                    System.out.println("************************************************");
                     opc=leer.nextInt();                  

                     }
                      if (opc == 3) {

                    System.out.println("**********************************************");
                    System.out.println("**            Elegiste la opción 3          **");
                    System.out.println("**     Mostrar Cabecera departamental       **");
                    System.out.println("**********************************************\n");
                    for (int i=0; i<cosa.length;i++){
                     System.out.println( "************************************************");
                     System.out.println( "Ingrese el Nombre  de la Cabecera departamental es:");
                     cabeceras=leer.nextLine();
                     cosa[i]=new RegistrarDatos(cabeceras);
                    System.out.println( "*********************************************\n");
                    
                  
                    }
                    System.out.println("");
                    for (int i=0;i<cosa.length;i++){
                    System.out.println("Se muestran las cabecera departamental"+cosa[i].getCabecera());
                    }
                    System.out.println("************************************************");
                    System.out.println("**      ¿Deseas regresar al menú principal?   **");
                    System.out.println("**         5.- Regresar        6.- Salir      **");
                    System.out.println("************************************************");
                     opc=leer.nextInt();                  

                     }
                     if (opc == 4) {

                    System.out.println("******************************************************");
                    System.out.println("**                Elegiste la opción 4              **");
                    System.out.println("**Mostrar Deptos.registrados en posiciones impares  **");
                    System.out.println("**********************************************\n");
                    
                    
                    System.out.println("Los Departamentos en posiciones impares son :");
                    most.impares();
                    System.out.println("******************************************************");
                    System.out.println("**      ¿Deseas regresar al menú principal?   **");
                    System.out.println("**         5.- Regresar        6.- Salir      **");
                    System.out.println("*******************************************************");
                     opc=leer.nextInt();                  

                }
               
                     break;
                   
                   }
                   
            }while(opc==4);
   }while(opc!=5);
                    System.out.println("**********************************************");
                    System.out.println("**  Elegiste la opción salir                **");
                    System.out.println("**  Gracias por utilizar este programa      **");
                    System.out.println("**********************************************");          
                                 
            }
   
    
    

    
    
}
