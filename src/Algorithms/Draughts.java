package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Draughts extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Draughts";
    }

    @Override
    public void runAlgorithm(String[] input) {

        List<String> colors = new ArrayList<>();
        colors.add("B");
        colors.add("C");

        int m = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        String first = input[3].toUpperCase();

        String[][] board = new String[m][n];

        int k = colors.indexOf(first);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%s ", colors.get((k) % colors.size()));
                k++;
            }
            System.out.printf("\n");
            k = (n % 2) == 0 ? k + 1 : k;           // W przypadku parzystej liczby kolumn przesuwamy indeks listy kolorów, żeby uzyskać "szachownicę"
        }

    }
}
