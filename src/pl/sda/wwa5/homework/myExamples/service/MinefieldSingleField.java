package pl.sda.wwa5.homework.myExamples.service;

public class MinefieldSingleField {
    private boolean hasMine;
    private boolean covered=true;
    private int neighbouringMines;

    public MinefieldSingleField(boolean hasMine) {
        this.hasMine = hasMine;
    }

    public int updateThisFieldNeighbouringMinesNumebr() {
        return ++this.neighbouringMines;
    }

    public MinefieldSingleField updateNieghbours(MinefieldSingleField thisField) {

        return null;
    }

}
