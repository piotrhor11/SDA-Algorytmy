package Algorithms;

import java.util.ArrayList;

public class DeleteInArrayList extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Delete in ArrayList";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int toDelete = Integer.parseInt(input[1]);
        ArrayList<Integer> lista = new ArrayList<>(input.length - 2);

        for (int i = 0; i < input.length - 2; i++) {
            lista.add(i, Integer.parseInt(input[i + 2]));
        }

        System.out.printf("Cała lista: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%d ", lista.get(i));
        }

        System.out.printf("\nUsuwamy %d.\n", toDelete);

        int currentSize = lista.size();

        for (int i = lista.size() - 1; i >= 0; i--) {
            if (toDelete == lista.get(i)) {
                lista.remove(i);
            }
        }

        System.out.printf("Lista po modyfikacji: ");
        for (int element : lista) {
            System.out.printf("%d ", element);
        }
    }
}
