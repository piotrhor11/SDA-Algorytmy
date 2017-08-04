package Algorithms;

import Struktury.MyList;
import Struktury.MyListElement;

import java.util.ArrayList;

public class MyListTest extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "List Test";
    }

    @Override
    public void runAlgorithm(String[] input) {

        MyList lista = new MyList();

        MyListElement elementA = new MyListElement("nóż", 1);
        MyListElement elementB = new MyListElement("łyżka", 2);
        MyListElement elementC = new MyListElement("widelec", 3);
        MyListElement elementD = new MyListElement("talerz", 4);

        lista.addAtBeginning(elementA);
        lista.addAtBeginning(elementC);

//        lista.goThroughForward(lista);

        lista.printAllElements(lista);
        System.out.println();

        lista.addElementBeforeElement(elementB, elementA, lista);

        lista.printAllElements(lista);
        System.out.println();

        lista.addElementAfterElement(elementD, elementC, lista);

        lista.printAllElements(lista);
        System.out.println();

        ArrayList<String> kolory = new ArrayList<>();
        kolory.add("Niebieski");
        kolory.add("Czarny");
        kolory.add("Żółty");
        kolory.add("Fioletowy");

        kolory.add(0, "Różowy");
        kolory.add(kolory.size(), "Zielony");

        for (String kolor : kolory) {
            System.out.println(kolor);
        }

    }
}
