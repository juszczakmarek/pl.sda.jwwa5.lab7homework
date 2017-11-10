package pl.sda.wwa5.homework.myExamples;

public class DifficultySettings {

    private int xDimension;
    private int yDimension;
    private int numberOfMines;

    public DifficultySettings(DifficultyLevel difficultyLevel) {

        this.xDimension = validateMaxSize(difficultyLevel.getMinesNumber());
        this.yDimension = validateMaxSize(difficultyLevel.getMinesNumber());
        this.numberOfMines = difficultyLevel.getMinesNumber();
    }

    private int validateMaxSize(int numberOfMines) {
        return (numberOfMines > 10 ? 10 : numberOfMines);
    }

    public int getxDimension() {
        return xDimension;
    }

    public int getyDimension() {
        return yDimension;
    }

    public int getNumberOfMines() {
        return numberOfMines;
    }
}
