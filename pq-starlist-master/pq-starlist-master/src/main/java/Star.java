public class Star implements Comparable<Star> {

    // Star color from coolest to hottest
    // is red -> orange -> yellow -> white -> blue
    public enum Color {
        RED, ORANGE, YELLOW, WHITE, BLUE
    }

    private String name;
    private Color color;
    private float mass; // in solar masses, so the sun is 1.0

    public Star(String name, Color color, float mass) {
        this.name = name;
        this.color = color;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public float getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return String.format("%s: %s / %.2fM", name, color, mass);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Star) {
            return this.name.equals(((Star) o).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public int compareTo(Star other) {
        return this.getName().compareTo(other.getName());
    }


}
