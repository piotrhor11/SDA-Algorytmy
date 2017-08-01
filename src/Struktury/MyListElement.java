package Struktury;

public class MyListElement {

    MyListElement next = null;
    MyListElement previous = null;

    String dataS = "";
    int dataN = 0;

    public MyListElement(String dataS, int dataN) {
        this.dataS = dataS;
        this.dataN = dataN;
    }

    public void changeData(String data) {
        this.dataS = dataS;
        this.dataN = dataN;
    }

    public void updateNext(MyListElement update) {
        this.next = update;
    }

    public void updatePrevious(MyListElement update) {
        this.previous = update;
    }
}
