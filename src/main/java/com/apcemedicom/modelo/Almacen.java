package com.apcemedicom.modelo;
import javax.persistence.*;
@Entity
@Table(name = "almacenes")
public class Almacen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long almacenId;
    private String descripcion;
    private String direccion;
    @Column(name = "datecreated")
    private java.util.Date dateCreated;
    private Integer status;

    public Long getAlmacenId() {
        return almacenId;
    }

    public void setAlmacenId(Long almacenId) {
        this.almacenId = almacenId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Integer getStatus(){return status;}
    public void setStatus(Integer status){this.status = status;}

    public Almacen(){

    }
}

