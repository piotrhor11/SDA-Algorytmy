package Algorithms;

import Struktury.Heap;

public class HeapTest extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Heap Test";
    }

    @Override
    public void runAlgorithm(String[] input) {

        Heap kopiec = new Heap(input.length - 1);

        for (int i = 1; i < input.length; i++) {
            kopiec.insertElement(Integer.parseInt(input[i]));
        }

        kopiec.printHeap();
        System.out.println();

        int heapSize = kopiec.get_counter();
        for (int i = 0; i < heapSize; i++) {
            System.out.printf("\nUsunięto %d", kopiec.removeElement());
            kopiec.printHeap();
            System.out.println();

        }

    }
}
