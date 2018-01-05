package Algorithms;

public class QuickSort extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Quick Sort";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int[] tab = new int[input.length - 1];

        System.out.printf("Ciąg do posortowania: ");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
            System.out.printf("%d ", tab[i]);
        }

    }
}
