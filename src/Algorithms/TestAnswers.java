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

        int correctAnswers = 0;         // Liczymy maksymalną liczbę prawidłowych odpowiedzi Zenka i Bogdana (nie ważne którego dokładnie, a jedynie sumę obu)

        for (int i = 0; i < answers[0].length(); i++) {
            if ((possibleAnswers.indexOf(answers[1].charAt(i)) >= 0) && (answers[0].charAt(i) != answers[1].charAt(i))) {      //Jeżeli Zenek ma dozwoloną odpowiedź oraz inną odpowiedź niż Kuba to jest to potencjalnie prawidłowa odpowiedź
                correctAnswers++;

                if (answers[1].charAt(i) == answers[2].charAt(i)) {       //Jeżeli Bogdan też ma inną odpowiedź niż Kuba i jednocześnie taką samą i dozwoloną jak Zenek to obaj mogą mieć poprawne odpowiedzi
                    correctAnswers++;
                }
            }
        }

        System.out.printf("Zenek (aka Jarek) oraz Bogdan (aka Marek) mogą liczyć maksymalnie na %d wspólnie zdobytych punktów", correctAnswers);
    }
}
