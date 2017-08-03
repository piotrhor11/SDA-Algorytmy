package Algorithms;

import java.util.Stack;

public class DecimalToBinaryAndHex extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Decimal to Binary & Hex";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int decimal = Integer.parseInt(input[1]);
        int base = Integer.parseInt(input[2]);

        switch (base) {
            case 2:
                decimalToBinary(decimal);
            case 16:
                decimalToHex(decimal);
            default:
                System.out.printf("Konwersja na system %d nie jest możliwa", base);
        }

    }

    private void decimalToBinary(int decimal) {
        System.out.printf("Zamiana %d na zapis binarny: ", decimal);

        Stack<Integer> stos = new Stack<>();

        int L = decimal;
        while (L > 2) {         //ToDo Dokończyć!
//            stos.push()
        }

    }

    private void decimalToHex(int decimal) {                    //ToDo zaimplementować zamianę na system 16-owy
        System.out.printf("Zamiana %d na zapis szesnastkowy: ", decimal);
    }

}
