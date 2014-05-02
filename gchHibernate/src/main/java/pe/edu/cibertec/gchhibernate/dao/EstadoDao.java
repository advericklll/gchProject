/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.gchhibernate.dao;

import java.util.List;
import pe.edu.cibertec.gchhibernate.modelo.Estado;

/**
 *
 * @author Lucas
 */
public interface EstadoDao {
    List<Estado> listarTodo();    
    Estado obtenerSegun(Integer codigo);
}
