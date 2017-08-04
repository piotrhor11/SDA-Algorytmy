package Algorithms;

import java.util.ArrayList;
import java.util.Stack;

public class ReversePolishNotationTranslator extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Reverse Polish Notation Translator";
    }

    @Override
    public void runAlgorithm(String[] input) {

        Stack<String> stosik = new Stack<>();
        ArrayList<Integer> variables = new ArrayList<>();

        for (int i = 1; i < input.length; i++)

            switch (input[i]) {
                case "(":
                    break;
                case ")":
                    break;
                case "+":
                    break;
                case "-":
                    break;
                case "*":
                    break;
                case "/":
                    break;
                case "=":
                    break;



            }

    }
}
