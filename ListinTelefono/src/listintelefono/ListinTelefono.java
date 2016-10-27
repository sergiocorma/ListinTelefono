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
    //Editar contactos
    public static void editarContactos(String vnombres[], int vnumero[]) {
    Scanner leer = new Scanner(System.in);
            int posicion=0;
            String nombre="";
            int telefono=0;

            System.out.println("Escriba el nombre del contacto: ");
            nombre = leer.nextLine().toLowerCase();
            
            
            for (int i=0;i<10;i++){
                if (nombre.equalsIgnoreCase(vnombres[i])){
                    vnombres[i]=nombre;
                    System.out.println("Dime el número de telefono de ese contacto: ");
                    telefono= leer.nextInt();
                    telefono=vnumero[i];
                }

            }

        }
    
    
    //Buscar hueco para escribir nombre y número
    public static int buscarHueco(String vnombres[]){
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
    public static void guardarContacto(String vnombres[], int vnumeros[]){
        int posicion;
        posicion=buscarHueco(vnombres);
        Scanner leer = new Scanner (System.in);
        
        
        if (posicion==-1){
            System.out.println("No hay hueco disponible.");
        } else {
            System.out.println("Dime tu nombre: ");
            vnombres[posicion] = leer.nextLine();
            System.out.println("Dime tu teléfono: ");
            vnumeros[posicion] = leer.nextInt();
            
        }
    
    }
    //Mostrar todos los contactos
    public static void verContactos(String vnombres[], int vnumeros[]){
    
        System.out.println("Listado de contactos:");
        for (int i=0;i<10;i++){
            if (vnombres[i] != null){
                System.out.println("Nombre: "+vnombres[i]+" Teléfono:"+vnumeros[i]);
            
            }
        }
        
        
    }
    //Muestra el menú
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
                guardarContacto(vnombres, vnumeros);
                break;
                
            case 2:
                verContactos(vnombres, vnumeros);
                break;
                
            case 3:
                editarContactos(vnombres, vnumeros);
                break;
                
            case 4:
                break;
                
            default:
                break;
        
        
        }
       }while (bandera);
        
    }
    
}
