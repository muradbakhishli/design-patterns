package structural.decorator;

public class Main {
    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());

        coffee = new SugarCoffee(coffee);
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());

    }
}
