package com.apcemedicom.modelo;
import javax.persistence.*;
@Entity
@Table(name = "departments")
public class Departments {
    @Id
    @Column(name = "departmentId", nullable = false, unique = true)
    private String departmentId;
    private String name;
    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Departments(){

    }
}

