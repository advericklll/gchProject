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
 * @author JavaADV
 */

public class ServiceBD extends ProfesorService{
    ProfesorDao profesorDao;
    

    @Override
    public void construct() {
        profesorDao = ProfesorDaoImpl.getInstance();
        System.out.println("Se establecio una conexion Local");
    }

    @Override
    public void identify() {
        
    }

    @Override
    public void registrar(Profesor profesor) {
        profesorDao.registrar(profesor);
    }

    @Override
    public void actualizar(Profesor profesor) {
        profesorDao.actualizar(profesor);
    }

    @Override
    public void eliminarSegun(String codigo) {
        profesorDao.eliminarSegun(codigo);
    }

    @Override
    public List<Profesor> listarTodo() {
        return profesorDao.listarTodo();
    }

    @Override
    public List<Profesor> listarSegun(String nombre, String apellidoPaterno, String apellidoMaterno) {
        System.out.println("Se hizo la consulta de manera local:\n");
        return profesorDao.listarSegun(nombre, apellidoPaterno, apellidoMaterno);
    }

    @Override
    public Profesor obtenerSegun(String codigo) {
        return profesorDao.obtenerSegun(codigo);
    }
    
}
