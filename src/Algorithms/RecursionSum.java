package Algorithms;

public class RecursionSum extends AbstractAlgorithm {

    private int suma(int n) {
        if (n < 0) {
            return 0;
        }
        return n + suma(n - 1);
    }

    @Override
    public String getName() {
        return "Recursion Sum";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n = Integer.parseInt(input[1]);
        System.out.println(suma(n));
    }
}
