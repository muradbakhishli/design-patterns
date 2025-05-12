package structural.decorator;

public class SugarCoffee extends CoffeeDecorator {

    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return decoratorCoffee.getDescription() + ", Sugar";
    }

    public double getCost() {
        return decoratorCoffee.getCost() + 0.5;
    }
}
