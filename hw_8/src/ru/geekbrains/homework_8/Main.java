package ru.geekbrains.homework_8;

public class Main {
    public interface Discipline {
        public void running();

        public void jump();

        public int getMax_player_length();

        public int getMax_player_height();

        public void setDo(boolean isDo);

        public boolean getDo();
    }

    public interface Competitions {
        public void action(Discipline players);
    }

    public static void main(String[] args) {

        Discipline[] players = {
                new Human(50, 50), new Robot(50, 100),
                new Cat(100, 100), new Robot(100, 100),
                new Robot(100, 100), new Human(100, 100)
        };

        Competitions[] games = {
                new Track(20), new Wall(100),
                new Track(100), new Track(100),
                new Wall(100), new Wall(100)
        };
        myCompetitions(players, games);// Старт!!!)
    }

    public static void myCompetitions(Discipline[] players, Competitions[] games) {
        for (Discipline player : players) {
            for (Competitions game : games) {
                if (player.getDo()) {
                    game.action(player);
                }
            }
        }
    }
}
