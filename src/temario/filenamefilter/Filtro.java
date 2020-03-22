package temario.filenamefilter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Clase Filro que implementa el interface FilenameFilter
 * @author José Javier Bermúdez Hernández 
 */
public class Filtro implements FilenameFilter {

    String extension ;

    /**
     * Constructor
     * @param extension Parámetro extensión del fichero
     */
    Filtro(String extension) {
        this.extension = extension ;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(extension) ;
    }
   
}