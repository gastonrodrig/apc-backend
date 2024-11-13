package com.apcemedicom.modelo;
import javax.persistence.*;

@Entity
@Table(name = "ordersDetails")
public class OrdersDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ordersdetailsId;
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Orders order;
    @ManyToOne
    @JoinColumn(name = "productoId")
    private Producto product;
    @Column(columnDefinition = "decimal(10,2)")
    private Double unitPrice;
    private Long quantity;
    @Column(columnDefinition = "decimal(10,2)")
    private Double totalPrice;
    @Column(name = "createdAt")
    private java.util.Date createdAt;

    public Long getOrdersdetailsId() {
        return ordersdetailsId;
    }

    public void setOrdersdetailsId(Long ordersdetailsId) {
        this.ordersdetailsId = ordersdetailsId;
    }
    public Orders getOrder() {
        return order;
    }
    public void setOrder(Orders order) {
        this.order = order;
    }
    public Producto getProduct() {
        return product;
    }
    public void setProduct(Producto product) {
        this.product = product;
    }
    public Double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Long getQuantity() {
        return quantity;
    }
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
    public Double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }
    public OrdersDetails(){

    }
}

