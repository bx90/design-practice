package behavioral.template;

public class BubbleSort extends Algorithm {
    @Override
    public void initialize() {
        System.out.println("Bubble sort:: Initializing...");
    }

    @Override
    public void sorting() {
        System.out.println("Bubble sort:: Sorting ...");
    }

    @Override
    public void printEachElement() {
        System.out.println("Bubble sort:: Printing ...");
    }
}
