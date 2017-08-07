package Struktury;

public class MyList {

    MyListElement _head;
    MyListElement _tail;
    int count = 0;

    //ADDING ELEMENTS

    public void addAtEnd(MyListElement element) {

        if (_head == null) {
            element.updatePrevious(null);
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

    public void addElementBeforeElement(MyListElement newElement, MyListElement existingElement) {

        if (findElement(existingElement) != null) {

            if (existingElement.previous == null) {
                this.addAtBeginning(newElement);
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

    public void addElementAfterElement(MyListElement newElement, MyListElement existingElement) {

        if (findElement(existingElement) != null) {

            if (existingElement.next == null) {
                this.addAtEnd(newElement);
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

    //REMOVING ELEMENTS

    public void removeBeginning() {
        if (_head != null) {
            _head.next.updatePrevious(null);
            _head = _head.next;
            this.count--;
        } else {
            System.out.printf("\nEmpty list, nothing to do! :(\n");
        }
    }

    public void removeEnd() {
        if (_tail != null) {
            _tail.previous.updateNext(null);
            _tail = _tail.previous;
            this.count--;
        } else {
            System.out.printf("\nEmpty list, nothing to do!\n");
        }
    }

    public void remove(MyListElement element) {

        if (findElement(element) != null) {
            if (element == _head) {
                removeBeginning();
            } else if (element == _tail) {
                removeEnd();
            } else {
                element.previous.updateNext(element.next);
                element.next.updatePrevious(element.previous);
                count--;
            }
        } else {
            System.out.printf("\nElement not in the list!\n");
        }

    }

    //PRINTING

    public void printAll() {
        MyListElement p = this._head;
        while (p != null) {
            System.out.printf("%d\n", p.data);
            if (p.next == null) {
                break;
            } else {
                p = p.next;
            }
        }
    }

//    public void printAllElements() {
//        MyListElement p = this._head;
//        while (p != null) {
//            System.out.println(p.data);
//            p = p.next;                           //Przy ostatnim elemencie wyrzuci wyjątek
//        }
//    }

    public void printAllBackward() {
        MyListElement p = this._tail;
        while (p != null) {
            System.out.printf("%d", p.data);
            System.out.println();
            if (p.previous == null) {
                break;
            } else {
                p = p.previous;
            }
        }
    }

    //SUPPORT METHODS

    private MyListElement findElement(MyListElement element) {
        MyListElement p = this._head;
        while (p != null) {
            if (p.equals(element)) {
                return p;
            } else if (p.next != null) {
                p = p.next;
            } else {
                break;
            }
        }
        return null;
    }
}
