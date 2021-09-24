package ru.geekbrains.homework_8;

public class Cat implements Main.Discipline {
    private int max_player_length;
    private int max_player_height;
    private boolean isDo = true;

    public Cat(int max_player_length, int max_player_height) {
        this.max_player_length = max_player_length;
        this.max_player_height = max_player_height;
    }

    public void setDo(boolean isDo) {
        this.isDo = isDo;
    }

    public boolean getDo() {
        return isDo;
    }

    public int getMax_player_length() {
        return max_player_length;
    }

    public int getMax_player_height() {
        return max_player_height;
    }

    public void running() {
        System.out.println("The Cat running");
    }

    public void jump() {
        System.out.println("The Cat jamps");
    }
}
