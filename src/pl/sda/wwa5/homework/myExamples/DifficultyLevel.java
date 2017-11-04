package pl.sda.wwa5.homework.myExamples;

public enum DifficultyLevel {
    EASY(5),
    MEDIUM(10),
    HARD(15);

    int mines;

    DifficultyLevel(int mines) {
        this.mines = mines;
    }

    public int getMinesNumber() {
        return mines;
    }
}
