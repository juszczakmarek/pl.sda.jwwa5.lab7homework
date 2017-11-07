package pl.sda.wwa5.homework;

import pl.sda.wwa5.homework.myExamples.DifficultyLevel;
import pl.sda.wwa5.homework.myExamples.Minefield;
import pl.sda.wwa5.homework.myExamples.gui.MineFieldGUI;
import pl.sda.wwa5.homework.myExamples.service.MinefieldCreator;

import static pl.sda.wwa5.homework.myExamples.gui.MinesweeperWindowsCreator.run;

public class MinesweeperRunner {

    public static void main(String[] args) {

        DifficultyLevel difficultyLevel = DifficultyLevel.EASY;
        int xDimension=5;
        int yDimension=5;
        int sizeMultiplier=50;
        Minefield minefield = new Minefield(xDimension,yDimension, DifficultyLevel.EASY, new MinefieldCreator());

        run(new MineFieldGUI(xDimension,yDimension,difficultyLevel, minefield),xDimension*sizeMultiplier, yDimension*sizeMultiplier);

    }
}
