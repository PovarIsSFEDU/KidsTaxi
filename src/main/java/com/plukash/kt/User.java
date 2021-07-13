package com.plukash.kt;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    private int id;
    @Column(name = "fio")
    private String fio;
    @Column(name = "IsAdmin")
    private Boolean IsAdmin;

    public User(int id) {
        this.id = id;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Boolean getAdmin() {
        return IsAdmin;
    }

    public void setAdmin(Boolean admin) {
        IsAdmin = admin;
    }

    public User(int id, String fio, Boolean isAdmin) {
        this.id = id;
        this.fio = fio;
        IsAdmin = isAdmin;
    }
}
