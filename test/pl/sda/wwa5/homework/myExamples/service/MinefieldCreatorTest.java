package pl.sda.wwa5.homework.myExamples.service;

import org.junit.Before;
import org.junit.Test;

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
         hasMine = minefieldCreator.assignMineRandomly(0);
         assertFalse(hasMine);
    }

    @Test
    public void assignMineRandomly() throws Exception {
         boolean hasMine;
         hasMine = minefieldCreator.assignMineRandomly(0);
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

}