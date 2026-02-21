public class Square implements shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }
    
    public String draw() {
        return "Drawing Square";
    }

    public String fillColour() {
        return "Filling Square with Blue";
    }
}
