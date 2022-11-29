package Chapters.Chapter_13.E_01;

import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;


    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    @Override
    public String toString() {
        return "created on " + dateCreated + "\nColor: " + color + "\n Filled: " + filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
