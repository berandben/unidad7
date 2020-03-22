/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temario;

import java.io.File;

/**
 *
 * @author jjmbe
 */

    
    public class SeparadorRutas {
    
    /**
     * 
     * @param ruta
     * @return 
     */
    private static String substFileSeparator(String ruta) {
        String separador = "\\";
      
        try {
            // Si estamos en Windows
            if (separador.equals(File.separator))
                separador = "/" ;
        System.out.println("separador" + File.separator);
            // Reemplaza todas las cadenas que coinciden con la expresi�n
            // separador por la cadena File.separator
            return ruta.replaceAll(separador, File.separator);
        }catch(Exception e){
            // Por si ocurre una excepci�n
            return ruta.replaceAll(separador + separador, File.separator);
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String miRuta = "C:\\datos" ;
        
        String laRuta = substFileSeparator(miRuta) ;
        
        System.out.println(laRuta) ;
        
        System.out.println("separador" + File.separator);
    }
    
}
