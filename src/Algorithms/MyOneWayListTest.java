package Algorithms;

import Struktury.MyOneWayList;
import Struktury.MyOneWayListElement;

public class MyOneWayListTest extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "My One Way List Test";
    }

    @Override
    public void runAlgorithm(String[] input) {

        MyOneWayList lista = new MyOneWayList();

        MyOneWayListElement elementA = new MyOneWayListElement(7);
        MyOneWayListElement elementB = new MyOneWayListElement(8);
        MyOneWayListElement elementC = new MyOneWayListElement(9);
        MyOneWayListElement elementD = new MyOneWayListElement(10);
        MyOneWayListElement elementE = new MyOneWayListElement(11);

        //Założenie: Element możemy dodać tylko raz
        lista.addAtBeginning(elementC);
        lista.addAtBeginning(elementB);
        lista.addAtBeginning(elementA);
        lista.addAtEnd(elementE);
        lista.addAfterElement(elementD, elementC);

        lista.printAll();
    }
}
