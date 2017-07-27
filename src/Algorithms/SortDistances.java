package Algorithms;

public class SortDistances extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Sort Distances";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n = Integer.parseInt(input[1]);
        int tab[][] = new int[n][3];
        int wynik[][] = new int[n][2];

        for (int i = 0; i < (input.length - 2) / 3; i++) {
            tab[i][0] = Integer.parseInt(input[3 * i + 2]);
            tab[i][1] = Integer.parseInt(input[3 * i + 3]);
            tab[i][2] = Integer.parseInt(input[3 * i + 4]);
        }

        int distance = 0;
        for (int i = 0; i < n; i++) {
            distance = (int) (Math.sqrt(Math.pow((double) tab[i][1], 2d) + Math.pow((double) tab[i][2], 2d)));
            wynik[i][1] = distance;
            wynik[i][0] = tab[i][0];
        }

        for (int i = 0; i < wynik.length - 1; i++) {
            for (int j = 0; j < wynik[i].length - 1; j++) {
                if (wynik[j][1] > wynik[j + 1][1]) {
                    int[] tmp = wynik[j];
                    wynik[j] = wynik[j + 1];
                    wynik[j + 1] = tmp;
                }
            }
        }

        for (int[] raw : wynik) {
            System.out.printf("Dystans punktu %d wynosi %d", raw[0], raw[1]);
            System.out.println();
        }

    }
}
