package dependencyinversion;

public class MySQL implements Database {
    @Override
    public void connect() {
        System.out.println("MySQL::connecting...");
    }

    @Override
    public void disconnect() {
        System.out.println("MySQL::disconnecting...");
    }
}
