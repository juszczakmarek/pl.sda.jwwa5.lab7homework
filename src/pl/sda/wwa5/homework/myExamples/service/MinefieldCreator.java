package pl.sda.wwa5.homework.myExamples.service;

import java.util.Random;

public class MinefieldCreator {

    public boolean assignMineRandomly(int minesLeft) {
        Random random = new Random();
        return ((minesLeft>0) && random.nextBoolean());
    }

    public int updateNumberOfMines(int numberOfMines) {
        if (numberOfMines>0) {
            return --numberOfMines;
        }
        return numberOfMines;
    }

}
