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
public class FileSeparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String miRuta= "C:" + File.separator + "micarpeta" + File.separator;
        
        System.out.println(miRuta);
    }
    
}
