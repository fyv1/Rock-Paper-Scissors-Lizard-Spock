package pl.fyv;

import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private int option;
    Game(int option) {
        this.option = option;
    }

    private int cpu = ThreadLocalRandom.current().nextInt(1,6);
    private int user;




}
