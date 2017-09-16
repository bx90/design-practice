package creational.singleton;

/**
 * Using Enum will be thread safe, since enum by default is thread safe.
 */
public enum Singleton {

    INSTANCE;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
