package creational.singleton.withEnum;

public enum PostgreSql {

    INSTANCE;

    private static String command = "First command ";

    public void addCommand(String addCommand) {
        command += addCommand;
    }

    public String getCommand() {
        return command;
    }
}
