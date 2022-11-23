package Chapters.Chapter_12.Chapter_12_Exercises.E_08;

public class HexFormatException extends NumberFormatException {
    private String hex; // Hex exception value

    public HexFormatException(String hex) {
        super(hex + " is not a hex string");
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }
}
