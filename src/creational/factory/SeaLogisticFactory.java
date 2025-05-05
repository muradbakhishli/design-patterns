package creational.factory;

public class SeaLogisticFactory implements LogisticFactory {

    public Logistic create() {
        return new SeaLogistic();
    }
}
