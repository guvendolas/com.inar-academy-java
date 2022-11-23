package Chapters.Chapter_12.Chapter_12_Exercises.E_09;

public class BinaryFormatException extends NumberFormatException {
    public BinaryFormatException(String binaryString) {
        super("Invalid binary string: " + binaryString);
    }
}
