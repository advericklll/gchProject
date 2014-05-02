/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.gchhibernate.service;

import java.util.List;
import pe.edu.cibertec.gchhibernate.modelo.Profesor;

/**
 *
 * @author JavaADV
 */
public abstract class ProfesorService {
    
    public ProfesorService() {
        super();
        construct();
    }

    public abstract void construct();
    public abstract void identify();
    
    public abstract void registrar(Profesor profesor);
    public abstract void actualizar(Profesor profesor);
    public abstract void eliminarSegun(String codigo);
    public abstract List<Profesor> listarTodo();
    public abstract List<Profesor> listarSegun(String nombre, String apellidoPaterno, String apellidoMaterno);
    public abstract Profesor obtenerSegun(String codigo);
    
}
