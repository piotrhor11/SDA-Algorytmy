package Algorithms;

public class Factorial extends AbstractAlgorithm {

    private int Silnia(int n) {
        if (n < 2) {
            return 1;
        }
        return n * Silnia(n - 1);
    }

    @Override
    public String getName() {
        return "Factorial";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n = Integer.parseInt(input[1]);
        System.out.println("Wynik działania " + n + "! wynosi: " + Silnia(n));
    }
}
