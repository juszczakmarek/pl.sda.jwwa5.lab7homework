package pl.sda.wwa5.homework.myExamples.service;

import java.util.ArrayList;

public class MineFieldCreator {

    private int mineFieldXdimension;
    private int mineFieldYdimension;
    private int numberOfFields;
    private int numberOfMines;
    private ArrayList<MinefieldSingleField> mineField;

    public MineFieldCreator(int mineFieldXdimension, int mineFieldYdimension, DifficultyLevel difficultyLevel) {
        this.mineFieldXdimension = mineFieldXdimension;
        this.mineFieldYdimension = mineFieldYdimension;
        this.numberOfFields = mineFieldXdimension*mineFieldYdimension;
        this.numberOfMines = difficultyLevel.getMinesNumber();
        this.mineField = createMineField();
    }

    private ArrayList<MinefieldSingleField> createMineField() {
        ArrayList<MinefieldSingleField> localMineField = new ArrayList<>();

        return localMineField;
    }

}
