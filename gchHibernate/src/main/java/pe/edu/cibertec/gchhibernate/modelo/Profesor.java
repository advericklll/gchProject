package pe.edu.cibertec.gchhibernate.modelo;

import java.io.Serializable;

/**
 * Representa a un docente de la institucion.
 */
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="TAB_PROFESSOR")
public class Profesor implements Serializable{

    @Id 
    @Column(name="IDENTIFIER")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer codigo;
    
    @Column(name="FIRSTNAME")
    private String nombres;
    
    @Column(name="MIDLENAME")
    private String apellidoPaterno;
    
    @Column(name="LASTNAME")
    private String apellidoMaterno;
    
    @Column(name="ADDRESS")
    private String direccion;
    
    @Column(name="REFERENCE")
    private String referencia;
    
    @Column(name="PHONE1")
    private long telefono1;
    
    @Column(name="PHONE2")
    private long telefono2;//celular   
    
    @Column(name="EMAIL1")
    private String email1;
    
    @Column(name="EMAIL2")
    private String email2;  

    @Column(name="BIRTHDATE")
    private String fechaNacimiento;
    
    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="GENRE",referencedColumnName="IDENTIFIER")
    private Genero genero;
    
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="STATE",referencedColumnName="IDENTIFIER")
    private Estado estadoCivil;
    
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }    

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }   

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public long getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(long telefono1) {
        this.telefono1 = telefono1;
    }

    public long getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(long telefono2) {
        this.telefono2 = telefono2;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Estado getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Estado estadoCivil) {
        this.estadoCivil = estadoCivil;
    }    
    
    
    @Override
    public String toString() {
        return "Profesor{" + "codigo=" + codigo + ", nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", direccion=" + direccion + ", referencia=" + referencia + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + ", email1=" + email1 + ", email2=" + email2 + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", estadoCivil=" + estadoCivil + '}';
    }
}
