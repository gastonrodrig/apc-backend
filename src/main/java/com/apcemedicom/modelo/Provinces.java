package com.apcemedicom.modelo;
import javax.persistence.*;
@Entity
@Table(name = "provinces")
public class Provinces {
    @Id
    @Column(name = "provinceId", nullable = false, unique = true)
    private String provinceId;
    private String name;
    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Departments department;
    public String getProvinceId() {
        return provinceId;
    }
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Departments getDepartment() {
        return department;
    }
    public void setDepartment(Departments department) {
        this.department = department;
    }
    public Provinces(){

    }
}

