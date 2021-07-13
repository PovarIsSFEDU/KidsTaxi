package com.plukash.kt;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    private int id;
    @Column(name = "time")
    private String Date_time;
    @Column(name = "place")
    private String place; ///Добавить Lat/lng координаты

    public Order(int id) {
        this.id = id;
    }

    public Order() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate_time() {
        return Date_time;
    }

    public void setDate_time(String date_time) {
        Date_time = date_time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Order(int id, String date_time, String place) {
        this.id = id;
        Date_time = date_time;
        this.place = place;
    }


}
