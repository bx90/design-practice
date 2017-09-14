package behavioral.template;

public abstract class Algorithm {
    public abstract void initialize();
    public abstract void sorting();
    public abstract void printEachElement();

    public void sort() {
        initialize();
        sorting();
        printEachElement();
    }
}
