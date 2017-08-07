package Struktury;

public class Heap {

    private int[] _data;
    private int _counter = 0;

    public int get_counter() {
        return _counter;
    }

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

    public int removeElement() {            //Todo Remove method

        int top = -1;

        if (_counter > 0) {

            top = _data[0];
            int i = 0;
            int j = 1;
            int temp;
            _data[i] = _data[_counter - 1];

            while (j < _counter) {
                if (j + 1 < _counter && _data[j + 1] > _data[j]) {               //Wyszukanie większego z synów
                    j = j + 1;
                }
                if (_data[i] >= _data[j]) {
                    break;
                } else {
                    temp = _data[i];
                    _data[i] = _data[j];
                    _data[j] = temp;
                    i = j;
                    j = 2 * j + 1;
                }
            }
            _data[i] = _data[_counter - 1];
            _data[_counter - 1] = 0;
            _counter--;

        } else {
            System.out.printf("\nKopiec jest już pusty!\n");
        }
        return top;
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
