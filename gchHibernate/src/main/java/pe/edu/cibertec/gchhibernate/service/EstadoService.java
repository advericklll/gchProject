/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.gchhibernate.service;

import java.util.List;
import pe.edu.cibertec.gchhibernate.dao.EstadoDao;
import pe.edu.cibertec.gchhibernate.dao.EstadoDaoImpl;
import pe.edu.cibertec.gchhibernate.modelo.Estado;

/**
 *
 * @author Lucas
 */
public class EstadoService {
    private EstadoDao estadoDao;

    public EstadoDao getEstadoDao() {
        return estadoDao;
    }

    public void setEstadoDao(EstadoDao estadoDao) {
        this.estadoDao = estadoDao;
    }

    public EstadoService() {
        estadoDao = EstadoDaoImpl.getInstance();
        System.out.println("Se establecio una conexion Local");
    } 
    
    public void construct() {
        
    }
    
    public List<Estado> listarTodo() {
        return estadoDao.listarTodo();
    }
    
    public Estado obtenerSegun(Integer codigo) {
        return estadoDao.obtenerSegun(codigo);
    } 
    
    
}
