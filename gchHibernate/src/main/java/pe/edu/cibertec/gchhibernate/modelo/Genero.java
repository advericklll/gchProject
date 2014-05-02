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
@Table(name="TAB_GENRE")
public class Genero implements Serializable{
    @Id 
    @Column(name="IDENTIFIER")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer codigo;
    
    @Column(name="DESCRIPTION")
    private String descripcion;
    
    @Column(name="SMALLDESC")
    private String small;

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

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    @Override
    public String toString() {
        return "Genero{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", small=" + small + '}';
    }    
}
