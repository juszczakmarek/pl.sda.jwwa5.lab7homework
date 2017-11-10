package pl.sda.wwa5.homework.myExamples.service;

import pl.sda.wwa5.homework.myExamples.minefield.SingleField;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MinefieldCreator {

    public List<SingleField> createMinefield(int xDimension, int yDimension, int numberOfMines) {

        List<SingleField> localMinefield = new ArrayList<>();
        Random random = new Random();

        int minesLeft=numberOfMines;

        for (int i=0;i<(xDimension*yDimension);i++) {
            boolean hasMine = assignMineRandomly(minesLeft, random.nextBoolean());
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

    public boolean assignMineRandomly(int minesLeft, boolean random) {
        return (minesLeft > 0) && random;
    }

    private int topLeft(List<Integer> parametersToBeVerified) {
        int xDimension = parametersToBeVerified.get(0);
        int fieldIndex = parametersToBeVerified.get(2);
        return fieldIndex-xDimension-1;
    }

    private int top(List<Integer> parametersToBeVerified) {
        int xDimension = parametersToBeVerified.get(0);
        int fieldIndex = parametersToBeVerified.get(2);
        return fieldIndex-xDimension;
    }

    private int topRight(List<Integer> parametersToBeVerified) {
        int xDimension = parametersToBeVerified.get(0);
        int fieldIndex = parametersToBeVerified.get(2);
        return fieldIndex-xDimension+1;
    }

    private int right(List<Integer> parametersToBeVerified) {
        int xDimension = parametersToBeVerified.get(0);
        int fieldIndex = parametersToBeVerified.get(2);
        return fieldIndex+1;
    }

    private int bottomRight(List<Integer> parametersToBeVerified) {
        int xDimension = parametersToBeVerified.get(0);
        int fieldIndex = parametersToBeVerified.get(2);
        return fieldIndex+xDimension+1;
    }

    private int bottom(List<Integer> parametersToBeVerified) {
        int xDimension = parametersToBeVerified.get(0);
        int fieldIndex = parametersToBeVerified.get(2);
        return fieldIndex+xDimension;
    }

    private int bottomLeft(List<Integer> parametersToBeVerified) {
        int xDimension = parametersToBeVerified.get(0);
        int fieldIndex = parametersToBeVerified.get(2);
        return fieldIndex+xDimension-1;
    }

    private int left(List<Integer> parametersToBeVerified) {
        int fieldIndex = parametersToBeVerified.get(2);
        return fieldIndex-1;
    }

    public List<Integer> checkNieghbours(int xDimension, int yDimension, int fieldIndex) {
        List<Integer> neigbhoursList = new ArrayList<>();
        List<Integer> fieldParameters = new ArrayList<>();

        fieldParameters.add(xDimension);
        fieldParameters.add(yDimension);
        fieldParameters.add(fieldIndex);


        if (neighbourExist(fieldParameters,topLeft(fieldParameters))) {
            neigbhoursList.add(topLeft(fieldParameters));
        }

        if (neighbourExist(fieldParameters,top(fieldParameters))) {
            neigbhoursList.add(top(fieldParameters));
        }

        if (neighbourExist(fieldParameters,topRight(fieldParameters))) {
            neigbhoursList.add(topRight(fieldParameters));
        }

        if (neighbourExist(fieldParameters,right(fieldParameters))) {
            neigbhoursList.add(right(fieldParameters));
        }

        if (neighbourExist(fieldParameters,bottomRight(fieldParameters))) {
            neigbhoursList.add(bottomRight(fieldParameters));
        }

        if (neighbourExist(fieldParameters,bottom(fieldParameters))) {
            neigbhoursList.add(bottom(fieldParameters));
        }

        if (neighbourExist(fieldParameters,bottomLeft(fieldParameters))) {
            neigbhoursList.add(bottomLeft(fieldParameters));
        }

        if (neighbourExist(fieldParameters,left(fieldParameters))) {
            neigbhoursList.add(left(fieldParameters));
        }

        return neigbhoursList;
    }

    private int getFieldRowNumber(int xDimension, int yDimension, int verifiedFieldIndex) {
        return verifiedFieldIndex/xDimension;
    }

    private int getFieldColNumber(int xDimension, int yDimension, int verifiedFieldIndex) {
        int verifiedFieldRowNumber = getFieldRowNumber(xDimension,yDimension,verifiedFieldIndex);
        return verifiedFieldIndex-(verifiedFieldRowNumber*xDimension);
    }

    public boolean neighbourExist(List<Integer> parametersToBeVerified, int verifiedFieldIndex) {

        int xDimension = parametersToBeVerified.get(0);
        int yDimension = parametersToBeVerified.get(1);
        int fieldIndex = parametersToBeVerified.get(2);

        int verifiedFieldRowNumber=getFieldRowNumber(xDimension,yDimension,fieldIndex);
        int verifiedFieldColNumber=getFieldColNumber(xDimension,yDimension,fieldIndex);

        int fieldRowNumber=fieldIndex/xDimension;
        int fieldColNumber=fieldIndex-(fieldRowNumber*xDimension);

        if (verifiedFieldIndex<0) {
            return false;
        }

        if (Math.abs(fieldRowNumber-verifiedFieldRowNumber)>1) {
            return false;
        }

        if (Math.abs(fieldColNumber-verifiedFieldColNumber)>1) {
            return false;
        }

        if (verifiedFieldRowNumber>=xDimension) {
            return false;
        }

        return true;
    }

    public int updateNumberOfMines(int numberOfMines) {
        if (numberOfMines>0) {
            return --numberOfMines;
        }
        return numberOfMines;
    }

}
