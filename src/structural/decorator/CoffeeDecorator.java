package structural.decorator;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee decoratorCoffee;

    public CoffeeDecorator(Coffee coffee) {
        decoratorCoffee = coffee;
    }

    public String getDescription() {
        return decoratorCoffee.getDescription();
    }

    public double getCost() {
        return decoratorCoffee.getCost();
    }

}
