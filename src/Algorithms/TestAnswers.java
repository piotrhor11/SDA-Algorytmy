package Algorithms;

public class TestAnswers extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Test Answers";
    }

    @Override
    public void runAlgorithm(String[] input) {

        String possibleAnswers = "ABCD";

        String[] answers = new String[3];

        for (int i = 0; i < 3; i++) {
            answers[i] = input[i + 1].toUpperCase();
        }

        int correctAnswers = 0;

        for (int i = 0; i < answers[0].length(); i++) {
            for (int j = 1; j < answers.length; j++) {
                if (answers[0].charAt(i) != answers[j].charAt(i) && possibleAnswers.indexOf(answers[j].charAt(i)) >= 0) {
                    correctAnswers++;
                }
            }
        }

        System.out.printf("Zenek (aka Jarek) oraz Bogdan (aka Marek) mogą liczyć maksymalnie na %d punktów", correctAnswers);
    }
}
