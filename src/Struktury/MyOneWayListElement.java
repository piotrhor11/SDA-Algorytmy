package Struktury;

public class MyOneWayListElement {

    MyOneWayListElement next = null;
    int _data;

    public MyOneWayListElement(int _data) {
        this._data = _data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyOneWayListElement element = (MyOneWayListElement) o;

        return _data == element._data;
    }

    @Override
    public int hashCode() {
        return _data;
    }
}
