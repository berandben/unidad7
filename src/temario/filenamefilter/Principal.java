package temario.filenamefilter;

import java.io.File;

/**
 * Clase principal para probar el
 * @author José Javier Bermúdez Hernández 
 */
public class Principal {
    
    public static void main(String[] args) {
        try {
            File fichero = new File(".");
            String[] listadeArchivos = fichero.list();
            System.out.println("Lista de archivos del directorio activo sin filtrar (incluyendo Carpetas).");
            int numarchivos = listadeArchivos.length;
            if (numarchivos < 1) {
                System.out.println("No hay archivos que listar");
            } else {
                for (int conta = 0; conta < listadeArchivos.length; conta++) {
                    if ((new File(listadeArchivos[conta])).isDirectory()) {
                        System.out.println("Directorio: " + listadeArchivos[conta]);
                    } else {
                        System.out.println("Archivo: " + listadeArchivos[conta]);
                    }
                }
            }

            listadeArchivos = fichero.list(new Filtro(".odt"));
            numarchivos = listadeArchivos.length;
            System.out.println("Lista de archivos del directorio activo APLICANDO FILTRO .odt (incluyendo Carpetas).");
            if (numarchivos < 1) {
                System.out.println("No hay archivos que listar");
            } else {
                for (int conta = 0; conta < listadeArchivos.length; conta++) {
                    if ((new File(listadeArchivos[conta])).isDirectory()) {
                        System.out.println("Directorio: " + listadeArchivos[conta]);
                    } else {
                        System.out.println("Archivo: " + listadeArchivos[conta]);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error al buscar en la ruta indicada");
            System.out.println(ex.getMessage());
        }
    }
}
