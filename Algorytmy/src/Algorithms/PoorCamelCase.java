package Algorithms;

public class PoorCamelCase extends AbstractAlgorithm {


    @Override
    public String getName() {
        return "Poor Camel Case";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int literki = 0;
        for (int i=1;i<input.length;i++){
            char[] tablica = input[i].toCharArray();
            for(int j=0;j<input[i].length();j++){
                if (literki%2==0) {
                    char big = input[i].toUpperCase().charAt(j);
                    System.out.printf("%c", big);
                }else{
                    char small = input[i].toLowerCase().charAt(j);
                    System.out.printf("%c", small);
                }
                literki++;
            }
            System.out.printf(" ");
    }

    }
}
