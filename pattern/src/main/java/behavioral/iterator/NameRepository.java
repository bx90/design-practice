package behavioral.iterator;

public class NameRepository {
    private String[] name = {"a", "b"};

    public Iterator getIterator() {
        return new NameIterator(name);
    }
}
