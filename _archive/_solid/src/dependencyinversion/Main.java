package dependencyinversion;

public class Main {
    public static void main(String[] args) {
        DatabaseRelatedAction mySQL = new DatabaseRelatedAction(new MySQL());
        DatabaseRelatedAction oracle = new DatabaseRelatedAction(new Oracle());

        mySQL.connect();
        mySQL.diconnect();

        oracle.connect();
        oracle.diconnect();

    }
}
