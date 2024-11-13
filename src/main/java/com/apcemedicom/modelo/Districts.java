package com.apcemedicom.modelo;
import javax.persistence.*;
@Entity
@Table(name = "districts")
public class Districts {
    @Id
    @Column(name = "districtId", nullable = false, unique = true)
    private String districtId;
    private String name;
    @ManyToOne
    @JoinColumn(name = "provinceId")
    private Provinces province;
    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Departments department;
    private String type;
    public String getDistrictId() {
        return districtId;
    }
    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public String getType(){ return type; }
    public void setType(String type) {this.type = type; }
    public Districts(){

    }
}

