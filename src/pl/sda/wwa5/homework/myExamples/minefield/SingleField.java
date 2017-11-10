package pl.sda.wwa5.homework.myExamples.minefield;

import java.util.ArrayList;

public class SingleField {

    private boolean hasMine;
    private int neighbouringMines;

    public SingleField(boolean hasMine) {
        this.hasMine = hasMine;
        this.neighbouringMines = 0;
    }

    public boolean hasMine() {
        return this.hasMine;
    }

    public void updateNeighbouringMines() {
        ++this.neighbouringMines;
    }

    public int getNeighbouringMines() {
        return neighbouringMines;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[hasMine=");
        stringBuilder.append(hasMine);
        stringBuilder.append(",neighbouringMines=");
        stringBuilder.append(neighbouringMines);
        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
