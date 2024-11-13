package com.apcemedicom.modelo;
import javax.persistence.*;
@Entity
@Table(name = "solicitudes")
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long solicitudId;
    @ManyToOne
    @JoinColumn(name = "id")
    private Usuario user;
    @ManyToOne
    @JoinColumn(name = "productoId")
    private Producto product;
    @Column(columnDefinition = "decimal(10,2)")
    private Double subtotalPrice;
    @Column(columnDefinition = "decimal(10,2)")
    private Double deliveryPrice;
    @Column(columnDefinition = "decimal(10,2)")
    private Double totalPrice;
    private String streetAddress;
    private String status;
    @Column(name = "createdAt")
    private java.util.Date createdAt;
    private Long quantity;
    private Double unitPrice;
    @Column(name = "fechaPlazo")
    private java.util.Date fechaPlazo;

    public Long getSolicitudId() {
        return solicitudId;
    }
    public void setSolicitudId(Long solicitudId) {
        this.solicitudId = solicitudId;
    }
    public Usuario getUser() {
        return user;
    }
    public void setUser(Usuario user) {
        this.user = user;
    }
    public Producto getProduct() {
        return product;
    }
    public void setProduct(Producto product) {
        this.product = product;
    }
    public Double getSubtotalPrice() {
        return subtotalPrice;
    }
    public void setSubtotalPrice(Double subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
    }
    public Double getDeliveryPrice() {
        return deliveryPrice;
    }
    public void setDeliveryPrice(Double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }
    public Double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getStreetAddress() {
        return streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public String getStatus(){return status;}
    public void setStatus(String status){this.status = status;}
    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }
    public java.util.Date getFechaPlazo() {
        return fechaPlazo;
    }
    public void setFechaPlazo(java.util.Date fechaPlazo) {
        this.fechaPlazo = fechaPlazo;
    }
    public Long getQuantity(){return quantity;}
    public void setQuantity(Long quantity){this.quantity = quantity;}
    public Double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Solicitud(){

    }
}

