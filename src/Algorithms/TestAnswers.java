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

                boolean condition1 = possibleAnswers.indexOf(answers[j].charAt(i)) >= 0;    //Czy uczeń podał odpowiedź z przedziału A-D
                boolean condition2 = answers[0].charAt(i) != answers[j].charAt(i);          //Czy uczeń ma inną odpowiedź niż Kuba
                boolean condition3 = answers[j - 1].charAt(i) == answers[j].charAt(i);      //Czy sąsiedni uczniowie podali taką samą odpowiedź

                if (condition1 && condition2) {
                    if (j == 1 || condition3) {           //Zenek od razu zostanie zinkrementowany, a Bogdan dodatkowo sprawdzony. Jedynie przy 2 takich samych odpowiedziach Zenka i Bogdana możemy mówić o 2 potencjalnych prawidłowych odpowiedziach.
                        correctAnswers++;
                    }
                }
            }
        }

        System.out.printf("Zenek (aka Jarek) oraz Bogdan (aka Marek) mogą liczyć maksymalnie na %d punktów", correctAnswers);
    }
}
