package Chapters.Chapter_09.E13;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location() {
        this(0,0,Double.MAX_VALUE);
    }
    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return this.maxValue;
    }

    public String toString() {
        return "Row --> " + getRow() + "  \nColumn --> " + getColumn() + "  \nMaxValue --> " + getMaxValue() + "\n";
    }
}
