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

        String helper = "";

        for (int i = 1; i < input.length; i++)

            switch (input[i]) {
                case "(":
                    stosik.push(input[i]);
                    break;
                case ")":
                    helper = stosik.pop();
                    while (!helper.equals("(")) {
                        System.out.printf("%s", helper);
                        helper = stosik.pop();
                    }
                    break;
                case "+":
                    break;
                case "-":
                    break;
                case "*":
                    break;
                case "/":
                    break;
                case "^":
                    while (!stosik.empty()) {
                        if (GetOperatorPriority(input[i]) == 3 || GetOperatorPriority(input[i]) >= GetOperatorPriority(stosik.peek())) {
                            break;
                        } else {
                            System.out.printf("%s", stosik.pop());
                        }
                    }
                    break;
                case "=":
                    while (!stosik.empty()) {
                        System.out.printf("%s", stosik.pop());
                    }
                    break;
                default:
                    System.out.printf("%s", input[i]);
                    break;


            }

    }

    public int GetOperatorPriority(String operator) throws Exception {
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
            default:
                throw new Exception("Nierozpoznany operator!");
        }
    }
}
