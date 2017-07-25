package Algorithms;

public class CaesarCipher extends AbstractAlgorithm {

    private final char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'Z'};

    private int findMeIndex(char letter) {

        for (int i = 0; i < alphabet.length; i++) {
            if (letter == alphabet[i]) {
                return i;
            }
        }
        return -4;
    }
    
    @Override
    public String getName() {
        return "Caesar Cipher";
    }

    @Override
    public void runAlgorithm(String[] input) {

        for (int i = 1; i <= input.length - 1; i++) {
            char[] world = input[i].toUpperCase().toCharArray();        //Na listach byłoby szybciej ale ćwiczymy tablice
            for (char letter : world) {
                System.out.printf("%c", alphabet[(findMeIndex(letter) + 3) % alphabet.length]);
            }
            System.out.printf(" ");

        }

    }
}
