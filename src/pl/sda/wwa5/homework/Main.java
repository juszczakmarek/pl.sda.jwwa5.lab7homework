package pl.sda.wwa5.homework;

import pl.sda.wwa5.homework.myExamples.gui.*;

import static pl.sda.wwa5.homework.myExamples.gui.MinesweeperWindowsCreator.run;

public class Main {

    public static void main(String[] args) {
        run(new MineField(10,10,0),475, 425);
    }
}
