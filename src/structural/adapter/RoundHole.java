package structural.adapter;

public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fit(RoundPeg peg) {
        return peg.getRadius() <= radius;
    }
}
