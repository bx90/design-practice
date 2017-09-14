package dependencyinversion;

public class Oracle implements Database {
    @Override
    public void connect() {
        System.out.println("Orace::connecting...");
    }

    @Override
    public void disconnect() {
        System.out.println("Orace::disconnecting...");
    }
}
