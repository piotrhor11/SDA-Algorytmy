package Algorithms;

public class SimpleTree extends AbstractAlgorithm {

    String _tree[];
    int _height;            //Wysokość drzewa = poziom drzewa (najwyższy poziom w drzewie)

    @Override
    public String getName() {
        return "Simple Tree";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = input.length - 1;
        _tree = new String[getArraySize(n)];

        int i;
        for (i = 0; i < n; i++) {
            _tree[i] = input[i + 1];
        }

        for (int j = i; j < _tree.length; j++) {
            _tree[j] = "AA";                            //Wypełniamy resztę tablicy byle czym (2-znakowym strigniem)
        }

        for (int j = 0; j < _tree.length; j++) {
            String elementLewy;
            String element = "";
            try {
                element = _tree[j];
                elementLewy = _tree[2 * j + 1];               //Jeżeli nie da się odwołać do takiego elementu, to znaczy, że element jest liściem
            } catch (Exception ex) {
                System.out.printf("Element %s jest liściem\n", element);
            }
        }

        getSons("B");
    }

    private int getArraySize(int n) {
        int currentSize = 0;
        int iterator = 0;
        while (currentSize < n) {
            currentSize = currentSize + (int) Math.pow(2d, (double) iterator);
            iterator++;
        }
        _height = iterator - 1;
        return currentSize;
    }

    private void getSons(String father) {
        int i;
        for (i = 0; i < _tree.length; i++) {
            if (_tree[i].equals(father)) {
                break;
            }
        }

        try {
            System.out.printf("Lewym synem elementu %s jest: %s\n", _tree[i], _tree[2 * i + 1]);
            System.out.printf("Prawym synem elementu %s jest: %s\n", _tree[i], _tree[2 * i + 2]);
        } catch (Exception ex) {
            System.out.printf("Element %s nie posiada przynajmniej 1 syna", _tree[i]);
        }

    }
}
