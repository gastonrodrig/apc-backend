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
  @Column(name = "plazoEntrega")
  private java.util.Date plazoEntrega;
  @Column(name = "validezOferta")
  private java.util.Date validezOferta;
  
  public Quotation() { }
  public Long getQuotationId() { return quotationId; }
  public void setQuotationId(Long quotationId) { this.quotationId = quotationId; }
  public Divisa getDivisa() { return divisa; }
  public void setDivisa(Divisa divisa) { this.divisa = divisa; }
  public TipoPago getTipoPago() { return tipoPago; }
  public void setTipoPago(TipoPago tipoPago) { this.tipoPago = tipoPago; }
  public java.util.Date getPlazoEntrega() {
    return plazoEntrega;
  }
  public void setPlazoEntrega(java.util.Date plazoEntrega) {
    this.plazoEntrega = plazoEntrega;
  }
  public java.util.Date getValidezOferta() {
    return validezOferta;
  }
  public void setValidezOferta(java.util.Date validezOferta) {
    this.validezOferta = validezOferta;
  }
  
}
