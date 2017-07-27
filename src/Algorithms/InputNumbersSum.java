package Algorithms;

public class InputNumbersSum extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Input Numbers Sum";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int suma = 0;
        int current;
        for (int i = 1; i < input.length; i++) {
            current = Integer.parseInt(input[i]);
            suma += current;
            System.out.printf("Obecna liczba to %d, a suma to %d \n", current, suma);
        }

    }
}
