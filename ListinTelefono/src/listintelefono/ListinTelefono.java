/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listintelefono;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ListinTelefono {

    public static int menu() {
           Scanner leer = new Scanner(System.in);
           int opcion=0;
           
            while ( opcion<0 || opcion>4){
            System.out.println("************************");
            System.out.println("*         MENU         *");
            System.out.println("* 1- Insertar contacto *");
            System.out.println("* 2- Ver contactos     *");
            System.out.println("* 3- Editar contactos  *");
            System.out.println("* 4- Eliminar contacto *");
            System.out.println("************************");
            System.out.println("Escoge una opción:");
            opcion=leer.nextInt();
            }
            return opcion;
}
    
    public static void main(String[] args) {
        boolean bandera=true;
        String vnombres[]= new String[10];
        int vnumeros[] = new int [10];
        
        
        
       do{ 
        switch(menu()) {
            case 0: 
                System.out.println("¡Hasta pronto!");
                bandera=false;
                break;
                
            case 1:
                break;
                
            case 2:
                break;
                
            case 3:
                break;
                
            case 4:
                break;
                
            default:
                break;
        
        
        }
       }while (bandera);
        
    }
    
}
