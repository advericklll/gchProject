/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.gchhibernate.service;

import java.util.List;
import pe.edu.cibertec.gchhibernate.dao.GeneroDao;
import pe.edu.cibertec.gchhibernate.dao.GeneroDaoImpl;
import pe.edu.cibertec.gchhibernate.modelo.Genero;

/**
 *
 * @author Lucas
 */
public class GeneroService {
    private GeneroDao generoDao;

    public GeneroService() {
        generoDao = GeneroDaoImpl.getInstance();
        //System.out.println("Se establecio una conexion Local");
    }

    public GeneroDao getGeneroDao() {
        return generoDao;
    }

    public void setGeneroDao(GeneroDao generoDao) {
        this.generoDao = generoDao;
    }

    
    public List<Genero> listarTodo() {
        return generoDao.listarTodo();
    }
    
    public Genero obtenerSegun(Integer codigo) {
        return generoDao.obtenerSegun(codigo);
    }
}
