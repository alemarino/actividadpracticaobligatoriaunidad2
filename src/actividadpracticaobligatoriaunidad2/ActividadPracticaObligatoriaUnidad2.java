/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadpracticaobligatoriaunidad2;
import java.util.Scanner;

/**
 *
 * @author Papa
 */
public class ActividadPracticaObligatoriaUnidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        String nombre = "", apellido = "", hobbie = "", editorPreferido = "", sistemaOperativo = "";
        int edad = 0;
        
        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        
        System.out.print("Ingrese su apellido: ");
        apellido = entrada.nextLine();
                
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        
        entrada.nextLine();
                               
        System.out.print("Ingrese su hobbie: ");
        hobbie = entrada.nextLine();
        
        System.out.print("Ingrese el nombre de su editor de código preferido: ");
        editorPreferido = entrada.nextLine();
        
        System.out.print("Ingrese el nombre de su sistema operativo: ");
        sistemaOperativo = entrada.nextLine();
        
         System.out.println("\n"); 
         System.out.println("Los datos ingresados son: \n");
         System.out.println("Su nombre es: " + nombre );
         System.out.println("Su apellido es: " + apellido );
         System.out.println("Su edad es: " + edad );
         System.out.println("Su hobbie es: " + hobbie );
         System.out.println("Su editor preferido es: " + editorPreferido );
         System.out.println("Su sistema operativo es: " + sistemaOperativo );
    }
    
}
