/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temario;

import java.io.IOException;

/**
 *
 * @author Ber&ben
 */
public class FlujosPredefinidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeroUnicode;

        

        System.out.println("Introduce un carácter");

        try {

            numeroUnicode = System.in.read();//lee la entrada de teclado
            System.out.println("El número unicode es " + numeroUnicode);

            //convierte el número unicode en carácter y a su vez en cadena
            String s = Character.toString((char) numeroUnicode);

            System.out.println("El carácter es:" + s);
            
           
            
//            System.out.println("Introduce otro carácter");
//            System.out.println(System.in.read());//Imprime por consola el carácter introducido

        } catch (IOException e) {

            System.out.println("Error de entrada/salida");
        }
    }

}
