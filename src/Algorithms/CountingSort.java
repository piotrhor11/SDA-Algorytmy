package Algorithms;

public class CountingSort extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Counting Sort";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int[] tabWej = new int[input.length - 1];
        int max = 0;

        for (int i = 0; i < tabWej.length; i++) {              // Wpisywanie wejścia do tabWej przy jednoczesnym szukaniu maksymalnej wartości
            tabWej[i] = Integer.parseInt(input[i + 1]);
            if (tabWej[i] > max) {
                max = tabWej[i];
            }
        }

        int[] tabZliczanie = new int[max + 1];

        for (int i = 0; i < tabWej.length; i++) {
            tabZliczanie[tabWej[i]]++;
        }

        for (int i = 0; i < tabZliczanie.length; i++) {
            for (int j = 0; j < tabZliczanie[i]; j++) {
                System.out.printf("%d ", i);
            }
        }
    }


}
