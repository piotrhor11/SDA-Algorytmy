package Algorithms;

public class PalindromeSum extends AbstractAlgorithm {

    private int[][] answer;

    @Override
    public String getName() {
        return "Palindrome Sum";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int numberOfNumbers = Integer.parseInt(input[1]);
        answer = new int[numberOfNumbers][3];                //Tworzymy tablicę tablic 3-elementowych, pierwszy element podtablicy to liczba, drugi to palindrome, a trzecia to liczba sumowań

        for (int i = 0; i < numberOfNumbers; i++) {
            answer[i][0] = Integer.parseInt(input[i + 2]);

            int[] palindromeAndSums = findPalindrome(answer[i][0]);
            answer[i][1] = palindromeAndSums[0];
            answer[i][2] = palindromeAndSums[1];

            System.out.printf("Number: %d, Palindrome: %d, Number of sums: %d \n", answer[i][0], answer[i][1], answer[i][2]);
        }

    }

    private int[] findPalindrome(int number) {              //Szukamy palindromu i zwracamy go wraz z liczbą sumowań
        int numberOfSums = 0;
        int newNumber = number;
        while (!isPalindrome(newNumber)) {
            newNumber += rewerseNumber(newNumber);
            numberOfSums++;
        }
        return new int[]{newNumber, numberOfSums};
    }

    private boolean isPalindrome(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number);
        char[] chars = sb.toString().toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    private int rewerseNumber(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number);
        return Integer.parseInt(sb.reverse().toString());
    }

}
