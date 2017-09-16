package creational.singleton;

public class Downloader {
    private static Downloader downloader = new Downloader();

    private Downloader() {

    }

    public static Downloader getDownloader() {
        return downloader;
    }
}
