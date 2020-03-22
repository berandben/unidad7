/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temario;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Ber&ben
 */
public class Copiar {
    
    
    void copia(InputStream fentrada, OutputStream fsalida) {
        
        try {
            int n = 0;
            
            byte[] buffer = new byte[256];
            while((n = fentrada.read(buffer)) >= 0)
                fsalida.write(buffer,0,n) ;
            
            fentrada.close();
            fsalida.close();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Copiar copiar = new Copiar();
        copiar.copia(fentrada, fsalida);
    }
    
}
