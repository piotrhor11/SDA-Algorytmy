package Algorithms;

public class InsertionSort extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Insertion Sort";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int[] tab = new int[input.length - 1];
        int length = tab.length;
        int temp;
        int index;              // bieżący index

        System.out.printf("Ciąg do posortowania: ");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
            System.out.printf("%d ", tab[i]);
        }

        for (int i = 0; i < length - 1; i++) {      //Uznajemy ostatni element za zalążek uporządkowanej listy i począwszy od przedostatniego elementu cofając się wstawiamy kolejne wartości w sposób uporządkowany
            for (int j = 0; j <= i; j++) {
                index = length - 2 - i + j;
                if (tab[index] > tab[index + 1]) {
                    temp = tab[index];
                    tab[index] = tab[index + 1];
                    tab[index + 1] = temp;
                } else {
                    break;
                }
            }
        }

        System.out.printf("\nPosortowany ciąg: ");
        for (int a : tab) {
            System.out.printf("%d ", a);
        }

    }
}
