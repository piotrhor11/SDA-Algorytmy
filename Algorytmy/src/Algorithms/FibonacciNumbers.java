package Algorithms;

public class FibonacciNumbers extends AbstractAlgorithm {

    private int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    @Override
    public String getName() {
        return "Fibonacci Numbers";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n = Integer.parseInt(input[1]);
        System.out.printf("Ciąg Fibonacciego dla %d wynosi %d", n, fibonacci(n));
    }
}
