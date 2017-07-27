package Algorithms;

public class PoorCamelCase extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Poor Camel Case";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int literki = 0;
        for (int i = 1; i < input.length; i++) {

            for (int j = 0; j < input[i].length(); j++) {
                if (literki % 2 == 0) {
                    char big = input[i].toUpperCase().charAt(j);
                    System.out.printf("%c", stripOfPolish(big));
                } else {
                    char small = input[i].toLowerCase().charAt(j);
                    System.out.printf("%c", stripOfPolish(small));
                }
                literki++;
            }
            System.out.printf(" ");
        }
    }

    public char stripOfPolish(char i) {

        switch (i) {
            case ('Ą'):
                return 'A';
            case ('ą'):
                return 'a';
            case ('Ę'):
                return 'Ę';
            case ('ę'):
                return 'ę';
            case ('Ć'):
                return 'C';
            case ('ć'):
                return 'ć';
            case ('Ł'):
                return 'L';
            case ('ł'):
                return 'l';
            case ('Ń'):
                return 'N';
            case ('ń'):
                return 'n';
            case ('Ó'):
                return 'O';
            case ('ó'):
                return 'o';
            case ('Ś'):
                return 'S';
            case ('ś'):
                return 's';
            case ('Ź'):
            case ('Ż'):
                return 'Z';
            case ('ź'):
            case ('ż'):
                return 'z';
            default:
                return i;
        }
    }

}
