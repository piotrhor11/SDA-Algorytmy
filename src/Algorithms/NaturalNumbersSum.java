package Algorithms;

public class NaturalNumbersSum extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Natural Numbers Sum";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int suma = 0;
        int n = Integer.parseInt(input[1]);

        for (int i = 0; i <= n; i++) {
            suma += i;
            System.out.printf("Iteracja: %d === wartość sumy %d: \n", i, suma);
        }
    }
}
