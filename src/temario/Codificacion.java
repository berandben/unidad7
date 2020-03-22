/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 *
 * @author jjmbe
 */
public class Codificacion {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        FileInputStream fichero;
        try {
            // Elegimos fichero para leer flujos de bytes "crudos"
            fichero = new FileInputStream("datos.txt");
            // InputStreamReader sirve de puente de flujos de byte a caracteres
            InputStreamReader unReader = new InputStreamReader(fichero);
            // Vemos la codificación actual
            System.out.println(unReader.getEncoding());
        } catch (FileNotFoundException ex) {
            System.err.println(Codificacion.class.getName());
        }
    }
    
}
