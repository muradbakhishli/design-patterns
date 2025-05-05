package creational.singleton;

public class Main {
    public static void main(String[] args) {


        PostgreSql database1 = PostgreSql.getInstance();
        database1.addCommand("Second command ");
        PostgreSql database2 = PostgreSql.getInstance();
        database2.addCommand("Third command ");

        System.out.println(database1);
        System.out.println(database2);
    }
}
