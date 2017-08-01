package Algorithms;

import java.time.DayOfWeek;
import java.time.Month;

public class Easter extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Easter";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int year = Integer.parseInt(input[1]);

        int a = year % 19;
        int b = (int) (year / 100);
        int c = year % 100;
        int d = (int) (b / 4);
        int e = b % 4;
        int f = (int) ((b + 8) / 25);
        int g = (int) ((b - f + 1) / 3);
        int h = (19 * a + b - d - g + 15) % 30;
        int i = (int) (c / 4);
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (int) ((a + 11 * h + 22 * c) / 451);
        int p = (h + l - 7 * m + 114) % 31;

        int day = p + 1;
        int month = (int) ((h + l - 7 * m + 114) / 31);

        if (month != 4) {
            month = 3;
        }

        DayOfWeek dayS = DayOfWeek.of(day);             //ToDo - date format not applied
        Month monthS = Month.of(month);

//        System.out.println("W roku %d wielkanoc wypadnie %d %d", year, day, month);
    }
}
