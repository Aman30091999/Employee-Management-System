package com.api.book.bootrestbook.Controllers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personal")
public class Personal {
    @Id
    @Column(name = "emplyee_Id")
    private int id;
    @Column(name = "First_name")
    private String first_name;
    @Column(name = "Last_name")
    private String last_name;
    @Column(name = "Father_name")
    private String father;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "Local_Add.")
    private String local;
    @Column(name = "Permanent_Add.")
    private String permanent;
  
    public Personal() {
    }
    public Personal(int id, String first_name, String last_name, String father, String phone, String local,
            String permanent) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.father = father;
        this.phone = phone;
        this.local = local;
        this.permanent = permanent;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getFather() {
        return father;
    }
    public void setFather(String father) {
        this.father = father;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getPermanent() {
        return permanent;
    }
    public void setPermanent(String permanent) {
        this.permanent = permanent;
    }
    @Override
    public String toString() {
        return "Personal [father=" + father + ", first_name=" + first_name + ", id=" + id + ", last_name=" + last_name
                + ", local=" + local + ", permanent=" + permanent + ", phone=" + phone + "]";
    }
    

    
}
