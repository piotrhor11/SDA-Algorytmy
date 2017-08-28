package Algorithms;

public class Marker extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Marker";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int numberOfWords = Integer.parseInt(input[1]);

        for (int i = 0; i < numberOfWords; i++) {               // W tej pętli przechodzimy po każdym słowie (i)
            String word = input[i + 2];
            int numberOfTimes = 0;                              // Liczba wystąpień danej literki

            for (int j = 0; j < word.length(); j++) {           // W tej pętli przechodzimy po każdej literce (j) słowa (i)

                numberOfTimes++;

                if (j >= word.length() - 1 || word.charAt(j) != word.charAt(j + 1)) {           //Jeżeli mamy ostatnią literę lub następna litera jest inna od obecnej to...
                    if (numberOfTimes > 2) {                                                    // Przy ponad 2 wystąpieniach drukujemy literkę i liczbę wystąpień
                        System.out.print("" + word.charAt(j) + numberOfTimes);
                        numberOfTimes = 0;
                    } else {                                                                    //Przy mniejszej liczbie wystąpień drukujemy tyle razy ile wystąpiła
                        for (; 0 < numberOfTimes; numberOfTimes--) {                             //Na wyrost ale szukałem sobie uniwersalnego sposobu na n-powtórzeń jakiegoś Stringa lub chara
                            System.out.print("" + word.charAt(j));
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
