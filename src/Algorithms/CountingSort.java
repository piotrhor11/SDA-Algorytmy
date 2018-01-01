package Algorithms;

public class CountingSort extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Counting Sort";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int[] tabWej = new int[input.length - 1];
        int[] tabWynik = new int[tabWej.length];
        int max = 0;

        for (int i = 0; i < tabWej.length; i++) {              // Wpisywanie wejścia do tabWej przy jednoczesnym szukaniu maksymalnej wartości
            tabWej[i] = Integer.parseInt(input[i + 1]);
            if (tabWej[i] > max) {
                max = tabWej[i];
            }
        }

        System.out.println("Zbiór do posortowania:");
        for (int a : tabWej) {
            System.out.printf("%d ", a);
        }

        int[] tabZliczanie = new int[max + 1];                 // Jako tablica typów prostych int[] zainicjalizuje się domyślnie z zerami na każdej pozycji

        for (int i = 0; i < tabWej.length; i++) {              // Zliczamy wystąpienia poszczególnych wartości
            tabZliczanie[tabWej[i]]++;
        }

        for (int i = 1; i < tabZliczanie.length; i++) {        // Zliczamy wystąpienia liczb mniejszych bądź równych od poszczególnych wartości
            tabZliczanie[i] += tabZliczanie[i - 1];
        }

        for (int i = tabWej.length - 1; i >= 0; i--) {         // Idąc od końca tabWej[] wpisujemy wartości do tabWynik[] w miejscu wskazanym przez tabZliczanie[]
            tabWynik[tabZliczanie[tabWej[i]] - 1] = tabWej[i];
            tabZliczanie[tabWej[i]] -= 1;
        }

//        for (int i = 0; i < tabZliczanie.length; i++) {      // Zwykły wydruk zliczonych wystąpień POSZCZEGÓLNYCH wartości, niestabilna wersja algorytmu???
//            for (int j = 0; j < tabZliczanie[i]; j++) {
//                System.out.printf("%d ", i);
//            }
//        }

        System.out.println("\nWynik sortowania:");
        for (int a : tabWynik) {
            System.out.printf("%d ", a);
        }

    }
}
