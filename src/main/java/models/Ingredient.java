package models;

import java.io.Serializable;

public class Ingredient implements Serializable {
    //id
    private long id;
    //title
    private String title;
    //quantity
    private int quantity;

    //Zero-Argument Constructor
    public Ingredient(){}

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
