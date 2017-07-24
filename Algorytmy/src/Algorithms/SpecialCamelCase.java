package Algorithms;

public class SpecialCamelCase extends AbstractAlgorithm {


    @Override
    public String getName() {
        return "Special Camel Case";
    }

    @Override
    public void runAlgorithm(String[] input) {

        String first = "";
        String rest = "";

        for (int i = 1; i < input.length; i++) {
            first = input[i].toUpperCase().substring(0, 1);
            if (input[i].length() > 1) {
                rest = input[i].substring(1, input[i].length());
            } else {
                rest = "";
            }
            System.out.printf(first + rest);
        }

    }
}
