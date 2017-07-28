package Algorithms;

public class Mode extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Mode";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int[] T = new int[input.length - 1];
        int max = 0;

        for (int i = 0; i < T.length; i++) {              // Wpisywanie wejścia do T jednocześnie szukając maksymalnej wartości
            T[i] = Integer.parseInt(input[i + 1]);
            if (T[i] > max) {
                max = T[i];
            }
        }

        int[] L = new int[max + 1];

        for (int i = 0; i < T.length; i++) {
            L[T[i]]++;
        }

        int Lmax = 0;
        for (int i = 1; i < L.length; i++) {
            if (L[i] > Lmax) {
                Lmax = i;
            }
        }

        System.out.printf("Największe liczba to %d, wustępuje %d razy ", Lmax, L[Lmax]);

    }
}
