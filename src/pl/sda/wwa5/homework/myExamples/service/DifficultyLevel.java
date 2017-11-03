package pl.sda.wwa5.homework.myExamples.service;

public enum DifficultyLevel {
    EASY(5),
    MEDIUM(10),
    HARD(15);

    int mines;

    DifficultyLevel(int mines) {
        this.mines = mines;
    }

    int getMinesNumber() {
        return mines;
    }
}
