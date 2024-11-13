package com.apcemedicom.modelo;
import javax.persistence.*;
@Entity
@Table(name = "catalogo")
public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long catalogoId;
    @ManyToOne
    @JoinColumn(name = "productoId")
    private Producto producto;
    @Column(columnDefinition = "decimal(10,2)")
    private Double precioOferta;
    public Long getCatalogoId() {
        return catalogoId;
    }
    public void setCatalogoId(Long catalogoId) {
        this.catalogoId = catalogoId;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Double getPrecioOferta() {
        return precioOferta;
    }
    public void setPrecioOferta(Double precioOferta) {
        this.precioOferta = precioOferta;
    }
    public Catalogo(){

    }
}
