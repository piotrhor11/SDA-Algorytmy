package Algorithms;

import java.util.ArrayList;
import java.util.Stack;

public class PalindromeCheck extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Palindrom Check";
    }

    @Override
    public void runAlgorithm(String[] input) {

        ArrayList<Integer> lista = new ArrayList<>(input.length - 1);

        for (int i = 0; i < input.length - 1; i++) {
            lista.add(i, Integer.parseInt(input[i + 1]));
        }

        for (int element : lista) {
            System.out.printf("%d ", element);
        }

        System.out.printf("\n");

        Stack<Integer> stosik = new Stack<>();

        for (int i = 0; i < lista.size() / 2; i++) {
            stosik.push(lista.get((lista.size() / 2) - 1 - i));     //Wrzucam na stos od połowy listy w dół, żeby mieć na stosie (idąc od góry) elementy od początku do połowy listy
        }

        for (int i = 0; i < lista.size() / 2; i++) {
            if (lista.get(lista.size() - 1 - i) != stosik.pop()) {      //Teraz porównuję skrajne wartości, wówczas "mam gdzieś", czy input jest parzysty, czy nieparzysty
                System.out.printf("To nie Palindrom!!!");
                return;
            }
        }
        System.out.printf("Mamy Palindrom!");
    }
}
