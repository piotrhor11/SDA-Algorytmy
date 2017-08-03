package Struktury;

public class Heap {

    private int[] _data;
    private int _counter = 0;

    public Heap(int n) {

        this._data = new int[n];

    }

    public void insertElement(int element) {

        int elementIndex = _counter;
        int parentIndex = Math.floorDiv(_counter - 1, 2);

        while (parentIndex < _data.length && elementIndex > 0 && _data[parentIndex] < element) {
            _data[elementIndex] = _data[parentIndex];
            elementIndex = parentIndex;
            parentIndex = (elementIndex - 1) / 2;
        }
        _data[elementIndex] = element;
        _counter++;
    }

    public void removeElement() {            //Todo Remove method

    }

    public void printHeap() {                       //ToDo wydruk w formie choinki
        for (int i = 0; i < _data.length; i++) {
            if ((int) Math.pow(2, i) % (i + 1) == 0) {
                System.out.printf("\n");
            }
            System.out.printf(" %d ", _data[i]);
        }
    }
}
