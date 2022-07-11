package web.models;

import org.springframework.stereotype.Component;


public class Car {
    private String model;

    private String color;

    private int id;

    public Car() {
    }

    public Car(int id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }


}
