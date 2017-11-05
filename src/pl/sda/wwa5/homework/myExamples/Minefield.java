package pl.sda.wwa5.homework.myExamples;

import pl.sda.wwa5.homework.myExamples.service.MinefieldCreator;

import java.util.List;

public class Minefield {

    private int xDimension;
    private int yDimension;
    private int numberOfMines;
    private List<SingleField> minefield;
    private MinefieldCreator minefieldCreator;

    public Minefield(int xDimension, int yDimension, DifficultyLevel difficultyLevel, MinefieldCreator minefieldCreator) {
        this.xDimension = xDimension;
        this.yDimension = yDimension;
        this.numberOfMines = difficultyLevel.getMinesNumber();
        this.minefieldCreator = minefieldCreator;
        this.minefield = minefieldCreator.createMinefield(xDimension,yDimension,numberOfMines);
        this.minefield = minefieldCreator.updateNumberOfMinesOnNeighbouringFields(xDimension,yDimension,this.minefield);
    }

    public List<SingleField> getMinefield() {
        return minefield;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("xDimension=");
        stringBuilder.append(xDimension);
        stringBuilder.append(", yDimension=");
        stringBuilder.append(yDimension);
        stringBuilder.append(", numberOfMines=");
        stringBuilder.append(numberOfMines);
        stringBuilder.append("\n");

        for (SingleField singleField : minefield) {
            stringBuilder.append(singleField.toString());
            if ((minefield.indexOf(singleField)+1)%xDimension==0) {
                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }
}
