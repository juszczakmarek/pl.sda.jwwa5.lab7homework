package pl.sda.wwa5.homework;

import pl.sda.wwa5.homework.myExamples.DifficultyLevel;
import pl.sda.wwa5.homework.myExamples.Minefield;
import pl.sda.wwa5.homework.myExamples.service.MinefieldCreator;

public class MinesweeperRunner {

    public static void main(String[] args) {
//        run(new MineFieldGUI(10,10,0),475, 425);

        Minefield minefield = new Minefield(4,4, DifficultyLevel.EASY, new MinefieldCreator());

    }
}
