package Algorithms;

import java.util.Stack;

public class NumeralSystemConverter extends AbstractAlgorithm {


    @Override
    public String getName() {
        return "Numeral System Converter";
    }

    @Override
    public void runAlgorithm(String[] input) {          //input: 1-system 2-liczba 3-system (system: b - binary, d - decimal, h-hex)

        String liczba = input[2];                       //liczbę trzymam w Stringu, bo to może być hex
        String conversion = input[1] + input[3];          //String, który koduje rodzaj konwersji

        switch (conversion) {
            case "bd":
                binaryToBinary(liczba);
                break;
            case "bh":
                binaryToHex(liczba);
                break;
            case "db":
                decimalToBinary(liczba);
                break;
            case "dh":
                decimalToHex(liczba);
                break;
            case "hb":
                hexToBinary(liczba);
                break;
            case "hd":
                hexToDecimal(liczba);
                break;
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
