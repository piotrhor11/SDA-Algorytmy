
package Algorithms;

public class BattleshipBoard extends AbstractAlgorithm {

    //    private final char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'Z'};
    private final char[] alphabet = {'A', 'B', 'C'};


    @Override
    public String getName() {
        return "Battleship Board";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int size = Integer.parseInt(input[1]);

        if (Math.sqrt(size) % 1 == 0.0) {

            int side = (int) Math.sqrt(size);
            for (int i = 0; i < side; i++) {                    //ToDo - "Excel" extension not ready
                for (int j = 0; j < side; j++) {
//                    for (int k = 0; k <= (i / (int) Math.pow(alphabet.length, 1d)); k++) {            //Zamiast 1d powinny być wskaźniki kolejnych potęg (1d, 2d, 3d, itd.) jeżeli i przekroczy wartość danej potęgi. Niestety nie umiem tego zaimplementować. :(
//                        System.out.printf("%c", alphabet[i % alphabet.length]);
//                    }

                    // ...  - kolejne konstrukcje "if" narastają z dołu do góry w nieskończoność zgodnie z zależnością wynikającą z poniższych 4  instrukcji if (dokładniej to zależność jest stała [idąć w górę] od 2-go ifa od końca )

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

        } else {
            System.out.println("Naucz się kwadratów tłumanie!!!");
        }
    }
}
