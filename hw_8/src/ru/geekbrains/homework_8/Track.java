package ru.geekbrains.homework_8;

public class Track implements Main.Competitions {
    private int track_length;
    private boolean isDo = true;

    public Track(int track_length) {
        this.track_length = track_length;
    }

    public void action(Main.Discipline players) {
        if(players.getMax_player_length()<track_length){
            System.out.println("Участник выбввает из соревнований!!!");
            players.setDo(false);
        }
        else players.running();
    }
}
