package Algorithms;

import java.util.Stack;

public class ReversePolishNotation extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Reverse Polish Notation";
    }

    @Override
    public void runAlgorithm(String[] input) {

        Stack<Integer> stosik = new Stack<>();

        int v1;
        int v2;

        for (int i = 1; i < input.length; i++) {

            switch (input[i]) {
                case "+":
                    v2 = stosik.pop();
                    v1 = stosik.pop();
                    stosik.push(v1 + v2);
                    break;
                case "*":
                    v2 = stosik.pop();
                    v1 = stosik.pop();
                    stosik.push(v1 * v2);
                    break;
                case "-":
                    v2 = stosik.pop();
                    v1 = stosik.pop();
                    stosik.push(v1 - v2);
                    break;
                case "/":
                    v2 = stosik.pop();
                    v1 = stosik.pop();
                    stosik.push(v1 / v2);
                    break;
                case "=":
                    System.out.printf("%d\n", stosik.peek());
                    break;                                                    //Działa dalej, aż do końca input
//                    return;                                                   //Przerywa działanie po pierwszym znaku "="
                default:
                    stosik.push(Integer.parseInt(input[i]));
            }
        }


    }
}
