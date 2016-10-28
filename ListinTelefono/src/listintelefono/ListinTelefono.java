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
    //Declarar variables generales
   public static String vnombres[]= new String[10];
   public static String vnumeros[] = new String [10];
    
   
   //funcion eliminar contactos
   public static void eliminarContactos() {
    Scanner leer = new Scanner(System.in);
            int posicion=0;
            String nombre=null;
            String telefono=null;

            System.out.println("Escriba el nombre del contacto que desea eliminar: ");
            nombre = leer.nextLine().toUpperCase();
            
            //recorro el vector en busca de el nombre que se introduce
            for (int i=0;i<10;i++){
                if (nombre.equalsIgnoreCase(vnombres[i])){
                   
                    vnombres[i]=null;
                    vnumeros[i]=null;
                    System.out.println("El contacto ha sido eliminado.");
                }

            }

        }
   
   
   
    //Editar contactos
    public static void editarContactos() {
    Scanner leer = new Scanner(System.in);
            int posicion=0;
            String nombre=null;
            String telefono=null;

            System.out.println("Escriba el nombre del contacto: ");
            nombre = leer.nextLine().toUpperCase();
            
            
            for (int i=0;i<10;i++){
                if (nombre.equalsIgnoreCase(vnombres[i])){
                    System.out.println("Dime el nuevo nombre del contacto: ");
                    vnombres[i]=leer.nextLine().toUpperCase();
                    System.out.println("Dime el numero de telefono de ese contacto: ");
                    telefono= leer.nextLine();
                    vnumeros[i]=telefono;
                }

            }

        }
    
    
    //Buscar hueco para escribir nombre y numero
    public static int buscarHueco(){
    int posicion=0;
        for (int i=0;i<vnombres.length;i++){
            if (vnombres[i] ==null){
            posicion=i;
            i=vnombres.length +1;
            }
        }
        return posicion;
    }
    //Guardar un contacto
    public static void guardarContacto(){
        int posicion;
        posicion=buscarHueco();
        Scanner leer = new Scanner (System.in);
        
        
        if (posicion==-1){
            System.out.println("No hay hueco disponible.");
        } else {
            System.out.println("Dime tu nombre: ");
            vnombres[posicion] = leer.nextLine().toUpperCase();
            System.out.println("Dime tu telefono: ");
            vnumeros[posicion] = leer.nextLine();
            if (vnumeros[posicion].length()!=9) {
             vnombres[posicion] = null;
             vnumeros[posicion] = null;
                System.err.println("El numero de telefono no es valido, debe tener 9 digitos. Introduzca el contacto de nuevo. ");
            }
            
        }
    
    }
    //Mostrar todos los contactos
    public static void verContactos(){
    
        System.out.println("Listado de contactos:");
        for (int i=0;i<10;i++){
            if (vnombres[i] != null){
                System.out.println("Nombre: "+vnombres[i]+" Telefono:"+vnumeros[i]);
            
            }
        }
        
        
    }
    //Muestra el menu
    public static int menu() {
           Scanner leer = new Scanner(System.in);
           int opcion=-1;
           
            while ( opcion<0 || opcion>4){
            System.out.println("*************************");
            System.out.println("*         MENU          *");
            System.out.println("* 1- Insertar contacto  *");
            System.out.println("* 2- Ver contactos      *");
            System.out.println("* 3- Editar contactos   *");
            System.out.println("* 4- Eliminar contacto  *");
            System.out.println("* 0- Salir del programa *");
            System.out.println("*************************");
            System.out.println("Escoge una opcion:");
            opcion=leer.nextInt();
            }
            return opcion;
}
    
    public static void main(String[] args) {
        boolean bandera=true;
        
        
        
        
       do{ 
        switch(menu()) {
            case 0: 
                System.out.println("¡Hasta pronto!");
                bandera=false;
                break;
                
            case 1:
                guardarContacto();
                break;
                
            case 2:
                verContactos();
                break;
                
            case 3:
                editarContactos();
                break;
                
            case 4:
                eliminarContactos();
                break;
                
            default:
                break;
        
        
        }
       }while (bandera);
        
    }
    
}
