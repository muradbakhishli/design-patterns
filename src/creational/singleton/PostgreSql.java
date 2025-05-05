package creational.singleton;

public class PostgreSql {

    private static PostgreSql instance;

    private String command = "First command ";

    private PostgreSql() {

    }

    public static PostgreSql getInstance() {
        if (instance == null) {
            instance = new PostgreSql();
        }
        return instance;
    }

    public void addCommand(String command) {
        instance.command += command;
    }

    public String getCommand() {
        return instance.command;
    }

}
