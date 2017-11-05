package pl.sda.wwa5.homework;

import pl.sda.wwa5.homework.myExamples.DifficultyLevel;
import pl.sda.wwa5.homework.myExamples.Minefield;
import pl.sda.wwa5.homework.myExamples.gui.MineFieldGUI;
import pl.sda.wwa5.homework.myExamples.service.MinefieldCreator;

import static pl.sda.wwa5.homework.myExamples.gui.MinesweeperWindowsCreator.run;

public class MinesweeperRunner {

    public static void main(String[] args) {

        int xDimension=4;
        int yDimension=4;
        DifficultyLevel difficultyLevel = DifficultyLevel.EASY;
        Minefield minefield = new Minefield(xDimension,yDimension, DifficultyLevel.EASY, new MinefieldCreator());

        run(new MineFieldGUI(xDimension,yDimension,difficultyLevel, minefield),475, 425);

    }
}
