package Algorithms;

public class BubbelSort extends AbstractAlgorithm {

    private int[] tab;
    private Boolean end = false;                // Flaga optymalizacyjna, przerywa algorytm, gdy pojawi się pełne przejście bez zadnej zamiany miejsc
    private int numberOfIterations = 0;

    private void swap(int j) {
        int tmp = 0;
        tmp = tab[j];
        tab[j] = tab[j + 1];
        tab[j + 1] = tmp;
    }

    @Override
    public String getName() {
        return "Bubbel Sort";
    }

    @Override
    public void runAlgorithm(String[] input) {

        tab = new int[input.length - 1];
        int tabLength = tab.length;

        System.out.println("Otrzymany ciąg do posortowania:");

        for (int i = 0; i < input.length - 1; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
            System.out.printf("%d ", tab[i]);
        }

        for (int i = 0; i < tabLength; i++) {
            for (int j = 0; j < tabLength - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    swap(j);
                    end = false;
                }
            }
            numberOfIterations++;
            if (end) {
                break;
            }
            end = true;
        }

        System.out.println("\nPosortowany ciąg:");

        for (int number : tab) {
            System.out.printf("%d ", number);
        }
        System.out.println("\nWynik optymalizacji:\n Liczba pełnych iteracji: " + (tabLength - 1) + "\n Liczba wykonanych iteracji " + numberOfIterations);
    }
}
