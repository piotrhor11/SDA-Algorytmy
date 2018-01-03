/*
Zadanie polega na stworzeniu etykiet na pola do gry w statki według podejścia zastosowanego w Excelu
*/

package Algorithms;

public class BattleshipBoard extends AbstractAlgorithm {

    private final char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'Z'};
//    private final char[] alphabet = {'A', 'B', 'C'};                //wersja do testów


    @Override
    public String getName() {
        return "Battleship Board";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int size = Integer.parseInt(input[1]);

        for (int i = 0; i < size; i++) {                    //Nie wiem jak zautomatyzować tworzenie się odpowiednich konstrukcji if, myślałem o rekurencji ale trochę się to komplikuje
            for (int j = 0; j < size; j++) {

//STARY KOD
//                    for (int k = 0; k <= (i / (int) Math.pow(alphabet.length, 1d)); k++) {            //Zamiast 1d powinny być wskaźniki kolejnych potęg (1d, 2d, 3d, itd.) jeżeli i przekroczy wartość danej potęgi. Niestety nie umiem tego zaimplementować. :(
//                        System.out.printf("%c", alphabet[i % alphabet.length]);
//                    }
//STARY KOD KONIEC

                // ...  - kolejne konstrukcje "if" narastają tutaj idąc z dołu do góry w nieskończoność zgodnie z zależnością wynikającą z poniższych 4  instrukcji if (dokładniej to zależność jest stała [idąć w górę] od 2-go ifa po koniec Wszechświata )

                if (0 < ((i - (int) Math.pow(alphabet.length, 2d) - (int) Math.pow(alphabet.length, 1d)) / (int) Math.pow(alphabet.length, 3d))) {
                    System.out.printf("%c", alphabet[((i - (int) Math.pow(alphabet.length, 3d) - (int) Math.pow(alphabet.length, 2d) - (int) Math.pow(alphabet.length, 1d)) / ((int) Math.pow(alphabet.length, 3d))) % alphabet.length]);
                }
                if (0 < ((i - (int) Math.pow(alphabet.length, 1d)) / ((int) Math.pow(alphabet.length, 2d)))) {
                    System.out.printf("%c", alphabet[((i - (int) Math.pow(alphabet.length, 2d) - (int) Math.pow(alphabet.length, 1d)) / (int) Math.pow(alphabet.length, 2d)) % alphabet.length]);
                }
                if (0 < (i / (int) Math.pow(alphabet.length, 1d))) {
                    System.out.printf("%c", alphabet[((i - (int) Math.pow(alphabet.length, 1d)) / (int) Math.pow(alphabet.length, 1d)) % alphabet.length]);
                }
                if (0 <= i) {
                    System.out.printf("%c", alphabet[i % alphabet.length]);
                }


                System.out.printf("%d ", j + 1);

            }
            System.out.printf("\n");
        }


    }


}
