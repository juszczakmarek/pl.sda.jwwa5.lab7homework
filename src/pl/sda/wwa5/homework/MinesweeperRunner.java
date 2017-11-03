package pl.sda.wwa5.homework;

import pl.sda.wwa5.homework.myExamples.gui.*;
import pl.sda.wwa5.homework.myExamples.service.DifficultyLevel;
import pl.sda.wwa5.homework.myExamples.service.MineFieldCreator;

import static pl.sda.wwa5.homework.myExamples.gui.MinesweeperWindowsCreator.run;

public class MinesweeperRunner {

    public static void main(String[] args) {
//        run(new MineFieldGUI(10,10,0),475, 425);
        MineFieldCreator mineFieldCreator = new MineFieldCreator(10,10, DifficultyLevel.EASY);


    }
}
