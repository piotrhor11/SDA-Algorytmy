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

        MyListElement elementA = new MyListElement(1);
        MyListElement elementB = new MyListElement(2);
        MyListElement elementC = new MyListElement(3);
        MyListElement elementD = new MyListElement(4);
        MyListElement elementE = new MyListElement(5);

        lista.addAtBeginning(elementC);
        lista.addAtBeginning(elementA);
        lista.addAtEnd(elementE);

        lista.printAll();
        System.out.println();

        lista.addElementBeforeElement(elementB, elementC);

        lista.printAllBackward();
        System.out.println();

        lista.addElementAfterElement(elementD, elementC);

        lista.printAll();
        System.out.println();

        lista.removeBeginning();
        lista.removeEnd();
        lista.remove(elementC);
        
        lista.printAll();
        System.out.println();

        //Zabawy z ArrayListą

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
