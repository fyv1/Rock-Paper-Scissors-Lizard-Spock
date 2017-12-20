package pl.fyv;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
	    Game g = new Game(s.nextInt());
	    g.showMenu(g.getOption());

    }
}
