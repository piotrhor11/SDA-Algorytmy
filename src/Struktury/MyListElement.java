package Struktury;

public class MyListElement {

    MyListElement next = null;
    MyListElement previous = null;

    int data = 0;

    public MyListElement(int data) {
        this.data = data;
    }

    public void changeData(int data) {
        this.data = data;
    }

    public void updateNext(MyListElement update) {
        this.next = update;
    }

    public void updatePrevious(MyListElement update) {
        this.previous = update;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyListElement that = (MyListElement) o;

        return data == that.data;
    }

    @Override
    public int hashCode() {
        return data;
    }
}
