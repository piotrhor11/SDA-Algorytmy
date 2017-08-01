package Struktury;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyList lista = new MyList();

        MyListElement elementA = new MyListElement("nóż", 1);
        MyListElement elementB = new MyListElement("łyżka", 2);
        MyListElement elementC = new MyListElement("widelec", 3);

        lista.addAtBeginning(elementA);
        lista.addAtBeginning(elementC);

//        lista.goThroughForward(lista);

        lista.printAllElements(lista);

        lista.addElementBeforeElement(elementC, elementB, lista);

        lista.printAllElements(lista);

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