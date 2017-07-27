package Algorithms;

public class BubbelSort extends AbstractAlgorithm {

    private int[] tab;

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

        for (int i = 0; i < input.length - 1; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
        }

//        for (int i = 0; i < tab.length; i++) {            //Inaczej ale też działa, jedziemy jedna pozycja po zbiorze i jak cos mniejsze to podmieniamy
//            for (int j = 0; j < tab.length; j++) {
//                if (tab[i] < tab[j]) {
//                    int tmp = 0;
//                    tmp = tab[i];
//                    tab[i] = tab[j];
//                    tab[j] = tmp;
//                }
//            }
//        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    swap(j);
                }
            }
        }


        for (int number : tab) {
            System.out.printf("%d ", number);
        }
    }
}
