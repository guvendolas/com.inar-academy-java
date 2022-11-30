package Chapters.Chapter_13.E_11;

import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean isFilled;
    private java.util.Date createdDate;

    protected GeometricObject() {
        createdDate = new Date();
    }
    protected GeometricObject (String color, boolean isFilled) {
        createdDate = new Date();
        this.color = color;
        this.isFilled = isFilled;
    }
    public String getColor() {
        return color;
    }
    public void setColor (String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    @Override
    public String toString() {
        return "date created " + createdDate + "\nColor: " + this.color + "\nİs Filled: " + this.isFilled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
