package pl.sda.wwa5.homework;

import pl.sda.wwa5.homework.myExamples.service.DifficultyLevel;
import pl.sda.wwa5.homework.myExamples.service.MinefieldCreator;

public class MinesweeperRunner {

    public static void main(String[] args) {
//        run(new MineFieldGUI(10,10,0),475, 425);
        MinefieldCreator minefieldCreator = new MinefieldCreator(4,4, DifficultyLevel.EASY);
        System.out.println(minefieldCreator.toString());
    }
}
