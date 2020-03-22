/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author jjmbe
 */
public class EscribeFicherosTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          //url al archivo
        String urlArchivo = "miarchivoescrito.txt";
        
         //Creamos un objeto de la clase File
            File objetoFile = new File(urlArchivo);
        
        try {
           
            
            //Abrimos el archivo para escribir
            FileWriter fichero = new FileWriter(objetoFile);
            
            //Abrimos el archivo para reescribir
           // FileWriter fichero = new FileWriter(objetoFile,true);
            
            //Escribimos en el fichero
            PrintWriter pw = new PrintWriter(fichero);

            pw.println("Linea de texto");
            
            //cerramos el archivo
            pw.close();
            
        } catch (FileNotFoundException e) {

     //   } catch (IOException e) {

        } catch (Exception e) {

        } finally {
            
            

        }
    }

}
