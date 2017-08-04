package Struktury;

public class MyOneWayList {

    MyOneWayListElement _head = null;

    public void addAtBeginning(MyOneWayListElement element) {
        if (_head == null) {
            _head = element;
        } else {
            element.next = _head;
            _head = element;
        }
    }

    public void addAtEnd(MyOneWayListElement element) {
        if (this.findTail() == null) {
            addAtBeginning(element);
        } else {
            findTail().next = element;
            element.next = null;              //Zabezpiecznie, gdyby komuś przyszło do głowy dodać już dodany obiekt (czyli taki z next!=null)
        }

    }

    public void addAfterElement(MyOneWayListElement newElement, MyOneWayListElement exisitngElement) {

        if (findElement(exisitngElement) == null) {
            System.out.printf("Error, nie ma takiego elementu");
        } else {
            newElement.next = findElement(exisitngElement).next;
            findElement(exisitngElement).next = newElement;
        }

    }

    public MyOneWayListElement findTail() {
        if (_head == null) {
            return null;
        } else {
            MyOneWayListElement iterator = _head;
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            return iterator;
        }
    }

    public MyOneWayListElement findElement(MyOneWayListElement element) {
        MyOneWayListElement currentElement = _head;
        while (currentElement != null) {
            if (currentElement.equals(element)) {
                return currentElement;
            }
            currentElement = currentElement.next;
        }
        return null;

    }

    public void printAll() {
        MyOneWayListElement element = _head;
        int index = 0;
        while (element != null) {
            System.out.printf("Element %d o wartości %d \n", index++, element._data);
            element = element.next;
        }
    }


}
