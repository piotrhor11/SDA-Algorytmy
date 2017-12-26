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
        double wynik[][] = new double[n][2];        // Nienajlepsze rozwiązanie, gdzie int z numerem punktu rzutujemy na doubla "dla wyniku". Alternatywnie możnaby zrobić 2 osobne tablice (int[] z numerem punktu i double[] z wynikami)

        for (int i = 0; i < (input.length - 2) / 3; i++) {      //Wczytujemy kolejne punkty, czyli po 3 liczby z wejścia (nazwa i para współrzędnych)
            tab[i][0] = Integer.parseInt(input[3 * i + 2]);
            tab[i][1] = Integer.parseInt(input[3 * i + 3]);
            tab[i][2] = Integer.parseInt(input[3 * i + 4]);
            System.out.println("Punkt " + tab[i][0] + " ma współrzędne " + tab[i][1] + " " + tab[i][2]);
        }

        double distance;       // dla typu int prostego autoinicjalizacja da 0
        for (int i = 0; i < n; i++) {
            distance = Math.sqrt(Math.pow((double) tab[i][1], 2d) + Math.pow((double) tab[i][2], 2d));  //Pierwiastek z sumy kwadratów
            wynik[i][1] = distance;
            wynik[i][0] = tab[i][0];
        }

        for (int i = 0; i < wynik.length; i++) {
            for (int j = 0; j < wynik.length - 1; j++) {
                if (wynik[j][1] > wynik[j + 1][1]) {
                    double[] tmp = wynik[j];
                    wynik[j] = wynik[j + 1];
                    wynik[j + 1] = tmp;
                }
            }
        }

        System.out.println("\nWynik sortowania:");
        for (double[] row : wynik) {                                                   // Wyświetlenie posortowanych wyników w formacie: punkt - dystans
            System.out.printf("Dystans punktu %2.0f wynosi %.3f", row[0], row[1]);
            System.out.println();
        }

    }
}
