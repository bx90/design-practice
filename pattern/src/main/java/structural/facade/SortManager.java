package structural.facade;

public class SortManager {
    private Algorithm bubbleSort;
    private Algorithm mergeSort;

    public SortManager() {
        this.bubbleSort = new BubbleSort();
        this.mergeSort = new MergeSort();
    }

    public void bubbleSort() {
        bubbleSort.sort();
    }

    public void mergeSort() {
        mergeSort.sort();
    }
}
