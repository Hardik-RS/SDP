public class Circle implements shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String draw() {
        return "Drawing Circle";
    }

    public String fillColour() {
        return "Filling Circle with Yellow";
    }
}

