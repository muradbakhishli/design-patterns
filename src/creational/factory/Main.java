package creational.factory;

import static creational.factory.LogisticType.*;

public class Main {
    public static void main(String[] args) {

        var roadLogisticFactory = createLogisticFactoryWithEnum(SEA);
        var roadLogistic = roadLogisticFactory.create();
        roadLogistic.delivery();

    }

    private static LogisticFactory createLogisticFactoryWithEnum(LogisticType type) {
        return switch (type) {
            case ROAD -> new RoadLogisticFactory();
            case SEA -> new SeaLogisticFactory();
        };
    }
}
