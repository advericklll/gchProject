/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.gchhibernate.service;

import java.util.List;
import pe.edu.cibertec.gchhibernate.dao.ProfesorDao;
import pe.edu.cibertec.gchhibernate.dao.ProfesorDaoImpl;
import pe.edu.cibertec.gchhibernate.modelo.Profesor;

/**
 *
 * @author Lucas
 */
public class ProfesorService {
    private ProfesorDao profesorDao;

    public ProfesorService() {
        this.profesorDao = ProfesorDaoImpl.getInstance();
    }

    public ProfesorDao getProfesorDao() {
        return profesorDao;
    }

    public void setProfesorDao(ProfesorDao profesorDao) {
        this.profesorDao = profesorDao;
    }
 
    public void registrar(Profesor profesor) {
        profesorDao.registrar(profesor);
    }

    public void actualizar(Profesor profesor) {
        profesorDao.actualizar(profesor);
    }

    public void eliminarSegun(Integer codigo) {
        profesorDao.eliminarSegun(codigo);
    }

    public List<Profesor> listarTodo() {
        return profesorDao.listarTodo();
    }

    public List<Profesor> listarSegun(String nombre, String apellidoPaterno, String apellidoMaterno) {
        System.out.println("Se hizo la consulta de manera local:\n");
        return profesorDao.listarSegun(nombre, apellidoPaterno, apellidoMaterno);
    }

    public Profesor obtenerSegun(Integer codigo) {
        return profesorDao.obtenerSegun(codigo);
    }    
}
