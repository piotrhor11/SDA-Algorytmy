package Algorithms;

public class BattleshipBoard2 extends AbstractAlgorithm {

    //    private final char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'Z'};
    private final char[] alphabet = {'A', 'B', 'C'};                //Wersja do testów


    @Override
    public String getName() {
        return "Battleship Board 2 (better implementation than 'Battleship Board')";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int size = Integer.parseInt(input[1]);
        int a;
        int index;
        int numOfLetters;           //Liczba liter do wyświetlenia dla danej komórki o indeksie "i"
        int tail;
        String cell;

        for (int i = 0; i < size; i++) {

            numOfLetters = 0;
            a = i;
            while (a >= 0) {            // Szukamy najwyższej pozycji, czyli liczby liter do wydrukowania
                numOfLetters++;
                a -= Math.pow(alphabet.length, numOfLetters);
            }

            StringBuilder sb = new StringBuilder();

            while (numOfLetters > 0.0) {
                tail = findTail(numOfLetters - 1);
                index = (int) ((i - tail) / Math.pow(alphabet.length, numOfLetters - 1));
                sb.append(alphabet[index % alphabet.length]);
                numOfLetters--;
            }
            cell = sb.toString();

            for (int j = 1; j <= size; j++) {
                System.out.printf("%s%d ", cell, j);
            }

            System.out.printf("\n");

        }

    }

    public int findTail(double exponent) {                // Korzystam z rekurencji w celu implementacj zależności "...(int) Math.pow(alphabet.length, 3d) + (int) Math.pow(alphabet.length, 2d) + (int) Math.pow(alphabet.length, 1d)"
        if (exponent <= 0.0) {
            return 0;
        }
        return (int) Math.pow(alphabet.length, exponent) + findTail(exponent - 1);
    }

}
