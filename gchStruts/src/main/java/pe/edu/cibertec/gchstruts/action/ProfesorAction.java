/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.gchstruts.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import pe.edu.cibertec.gchhibernate.modelo.Estado;
import pe.edu.cibertec.gchhibernate.modelo.Profesor;
import pe.edu.cibertec.gchhibernate.service.EstadoService;
import pe.edu.cibertec.gchhibernate.service.ProfesorService;

/**
 *
 * @author Lucas
 */
/*
 Profesor Action: Controlador Profesor - CRUD
 */
public class ProfesorAction extends ActionSupport implements SessionAware {

    private Profesor profesor;
    private List<Profesor> profesores;    
    private List<Estado> estados;

    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Integer codigo;
    
    ProfesorService serviceProfesorBD= new ProfesorService();;
    EstadoService serviceEstadoBD = new EstadoService();;
    
    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String iniciar() throws Exception {
        // trae los profesores en la fuente de datos      
        profesores = serviceProfesorBD.listarTodo();
        return "list";
    }

    //nuevo
    public String registrar() throws Exception {        
        estados=serviceEstadoBD.listarTodo();
        return "create";
    }

    //editar
    public String editar() throws Exception {
        profesor = serviceProfesorBD.obtenerSegun(codigo);
        return "create";
    }

    public String confirmar() throws Exception {
        
        if (null== profesor.getCodigo() || profesor.getCodigo() == 0) {
            serviceProfesorBD.registrar(profesor);
            //actualizar      
        } else {
            serviceProfesorBD.actualizar(profesor);
        }
        profesores = serviceProfesorBD.listarTodo();
        return "list";
    }

    public String detalle() throws Exception {
        profesor = serviceProfesorBD.obtenerSegun(codigo);
        return "details";
    }

    public String eliminar() throws Exception {
        serviceProfesorBD.eliminarSegun(codigo);
        profesores = serviceProfesorBD.listarTodo();
        return SUCCESS;
    }

    public String buscar() throws Exception {
        // trae los profesores en la fuente de datos    
        profesores = serviceProfesorBD.listarSegun(nombres, apellidoPaterno, apellidoMaterno);
        return "list";
    }

    public void setSession(Map<String, Object> map) {

    }

    public Profesor getProfesor() {
        if (profesor == null) {
            profesor = new Profesor();
        }
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

}
