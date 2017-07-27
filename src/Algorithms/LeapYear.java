package Algorithms;

public class LeapYear extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Leap Year";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int numOfYears = Integer.parseInt(input[1]);

        for (int i = 0; i < numOfYears; i++) {
            int year = Integer.parseInt(input[i + 2]);
            Boolean check = ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)));
            System.out.printf("Czy rok %d jest przestępny: %s \n", year, check ? "Tak" : "Nie");
        }
    }
}
