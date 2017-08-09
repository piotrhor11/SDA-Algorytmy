package Algorithms;

public class LeastCommonMultiple extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Least Common Multiple";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);

        int nww = (n * k) / gtc(n, k);

        System.out.printf("Najmniejsza Wspólna Wielokrotność dla %d i %d to %d", n, k, nww);
    }

    private int gtc(int k, int n) {
        if (k == 0) {
            return n;
        } else if (n < 0 || k < 0) {
            return 0;
        } else {
            return gtc(n % k, k);
        }

    }
}
