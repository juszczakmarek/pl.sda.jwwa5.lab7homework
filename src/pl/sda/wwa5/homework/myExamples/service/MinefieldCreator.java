package pl.sda.wwa5.homework.myExamples.service;

import java.util.ArrayList;
import java.util.Random;

public class MinefieldCreator {

    private int mineFieldXdimension;
    private int mineFieldYdimension;
    private int numberOfFields;
    private int numberOfMines;
    private int minesLeft;
    private ArrayList<MinefieldSingleField> mineField;

    public MinefieldCreator(int mineFieldXdimension, int mineFieldYdimension, DifficultyLevel difficultyLevel) {
        this.mineFieldXdimension = mineFieldXdimension;
        this.mineFieldYdimension = mineFieldYdimension;
        this.numberOfFields = mineFieldXdimension*mineFieldYdimension;
        this.numberOfMines = difficultyLevel.getMinesNumber();
        this.minesLeft = this.numberOfMines;
        this.mineField = createMinefield(this.numberOfFields, this.numberOfMines);
        this.mineField = updateMinefieldWithNeighbouringMines(this.mineField);
    }

    private ArrayList<MinefieldSingleField> createMinefield(int localNumberOfFields, int localNumberOfMines) {

        int minesLeft=localNumberOfMines;

        ArrayList<MinefieldSingleField> localMineField = new ArrayList<>();
        for (int i=0;i<localNumberOfFields;i++) {
            localMineField.add(new MinefieldSingleField(assignMine(this.minesLeft)));
        }
        return localMineField;
    }

    private ArrayList<MinefieldSingleField> updateMinefieldWithNeighbouringMines(ArrayList<MinefieldSingleField> mineField) {
        ArrayList<MinefieldSingleField> localMineField = mineField;

        for (MinefieldSingleField currentField : localMineField) {
            if (currentField.hasMine()) {
                if (localMineField.indexOf(currentField) < this.mineFieldXdimension ) {

                }

                if ((localMineField.size()-localMineField.indexOf(currentField))<this.mineFieldXdimension) {

                }
            }

        }

        return localMineField;
    }

    private boolean assignMine(int minesLeft) {
        if (minesLeft>0) {
            Random random = new Random();
            boolean randomMineAssignment =  random.nextBoolean();
            if (randomMineAssignment) {
                this.minesLeft=updateLeftMinesNumber(this.minesLeft);
                return true;
            }
        }
        return false;
    }

    private int updateLeftMinesNumber(int minesLeftBeforeAssignement) {
        return --minesLeftBeforeAssignement;
    }

    @Override
    public String toString() {
        String finalString = "";
        int counter = 0;
        for (MinefieldSingleField currentField : this.mineField) {
            if (counter%this.mineFieldXdimension==0) {
                finalString+="\n(" + mineField.indexOf(currentField) + ")" + currentField.toString();
            } else {
                finalString += "(" + mineField.indexOf(currentField) + ")" + currentField.toString() + " ";
            }
            ++counter;
        }
    return finalString;
    }
}
