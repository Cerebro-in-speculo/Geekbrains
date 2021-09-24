package ru.geekbrains.homework_8;

public class Wall implements Main.Competitions {
    private int wall_height;
    private boolean isDo = true;

    public Wall(int wall_height) {
        this.wall_height = wall_height;
    }

    public void action(Main.Discipline players) {
        if (players.getMax_player_height() < wall_height) {
            System.out.println("Участник выбввает из соревнований!!!");
            players.setDo(false);
        } else players.jump();
    }
}
