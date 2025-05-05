package creational.builder;

public class Main {
    public static void main(String[] args) {


        Stadium stadium = new Stadium.Builder()
                .setName("Cam Nou")
                .setCapacity(95_000)
                .build();

        System.out.println(stadium);
    }
}
