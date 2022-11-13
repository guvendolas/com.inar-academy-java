package Chapters.Chapter_11.E_01;

import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date createDate;

    public GeometricObject(){
        this("white",false);
    }

    public GeometricObject(String color, boolean filled) {
        createDate = new Date();
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    @Override
    public String toString(){
        return "Create: " + createDate + " color " + color + " filled " + filled;
    }

}
