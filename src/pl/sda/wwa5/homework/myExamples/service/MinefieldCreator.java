package pl.sda.wwa5.homework.myExamples.service;

import pl.sda.wwa5.homework.myExamples.SingleField;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MinefieldCreator {

    public List<SingleField> createMinefield(int xDimension, int yDimension, int numberOfMines) {
        //TODO This method should be moved to class MinefieldCreator

        List<SingleField> localMinefield = new ArrayList<>();

        int minesLeft=numberOfMines;

        for (int i=0;i<(xDimension*yDimension);i++) {
            boolean hasMine = assignMineRandomly(minesLeft);
            if (hasMine) {
                minesLeft = updateNumberOfMines(minesLeft);
            }
            localMinefield.add(new SingleField(hasMine));
        }

        return localMinefield;
    }

    public List<SingleField> updateNumberOfMinesOnNeighbouringFields(int xDimension, int yDimension, List<SingleField> minefield) {

        List<SingleField> localMinefield = minefield;

        for (SingleField field : minefield) {
            if (field.hasMine()) {
                int thisIndex = minefield.indexOf(field);
                List<Integer> neighboursList = checkNieghbours(xDimension,yDimension,thisIndex);
                for (Integer neighbourIndex : neighboursList) {
                    minefield.get(neighbourIndex).updateNeighbouringMines();
                }
            }
        }

        return localMinefield;
    }

    public boolean assignMineRandomly(int minesLeft) {
        Random random = new Random();
        return ((minesLeft>0) && random.nextBoolean());
    }

    public List<Integer> checkNieghbours(int xDimension, int yDimension, int fieldIndex) {
        List<Integer> neigbhoursList = new ArrayList<>();
        int topLeftCorner = 0;
        int topRightCorner = xDimension-1;
        int bottomLeftCorner = xDimension*yDimension-xDimension;
        int bottomRightCorner = xDimension*yDimension-1;

        if (fieldIndex==topLeftCorner) { //top-left corner
            neigbhoursList.add(fieldIndex+1);
            neigbhoursList.add(fieldIndex+xDimension);
            neigbhoursList.add(fieldIndex+xDimension+1);
            return neigbhoursList;
        }

        if (fieldIndex==topRightCorner) {//top-right corner
            neigbhoursList.add(fieldIndex-1);
            neigbhoursList.add(fieldIndex+xDimension);
            neigbhoursList.add(fieldIndex+xDimension-1);
            return neigbhoursList;
        }

        if (fieldIndex==bottomLeftCorner) {//bottom-left corner
            neigbhoursList.add(fieldIndex+1);
            neigbhoursList.add(fieldIndex-xDimension);
            neigbhoursList.add(fieldIndex-xDimension+1);
            return neigbhoursList;
        }

        if (fieldIndex==bottomRightCorner) {//bottom-right corner
            neigbhoursList.add(fieldIndex-1);
            neigbhoursList.add(fieldIndex-xDimension);
            neigbhoursList.add(fieldIndex-xDimension-1);
            return neigbhoursList;
        }

        if (fieldIndex>topLeftCorner && fieldIndex<topRightCorner) { //top border excluding corners
            neigbhoursList.add(fieldIndex-1);
            neigbhoursList.add(fieldIndex+xDimension-1);
            neigbhoursList.add(fieldIndex+xDimension);
            neigbhoursList.add(fieldIndex+xDimension+1);
            neigbhoursList.add(fieldIndex+1);
            return neigbhoursList;
        }

        if (fieldIndex>bottomLeftCorner && fieldIndex<bottomRightCorner) { //bottom border excluding corners
            neigbhoursList.add(fieldIndex-1);
            neigbhoursList.add(fieldIndex-xDimension-1);
            neigbhoursList.add(fieldIndex-xDimension);
            neigbhoursList.add(fieldIndex-xDimension+1);
            neigbhoursList.add(fieldIndex+1);
            return neigbhoursList;
        }

        if (fieldIndex%xDimension==0 && fieldIndex>topLeftCorner && fieldIndex<bottomLeftCorner) { //left border except corners
            neigbhoursList.add(fieldIndex-xDimension);
            neigbhoursList.add(fieldIndex-xDimension+1);
            neigbhoursList.add(fieldIndex+1);
            neigbhoursList.add(fieldIndex+xDimension);
            neigbhoursList.add(fieldIndex+xDimension+1);
            return neigbhoursList;
        }

        if ((fieldIndex-xDimension+1)%xDimension==0 && fieldIndex>topRightCorner && fieldIndex<bottomRightCorner) { //right border except corners
            neigbhoursList.add(fieldIndex-xDimension);
            neigbhoursList.add(fieldIndex-xDimension-1);
            neigbhoursList.add(fieldIndex-1);
            neigbhoursList.add(fieldIndex+xDimension-1);
            neigbhoursList.add(fieldIndex+xDimension);
            return neigbhoursList;
        }

        neigbhoursList.add(fieldIndex-xDimension-1);
        neigbhoursList.add(fieldIndex-xDimension);
        neigbhoursList.add(fieldIndex-xDimension+1);
        neigbhoursList.add(fieldIndex+1);
        neigbhoursList.add(fieldIndex+xDimension+1);
        neigbhoursList.add(fieldIndex+xDimension);
        neigbhoursList.add(fieldIndex+xDimension-1);
        neigbhoursList.add(fieldIndex-1);
        return neigbhoursList;
    }


    public int updateNumberOfMines(int numberOfMines) {
        if (numberOfMines>0) {
            return --numberOfMines;
        }
        return numberOfMines;
    }

}
