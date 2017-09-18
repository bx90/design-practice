package structural.facade;
/**
 *  The facade pattern provides a unified interface to a
 *   set of interfaces in a system
 *
 *   		It defines a high level interface
 *   		that makes the subsystem easier to use
 *
 */
public class Main {
    public static void main(String[] args) {
        SortManager sort = new SortManager();
        sort.bubbleSort();
        sort.mergeSort();

    }
}