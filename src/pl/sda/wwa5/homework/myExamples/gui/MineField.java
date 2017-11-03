package pl.sda.wwa5.homework.myExamples.gui;

import javax.swing.*;
import java.awt.*;

public class MineField extends JFrame {

    private int mineFieldXdimension;
    private int mineFieldYdimension;
    private int numberOfFields;
    private int level;

    public MineField(int mineFieldXdimension, int mineFieldYdimension, int level) throws HeadlessException {
        this.mineFieldXdimension = mineFieldXdimension;
        this.mineFieldYdimension = mineFieldYdimension;
        this.numberOfFields = mineFieldXdimension * mineFieldYdimension;
        this.level = level;
        generateMineField(this.mineFieldXdimension,this.mineFieldYdimension);
    }

    private void generateMineField(int fieldsNumber, int level) {
        Container mineFieldContainer = getContentPane();
        mineFieldContainer.setLayout(new GridLayout(this.mineFieldXdimension, this.mineFieldYdimension));
        for (int i=1;i<=numberOfFields;i++) {
            mineFieldContainer.add(new JButton(""));
        }
    }

}
