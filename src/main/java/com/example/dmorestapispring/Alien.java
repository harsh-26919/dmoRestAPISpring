package com.example.dmorestapispring;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="alien")
public class Alien
{
    @Id
    private int aid;
    private String aname;
    private String color;

    public String getName() {
        return aname;
    }

    public void setName(String name) {
        this.aname = aname;
    }

    public int getId() {
        return aid;
    }

    public void setId(int aid) {
        this.aid = aid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "name='" + aname + '\'' +
                ", id=" + aid +
                ", color=" + color +
                '}';
    }
}