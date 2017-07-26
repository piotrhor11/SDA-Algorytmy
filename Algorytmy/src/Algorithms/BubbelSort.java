package Algorithms;

public class BubbelSort extends AbstractAlgorithm {

    private int[] tab;
    private int[] sorted;

    private void swap(int i, int j) {
        int tmp = 0;
        tmp = tab[i];
        tab[i] = tab[j];
        tab[j] = tmp;
    }

    @Override
    public String getName() {
        return "Bubbel Sort";
    }

    @Override
    public void runAlgorithm(String[] input) {

        tab = new int[input.length - 1];
        sorted = new int[input.length - 1];

        for (int i = 0; i < input.length - 1; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
            sorted[i] = Integer.parseInt(input[i + 1]);
        }
        
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (tab[i] < tab[j]) {
                    swap(i, j);
                }
            }
        }

        for (int number : tab) {
            System.out.printf("%d ", number);
        }
    }
}
