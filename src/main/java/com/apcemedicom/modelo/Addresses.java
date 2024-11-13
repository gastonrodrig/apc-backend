package com.apcemedicom.modelo;
import javax.persistence.*;
@Entity
@Table(name = "addresses")
public class Addresses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    @ManyToOne
    @JoinColumn(name = "provinceId")
    private Provinces province;
    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Departments department;
    @ManyToOne
    @JoinColumn(name = "districtId")
    private Districts district;
    @ManyToOne
    @JoinColumn(name = "id")
    private Usuario user;

    private String name;
    public Long getAddressId() {
        return addressId;
    }
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
    public Provinces getProvince() {
        return province;
    }
    public void setProvince(Provinces province) {
        this.province = province;
    }
    public Departments getDepartment() {
        return department;
    }
    public void setDepartment(Departments department) {
        this.department = department;
    }
    public Districts getDistrict() {
        return district;
    }
    public void setDistrict(Districts district) {
        this.district = district;
    }
    public Usuario getUser() {
        return user;
    }
    public void setUser(Usuario user) {
        this.user = user;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public Addresses(){

    }
}

