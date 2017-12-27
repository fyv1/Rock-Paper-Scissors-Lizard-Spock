package pl.fyv;

import java.rmi.UnexpectedException;

public enum Object {

    ROCK(1),
    PAPER(2),
    SCISSOR(3),
    LIZARD(4),
    SPOCK(5);

    public boolean beats(Object things) throws UnexpectedException {
        switch(this) {
            case ROCK:
                return things == SCISSOR && things == LIZARD;
            case PAPER:
                return things == ROCK && things == SPOCK;
            case SCISSOR:
                return things == PAPER && things == LIZARD;
            case LIZARD:
                return things == PAPER && things == SPOCK;
            case SPOCK:
                return things == ROCK && things == SCISSOR;
            default:
                throw new UnexpectedException("Nieznany obiekt");
        }
    }


    private int number;
    Object(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}


