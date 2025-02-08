package org.example.tractoare.Domain;

public class Tractor {
    Integer id;
    String name;
    Integer price;

    public Tractor(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    //Creat de Paul, nu asa se face da nu aveam acces la Clasa tractor
}
