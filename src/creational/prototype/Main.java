package creational.prototype;

public class Main {
    public static void main(String[] args) {

        var circleOriginal = new Circle(4);
        var circleCopy = circleOriginal.copy();

        System.out.println(circleOriginal);
        System.out.println(circleCopy);
        System.out.println(circleOriginal == circleCopy);

        System.out.println("----------------------------------");

        var rectangleOriginal = new Rectangle(4, 5);
        var rectangleCopy = rectangleOriginal.copy();

        System.out.println(rectangleOriginal);
        System.out.println(rectangleCopy);
        System.out.println(rectangleOriginal == rectangleCopy);
    }
}
