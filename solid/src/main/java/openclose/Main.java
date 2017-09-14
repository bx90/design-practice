package openclose;

/**
 * Strategy pattern
 * template pattern
 */
public class Main {

    public static void main(String[] args) {
        Sorter insertion = new InsertionSort();
        Sorter bubble = new BubbleSort();

        SortCaller caller = new SortCaller();
        caller.sort(insertion);
        caller.sort(bubble);

    }
}
