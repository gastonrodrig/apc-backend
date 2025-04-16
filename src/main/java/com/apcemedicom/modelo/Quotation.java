package com.apcemedicom.modelo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "quotation")
public class Quotation {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long quotationId;
  
  public enum Divisa { SOLES, DOLAR }
  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private Divisa divisa;
  
  public enum TipoPago { CONTADO, CREDITO }
  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private TipoPago tipoPago;
  
  @Temporal(TemporalType.DATE)
  @Column(nullable = false)
  private Integer plazoEntrega;
  
  @Temporal(TemporalType.DATE)
  @Column(nullable = false)
  private Date validezOferta;
  
  // Constructor vacío (requerido por JPA)
  public Quotation() {
  }
  
  // Getters y Setters
  public Long getQuotationId() {
    return quotationId;
  }
  
  public void setQuotationId(Long quotationId) {
    this.quotationId = quotationId;
  }
  
  public Divisa getDivisa() {
    return divisa;
  }
  
  public void setDivisa(Divisa divisa) {
    this.divisa = divisa;
  }
  
  public TipoPago getTipoPago() {
    return tipoPago;
  }
  
  public void setTipoPago(TipoPago tipoPago) {
    this.tipoPago = tipoPago;
  }
  
  public int getPlazoEntrega() {
    return plazoEntrega;
  }
  
  public void setPlazoEntrega(int plazoEntrega) {
    this.plazoEntrega = plazoEntrega;
  }
  
  public Date getValidezOferta() {
    return validezOferta;
  }
  
  public void setValidezOferta(Date validezOferta) {
    this.validezOferta = validezOferta;
  }
}
