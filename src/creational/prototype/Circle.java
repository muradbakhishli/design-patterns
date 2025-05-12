package creational.prototype;

import creational.abstractFactory.ProductOwner;

public class Circle implements Prototype {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Object copy() {
        return new Circle(this.radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
