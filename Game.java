package pl.fyv;

import java.util.concurrent.ThreadLocalRandom;

public class Game {

    Object us, cp;

    Game(int user) {
        us.set(user);
        cp.set(ThreadLocalRandom.current().nextInt(1,6));
    }

    public void whoWon() {
        if(us.equals(cp)) System.out.println("It's a tie!");
        else if(us.beats(cp)) System.out.println(us.name() +" destroys "+ cp.name()+ "! You won!");
        else System.out.println(cp.name() +" destroys "+ us.name()+ "! You lost.");
    }




}
