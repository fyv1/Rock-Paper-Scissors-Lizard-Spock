package pl.fyv;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("1 - rock \t 2 - paper \t 3 - scissor \t 4 - lizard \t 5 - spock");

        System.out.println("What's your choice?: ");
        Game g = new Game(s.nextInt());
        g.whoWon();

    }
}