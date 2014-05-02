package pe.edu.cibertec.gchhibernate.dao;

import java.util.List;
import pe.edu.cibertec.gchhibernate.modelo.Profesor;

/**
 * Contrato de operaciones referentes a la entidad de Profesor en la fuente de
 * datos.
 *
 */
public interface ProfesorDao {
    
    void registrar(Profesor profesor);
    void actualizar(Profesor profesor);
    void eliminarSegun(Integer codigo);
    List<Profesor> listarTodo();
    List<Profesor> listarSegun(String nombre, String apellidoPaterno, String apellidoMaterno);
    Profesor obtenerSegun(Integer codigo);

}
