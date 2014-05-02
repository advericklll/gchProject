/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.gchhibernate.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Lucas
 */
@Entity
@Table(name="TAB_STATE")
public class Estado implements Serializable{
    
    @Id 
    @Column(name="IDENTIFIER")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer codigo;
    
    @Column(name="DESCRIPTION")
    private String descripcion;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Estado{" + "codigo=" + codigo + ", descripcion=" + descripcion + '}';
    }  
}
