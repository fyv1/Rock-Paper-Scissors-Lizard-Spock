package pl.fyv;

import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private int option;
    Game(int option) {
        this.option = option;
    }

    private int cpu = ThreadLocalRandom.current().nextInt(1,6);
    private int user;

    public void showMenu(int option) {
        System.out.println("1: Rock");
        System.out.println("2: Paper");
        System.out.println("3: Scissor");
        System.out.println("4: Lizard");
        System.out.println("5: Spock");
        System.out.println("0: Help");

        switch(option) {
            case 1:
                setUser(1);
                break;
            case 2:
                setUser(2);
                break;
            case 3:
                setUser(3);
                break;
            case 4:
                setUser(4);
                break;
            case 5:
                setUser(5);
                break;
            case 0:
                setUser(0);
                gameHelp();
                break;
        }

    }

    
    public int getOption() {
        return option;
    }

    public int getCpu() {
        return cpu;
    }

    public int getUser() {
        return user;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public void setUser(int user) {
        this.user = user;
    }

    private void gameHelp() {
        System.out.println("kiedys tu bedzie opis pomocy"); //todo pomoc
    }
}
