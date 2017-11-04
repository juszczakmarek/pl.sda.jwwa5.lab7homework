package pl.sda.wwa5.homework.myExamples;

import pl.sda.wwa5.homework.myExamples.service.MinefieldCreator;

import java.util.ArrayList;
import java.util.List;

public class Minefield {

    private int xDimension;
    private int yDimension;
    private int numberOfMines;
    private int minesLeft;
    private List<SingleField> minefield;
    private MinefieldCreator minefieldCreator;

    public Minefield(int xDimension, int yDimension, DifficultyLevel difficultyLevel, MinefieldCreator minefieldCreator) {
        this.xDimension = xDimension;
        this.yDimension = yDimension;
        this.numberOfMines = difficultyLevel.getMinesNumber();
        this.minesLeft = difficultyLevel.getMinesNumber();
        this.minefieldCreator = minefieldCreator;
    }

    public List<SingleField> createMinefield(int xDimension, int yDimension, int numberOfMines) {
        //TODO This method should be moved to class MinefieldCreator

        List<SingleField> localMinefield = new ArrayList<>();

        for (int i=0;i<(xDimension*yDimension);i++) {
            boolean hasMine = minefieldCreator.assignMineRandomly(minesLeft);
            if (hasMine) {
                this.minesLeft = minefieldCreator.updateNumberOfMines(minesLeft);
            }
            localMinefield.add(new SingleField(hasMine));
        }

        return localMinefield;
    }


}
