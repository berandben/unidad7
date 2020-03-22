/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author jjmbe
 */
public class LecturaArchivosTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //url al archivo
        String urlArchivo = "miarchivo.txt";

        try {

            //Creamos un objeto de la clase File
            File objetoFile = new File(urlArchivo);

            //Abrimos para leer el archivo carácter a carácter
            FileReader objetoFileReader = new FileReader(objetoFile);
            
            //Usamos un buffer para leer líneas completas
            BufferedReader objetoBufferedReader = new BufferedReader(objetoFileReader);
            
            //Imprime la primera línea
            System.out.println(objetoBufferedReader.readLine());
            

        } catch (FileNotFoundException e) {

     //   } catch (IOException e) {

        } catch (Exception e) {

        } finally {

        }

    }
    
}




