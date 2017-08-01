package Algorithms;

public class TablesLeader extends AbstractAlgorithm {           //FixMe - Not working properly

    @Override
    public String getName() {
        return "Tables Leader";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int[] tablica = new int[input.length - 1];

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = Integer.parseInt(input[i + 1]);           //Wpisujemy wejście do tablicy
            if (max < tablica[i]) {                                //Szukamy maksymalnej wartości
                max = tablica[i];
            }
        }

        int[] tablicaWynikow = new int[max + 1];

        for (int i = 0; i < tablica.length; i++) {            //wpisujemy występowanie wyników
            tablicaWynikow[tablica[i]]++;
        }

        int lider = -1;
        int maxOccurenceIndex = 0;

        for (int i = 0; i < tablicaWynikow.length; i++) {
            if (tablicaWynikow[maxOccurenceIndex] < tablicaWynikow[i]) {
                maxOccurenceIndex = i;
            }
        }

        if (0.5 < (tablicaWynikow[maxOccurenceIndex] / tablica.length)) {
            lider = maxOccurenceIndex;
        }

        System.out.printf("Liderem jest %d", lider);

    }
}
