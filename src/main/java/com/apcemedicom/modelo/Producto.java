package com.apcemedicom.modelo;
import javax.persistence.*;
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoId;
    private String nombreProducto;
    private String SKU;
    @Column(columnDefinition = "decimal(10,2)")
    private Double precio;
    private Integer stock;
    private String descripcion;
    private String imagen;
    @Column(name = "datecreated")
    private java.util.Date dateCreated;
    private Integer status;
    @ManyToOne
    @JoinColumn(name = "categoriaId")
    private Categoria categoria;
    public Long getProductoId() {
        return productoId;
    }
    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public String getSKU() {
        return SKU;
    }
    public void setSKU(String SKU) {
        this.SKU = SKU;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public Integer getStock(){ return stock; }
    public void setStock(Integer stock){this.stock = stock;}
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Integer getStatus(){return status;}
    public void setStatus(Integer status){this.status = status;}
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Producto(){

    }
}

