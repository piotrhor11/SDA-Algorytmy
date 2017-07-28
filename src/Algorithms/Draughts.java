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

        List<String> colors = new ArrayList<String>();
        colors.add("B");
        colors.add("C");

        int m = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        String first = input[3].toUpperCase();

        String[][] board = new String[m][n];

        int k = colors.indexOf(first);

        for (int i = 0; i < m; i++) {
            if (i > 0 && n % 2 == 0) {                  //Do poprawy - paskudne rozwiązanie problemu z parzystą liczbą kolumn!!!
                k++;
            }
            for (int j = 0; j < n; j++) {
                System.out.printf("%s ", colors.get((k) % colors.size()));
                k++;
            }
            System.out.printf("\n");
        }

    }
}
