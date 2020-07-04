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
    
    public void crearDirectorio(String nombre, String ruta){
        archivo = new File(ruta + File.separator + nombre);
        if (archivo.exists() == false) {
            archivo.mkdir();
        }
    }
    
    public List<String> listarDirectorios(String ruta){
        List<String> listar = new ArrayList<>();
        listar.clear();
        archivo = new File(ruta);
        archivos = archivo.listFiles();
        for (File directorio : archivos) {
            if(!directorio.isHidden()){
                listar.add(directorio.getName());
            }
        }
        return listar;
    } 
    
    
//    public List<String> listarDirectorios(){
//        
//    }
}
