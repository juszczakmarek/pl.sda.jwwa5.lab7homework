package pl.sda.wwa5.homework.myExamples.service;

public enum DifficultyLevel {
    EASY(10),
    MEDIUM(20),
    HARD(30);

    int mines;

    DifficultyLevel(int mines) {
        this.mines = mines;
    }

    int getMinesNumber() {
        return mines;
    }
}
