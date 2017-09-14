package dependencyinversion;

public class DatabaseRelatedAction {
    private Database database;

    public DatabaseRelatedAction(Database database) {
        this.database = database;
    }

    public void connect() {
        database.connect();
    }

    public void diconnect() {
        database.disconnect();
    }
}
