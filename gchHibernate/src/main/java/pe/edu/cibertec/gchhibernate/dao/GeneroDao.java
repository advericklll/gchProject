/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.gchhibernate.dao;

import java.util.List;
import pe.edu.cibertec.gchhibernate.modelo.Genero;

/**
 *
 * @author Lucas
 */
public interface GeneroDao {
    List<Genero> listarTodo();
    Genero obtenerSegun(Integer codigo);
}
