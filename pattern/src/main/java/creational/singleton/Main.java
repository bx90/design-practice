package creational.singleton;

/**
 * When we would like the keep the state of an object
 * across the system, we can use singleton pattern.
 */
public class Main {
    public static void main(String[] args) {
        // Not thread-safe
        Downloader d = Downloader.getDownloader();

        // Thread-safe
        Singleton.INSTANCE.setName("a");
    }
}
