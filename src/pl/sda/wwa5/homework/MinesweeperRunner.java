package pl.sda.wwa5.homework;

import pl.sda.wwa5.homework.myExamples.DifficultyLevel;
import pl.sda.wwa5.homework.myExamples.DifficultySettings;
import pl.sda.wwa5.homework.myExamples.minefield.Minefield;
import pl.sda.wwa5.homework.myExamples.gui.MineFieldGUI;
import pl.sda.wwa5.homework.myExamples.service.MinefieldCreator;

import static pl.sda.wwa5.homework.myExamples.gui.MinesweeperWindowsCreator.run;

public class MinesweeperRunner {

    public static void main(String[] args) {

        DifficultySettings difficultySettings = new DifficultySettings(DifficultyLevel.HARD);
        Minefield minefield = new Minefield(difficultySettings, new MinefieldCreator());

        int sizeMultiplier=45;
        run(new MineFieldGUI(difficultySettings, minefield),difficultySettings.getxDimension()*sizeMultiplier,
                difficultySettings.getyDimension()*sizeMultiplier);

    }
}
