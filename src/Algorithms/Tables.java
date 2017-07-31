package Algorithms;

import java.util.Random;

public class Tables extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Tables";
    }

    @Override
    public void runAlgorithm(String[] input) {

        Random rand = new Random();

        int[][] tab = new int[3][10];

        for (int i = 0; i < tab.length; i++) {         //Pętlą for each nie da się zrobić przypisania.
            for (int j = 0; j < tab[i].length; j++) {
                if (i == 0) {
                    tab[i][j] = rand.nextInt();
                } else if (i == 1) {
                    tab[i][j] = 2 * i;
                } else {
                    tab[i][j] = (2 * i) + 1;
                }
            }
        }

        for (int a[] : tab) {
            System.out.println("Drukujemy podtablicę:");
            for (int b : a) {
                System.out.printf("%d", b);
                System.out.println();
            }
        }

        //for (int)

    }
}
