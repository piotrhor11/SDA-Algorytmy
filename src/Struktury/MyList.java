package Struktury;

public class MyList {

    MyListElement _head;
    MyListElement _tail;
    int count = 0;

    public void addAtEnd(MyListElement element) {

        if (_head == null) {
            element.previous = null;
            _head = element;
            _tail = element;            //Czy potrzebne???
            this.count = 1;
        } else {
            _tail.updateNext(element);
            element.updatePrevious(_tail);
            element.updateNext(null);
            _tail = element;
            this.count++;
        }
    }

    public void addAtBeginning(MyListElement element) {

        if (_tail == null) {
            _tail = element;
            _head = element;
            this.count = 1;
        } else {
            element.updatePrevious(null);
            element.updateNext(_head);
            _head.updatePrevious(element);
            _head = element;
            this.count++;
        }
    }

    public void remove(MyListElement element) {                 //ToDo remove()

    }

    public void goThroughForward(MyList list) {
        MyListElement p = list._head;
        while (p != null) {
            System.out.printf("%s", p.dataS);
            System.out.println();
            if (p.next == null) {
                break;
            } else {
                p = p.next;
            }
        }
    }

    public void goThroughBackward(MyList list) {
        MyListElement p = list._tail;
        while (p != null) {
            System.out.printf("%s", p.dataS);
            System.out.println();
            if (p.previous == null) {
                break;
            } else {
                p = p.previous;
            }
        }
    }

    public void printAllElements(MyList lista) {
        MyListElement p = lista._head;
        while (p != null) {
            System.out.println(p.dataN);
            p = p.next;
        }
    }

    public MyListElement findElement(MyList lista, MyListElement element) {
        MyListElement p = lista._head;
        while (p != null) {
            if (element.dataN == p.dataN) {
                return p;
            } else if (p.next != null) {
                p = p.next;
            } else {
                break;
            }
        }
        return null;
    }

    public void addElementBeforeElement(MyListElement newElement, MyListElement existingElement, MyList lista) {

        if (findElement(lista, existingElement) != null) {

            if (existingElement.previous == null) {
                lista.addAtBeginning(newElement);
            } else {
                newElement.previous = existingElement.previous;
                existingElement.previous.next = newElement;
                existingElement.previous = newElement;
                newElement.next = existingElement;
                this.count++;
            }
        } else {
            System.out.println("ERROR!!!! Elementu nie ma w liście");
        }
    }

    public void addElementAfterElement(MyListElement newElement, MyListElement existingElement, MyList lista) {

        if (findElement(lista, existingElement) != null) {

            if (existingElement.next == null) {
                lista.addAtEnd(newElement);
            } else {
                existingElement.next.previous = newElement;
                newElement.next = existingElement.next;
                existingElement.next = newElement;
                newElement.previous = existingElement;
                count++;
            }

        } else {
            System.out.println("ERROR!!! Elementu nie ma na liście");
        }

    }

}
