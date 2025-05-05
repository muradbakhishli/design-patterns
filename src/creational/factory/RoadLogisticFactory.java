package creational.factory;

public class RoadLogisticFactory implements LogisticFactory{

    public Logistic create(){
        return new RoadLogistic();
    }
}
