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
public class FlujosPredefinidos2 {
    
    public static void main(String[]args){

    /**
     * @param args the command line arguments
     */
   // Cadena donde iremos almacenando los caracteres que se escriban
        StringBuilder str = new StringBuilder();
        
        char c;
        // Por si ocurre una excepci�n ponemos el bloque try-cath
        
        try{
            // Mientras la entrada de terclado no sea Intro
            while ((c=(char)System.in.read())!='\n'){
                // Añadir el character le�do a la cadena str
             	str.append(c);
            }
       } catch(IOException ex) {
            System.out.println(ex.getMessage()); 
       }

       // Escribir la cadena que se ha ido tecleando
       System.out.println("Cadena introducida: " + str);
    }
    
}
