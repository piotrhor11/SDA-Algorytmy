package Algorithms;

public class GreatestCommonDivisor extends AbstractAlgorithm {

    private int gtc(int k, int n) {
        if (k == 0) {
            return n;
        } else if (n < 0 || k < 0) {
            return 0;
        } else {
            return gtc(n % k, k);
        }
    }

    @Override
    public String getName() {
        return "Greatest Common Divisor";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);

        System.out.printf("NWD dla %d i %d wynosi %d", n, k, gtc(k, n));

    }
}
