package pl.sda.wwa5.homework.myExamples.gui;



import javax.swing.*;


public class MineFieldButton extends JToggleButton.ToggleButtonModel {

    public void reset() {
        super.setSelected(false);
    }

    @Override
    public void setSelected(boolean b) {
        if (!isSelected()) {
            super.setSelected(b);
        }
    }
}
