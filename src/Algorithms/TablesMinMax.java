package Algorithms;

public class TablesMinMax extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Tables Min-Max";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int[] tablica = new int[input.length - 1];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = Integer.parseInt(input[i + 1]);
        }

        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > tablica[indexMax]) {
                indexMax = i;
            }
            if (tablica[i] < tablica[indexMin]) {
                indexMin = i;
            }
        }

        System.out.printf("Maksymalna wartość %d znajduje się na pozycji %d", tablica[indexMax], indexMax + 1);
        System.out.println();
        System.out.printf("Minimalna wartość %d znajduje się na pozycji %d", tablica[indexMin], indexMin + 1);

    }
}
