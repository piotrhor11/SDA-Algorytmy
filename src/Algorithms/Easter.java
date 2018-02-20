package Algorithms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Easter extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Easter";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int year = Integer.parseInt(input[1]);

        int a = year % 19;
        int b = year / 100;
        int c = year % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * c) / 451;
        int p = (h + l - 7 * m + 114) % 31;

        int day = p + 1;
        int month = (h + l - 7 * m + 114) / 31;

        if (month != 4) {
            month = 3;
        }

        LocalDate date = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = date.format(formatter);


//        DayOfWeek dayDate = date.getDayOfWeek();      //Dzień tygodnia, oczywiście w przypadku Wielkanocy nie ma sensu :)
//        Month monthDate = date.getMonth();

        System.out.printf("W roku %s wielkanoc wypadnie %s", year, formattedDate);
    }
}
