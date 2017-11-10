package pl.sda.wwa5.homework.myExamples;

public enum DifficultyLevel {
    EASY(10),
    MEDIUM(20),
    HARD(40);

    int mines;

    DifficultyLevel(int mines) {
        this.mines = mines;
    }

    public int getMinesNumber() {
        return mines;
    }
}
