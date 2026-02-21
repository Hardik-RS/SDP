public class rectangle implements shape {

    private double length;
    private double width;

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String draw() {
        return "Drawing rectangle";
    }

    public String fillColour() {
        return "Filling rectamgle with Red";
    }
}
