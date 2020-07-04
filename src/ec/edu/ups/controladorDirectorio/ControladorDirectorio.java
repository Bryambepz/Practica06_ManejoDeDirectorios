/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladorDirectorio;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author braya
 */
public class ControladorDirectorio {
    private String ruta;
    private File archivo;
    private File[] archivos;

    public ControladorDirectorio(String ruta) {
        this.ruta = ruta;
    }
    
    public void crearDirectorio(String nombre){
        archivo = new File(ruta + File.separator + nombre);
        archivo.mkdir();
    }
    
    public List<String> listarArchivos(String ruta){
        List<String> listar = new ArrayList<>();
        for (String directorio : listar) {
            listar.add(directorio);
        }
        return listar;
    }
    
//    public String listarArchivos(String ruta){
//        
//        for (File archivo1 : archivos) {
//            if(archivo1.isDirectory()){
//                return archivo1.getAbsolutePath();
//            }
//        }
//        return null;
//    }
}
