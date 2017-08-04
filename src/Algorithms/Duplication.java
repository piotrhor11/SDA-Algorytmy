package Algorithms;

public class Duplication extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Duplication";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int[] tablica = new int[input.length - 1];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = Integer.parseInt(input[i + 1]);
        }

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < i; j++) {
                if (tablica[i] == tablica[j]) {
                    System.out.printf("Na pozycji %d znajduje się pierwszy duplikat i jest to %d", j + 1, tablica[j]);
                    return;
                }
            }
        }

    }
}
