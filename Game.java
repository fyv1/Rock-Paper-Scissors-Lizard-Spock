package pl.fyv;

import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private int option;
    Game(int option) {
        this.option = option;
    }

    private int cpu = ThreadLocalRandom.current().nextInt(1,6);
    private int user;

    public void startGame(int option) {
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
        if(whoWon() == 3) System.out.println("Remis");
        if(whoWon() == 1) System.out.println("Wygral komputer");
        if(whoWon() == 0) System.out.println("Wygral uzytkownik");

    }

    private int whoWon() {
        int c = getCpu();
        int u = getUser(); // 1 rock - 2 paper - 3 scissor - 4 lizard - 5 spock

        if(isTie(c, u)) return 3; // tie
        if(userIsBeaten(c, u)) return 1; //user loses
        if(userIsBeaten(c, u)) return 0; //user wins

        return c; //idk xDDDDD
    }

    private boolean isTie(int c, int u) {
        if(c == u) return true;
        else return false;
    }

    private boolean userIsBeaten(int c, int u) { // main mechanism TODO idk

        if(c == 1 && u == 2) return false; //cpu = rock, user = paper - CPU loses
        if(c == 1 && u == 3) return true; //cpu = rock, uer = scissors - CPU wins
        if(c == 1 && u == 4) return true; //cpu = rock, user = lizard - CPU wins
        if(c == 1 && u == 5) return false; //cpu = rock, user = spock - CPU loses

        if(c == 2 && u == 1) return true; // cpu = paper, user = rock - CPU wins
        if(c == 2 && u == 3) return false; // cpu = paper, user = scissors - CPU loses
        if(c == 2 && u == 4) return false; // cpu = paper, user = lizard - CPU loses
        if(c == 2 && u == 5) return true; // cpu = paper, user = spock - CPU wins

        if(c == 3 && u == 1) return false; //cpu = scissors, user = rock - CPU loses
        if(c == 3 && u == 2) return true; //cpu = scissors, user = paper - CPU wins
        if(c == 3 && u == 4) return true; //cpu = scissors, user = lizard - CPU wins
        if(c == 3 && u == 5) return false; //cpu = scissors, user = spock - CPU loses

        if(c == 4 && u == 1) return false; //cpu = lizard, user = rock - CPU loses
        if(c == 4 && u == 2) return true; //cpu = lizard, user = paper - CPU wins
        if(c == 4 && u == 3) return false; //cpu = lizard, user = scissor - CPU loses
        if(c == 4 && u == 5) return true; //cpu = lizard, user = spock - CPU wins

        if(c == 5 && u == 1) return true; //cpu = spock, user = rock - CPU wins
        if(c == 5 && u == 2) return false; //cpu = spock, user = paper - CPU loses
        if(c == 5 && u == 3) return true; // cpu = spock, user = rock - CPU wins
        if(c == 5 && u == 4) return false; //cpu = spock, user = lizard - CPU loses


        return false; // idk why xD
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


    public void setUser(int user) {
        this.user = user;
    }

    private void gameHelp() {
        System.out.println("kiedys tu bedzie opis pomocy"); //todo pomoc
    }
}
