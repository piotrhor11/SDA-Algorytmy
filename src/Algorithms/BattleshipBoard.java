package Algorithms;

public class BattleshipBoard extends AbstractAlgorithm {

    private final char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'Z'};

    @Override
    public String getName() {
        return "Battleship Board";
    }

    @Override
    public void runAlgorithm(String[] input) {


        int size = Integer.parseInt(input[1]);

        if (Math.sqrt(size) % 1 == 0.0) {

            int side = (int) Math.sqrt(size);
            for (int i = 0; i < side; i++) {
                for (int j = 0; j < side; j++) {
                    System.out.printf("%c%d ", alphabet[i], j + 1);
                }
                System.out.printf("\n");
            }

        } else {
            System.out.println("Naucz się kwadratów tłumanie!!!");
        }
    }
}
