package pl.sda.wwa5.homework.myExamples.service;

import org.junit.Before;
import org.junit.Test;
import pl.sda.wwa5.homework.myExamples.minefield.SingleField;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class MinefieldCreatorTest {
    private MinefieldCreator minefieldCreator;

    @Before
    public void setUp() throws Exception {
        minefieldCreator = new MinefieldCreator();
    }

    @Test
    public void assignMineRandomlyNoMinesLeft() throws Exception {
         boolean hasMine;
         boolean randomBoolenSetAsTrue=true;
         hasMine = minefieldCreator.assignMineRandomly(0, randomBoolenSetAsTrue);
         assertFalse(hasMine);
    }

    @Test
    public void assignMineRandomly() throws Exception {
         boolean hasMine;
         boolean randomBoolen = new Random().nextBoolean();

         hasMine = minefieldCreator.assignMineRandomly(0,randomBoolen);
         assertTrue(hasMine==true || hasMine==false);
    }

    @Test
    public void updateNumberOfMinesNoMinesLeft() throws Exception {
        int mines;
        mines=minefieldCreator.updateNumberOfMines(0);
        assertEquals(mines,0);
    }

    @Test
    public void updateNumberOfMines() throws Exception {
        int mines;
        mines=minefieldCreator.updateNumberOfMines(10);
        assertEquals(mines,9);
    }

    @Test
    public void createMinefield() throws Exception {
        List<SingleField> minefield = minefieldCreator.createMinefield(5,5,10);
        assertEquals(minefield.size(),25);
    }

    @Test
    public void neighbourExist() {
        int fieldIndex=14;
        int verifiedFieldIndex;
        int xDimension=5;
        int yDimension=5;

        List<Integer> fieldParameters = new ArrayList<>();

        fieldParameters.add(5);
        fieldParameters.add(5);
        fieldParameters.add(14);

        verifiedFieldIndex=fieldIndex-xDimension-1;
        minefieldCreator.neighbourExist(fieldParameters,verifiedFieldIndex);
//        assertFalse(minefieldCreator.neighbourExist(xDimension,yDimension,fieldIndex,verifiedFieldIndex));

        verifiedFieldIndex=fieldIndex-xDimension;
        minefieldCreator.neighbourExist(fieldParameters,verifiedFieldIndex);
//        assertFalse(minefieldCreator.neighbourExist(xDimension,yDimension,fieldIndex,verifiedFieldIndex));

        verifiedFieldIndex=fieldIndex-xDimension+1;
        minefieldCreator.neighbourExist(fieldParameters,verifiedFieldIndex);
//        assertFalse(minefieldCreator.neighbourExist(xDimension,yDimension,fieldIndex,verifiedFieldIndex));

        verifiedFieldIndex=fieldIndex+1;
        minefieldCreator.neighbourExist(fieldParameters,verifiedFieldIndex);
//        assertTrue(minefieldCreator.neighbourExist(xDimension,yDimension,fieldIndex,verifiedFieldIndex));

        verifiedFieldIndex=fieldIndex+xDimension+1;
        minefieldCreator.neighbourExist(fieldParameters,verifiedFieldIndex);
//        assertTrue(minefieldCreator.neighbourExist(xDimension,yDimension,verifiedFieldIndex));

        verifiedFieldIndex=fieldIndex+xDimension;
        minefieldCreator.neighbourExist(fieldParameters,verifiedFieldIndex);
//        assertTrue(minefieldCreator.neighbourExist(xDimension,yDimension,verifiedFieldIndex));

        verifiedFieldIndex=fieldIndex+xDimension-1;
        minefieldCreator.neighbourExist(fieldParameters,verifiedFieldIndex);
//        assertFalse(minefieldCreator.neighbourExist(xDimension,yDimension,verifiedFieldIndex));

        verifiedFieldIndex=fieldIndex-1;
        minefieldCreator.neighbourExist(fieldParameters,verifiedFieldIndex);
//        assertFalse(minefieldCreator.neighbourExist(xDimension,yDimension,verifiedFieldIndex));
    }

}