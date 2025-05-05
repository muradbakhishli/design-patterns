package creational.singleton.withEnum;

import static creational.singleton.withEnum.PostgreSql.INSTANCE;

public class Main {
    public static void main(String[] args) {

        PostgreSql database1 = INSTANCE;
        database1.addCommand("Second command ");
        PostgreSql database2 = INSTANCE;
        database2.addCommand("Third command ");

        System.out.println(INSTANCE.getCommand());
        System.out.println(INSTANCE.getCommand());
    }
}
