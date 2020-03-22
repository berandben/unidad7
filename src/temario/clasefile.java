/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author jjmbe
 */
public class clasefile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        File miArchivo = new File("manejoarchivos");
        
          File miArchivo2 = new File("manejoarchivos//otro");
      //renombrar
      //miArchivo.renameTo(new File("manejoarchivos3.txt"));
        
        miArchivo.delete();
        
        miArchivo2.mkdirs();
        
        
      String [] contenidoDirectorio = miArchivo.list();
        
        for(String directorio: contenidoDirectorio){
        
        
            System.out.println(directorio);}
        
        
        
        File nuevoFichero= new File("minuevofichero.txt");
        try{
        nuevoFichero.createNewFile();
        }
        catch(IOException fnfe){
        }
        
    }
    
}
