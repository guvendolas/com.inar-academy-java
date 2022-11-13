package Weeks.Week_14;

public class Animals {
    private double weight;
    private double height;
    private boolean hasSwimmingSkills;
    private boolean hasFlyingSkills;
    private boolean hasRuns;
    private String eats;
    private boolean hasSleeps;


    public Animals() {
        this(0,0,false,false,false,"null",false);
    }

    public Animals(double weight, double height, boolean hasSwimmingSkills, boolean hasFlyingSkills, boolean hasRuns, String eats, boolean hasSleeps) {
        this.weight = weight;
        this.height = height;
        this.hasSwimmingSkills = hasSwimmingSkills;
        this.hasFlyingSkills = hasFlyingSkills;
        this.hasRuns = hasRuns;
        this.eats = eats;
        this.hasSleeps = hasSleeps;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHasSwimmingSkills() {
        return hasSwimmingSkills;
    }

    public void setHasSwimmingSkills(boolean hasSwimmingSkills) {
        this.hasSwimmingSkills = hasSwimmingSkills;
    }

    public boolean isHasFlyingSkills() {
        return hasFlyingSkills;
    }

    public void setHasFlyingSkills(boolean hasFlyingSkills) {
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public boolean isHasRuns() {
        return hasRuns;
    }

    public void setHasRuns(boolean hasRuns) {
        this.hasRuns = hasRuns;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public boolean isHasSleeps() {
        return hasSleeps;
    }

    public void setHasSleeps(boolean hasSleeps) {
        this.hasSleeps = hasSleeps;
    }
}
