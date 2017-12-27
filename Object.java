package pl.fyv;

public enum Object {

    ROCK,
    PAPER,
    SCISSOR,
    LIZARD,
    SPOCK;

    public static Object set(int value) {
        switch (value) {
            case 1:
                return ROCK;
            case 2:
                return PAPER;
            case 3:
                return SCISSOR;
            case 4:
                return LIZARD;
            case 5:
                return SPOCK;
            default:
                throw new IllegalArgumentException("Wrong value!");
        }
    }

    public boolean beats(Object things) {
        switch(this) {
            case ROCK:
                return things == SCISSOR || things == LIZARD;
            case PAPER:
                return things == ROCK || things == SPOCK;
            case SCISSOR:
                return things == PAPER || things == LIZARD;
            case LIZARD:
                return things == PAPER || things == SPOCK;
            case SPOCK:
                return things == ROCK || things == SCISSOR;
            default:
                throw new IllegalArgumentException("Unknown object");
        }
    }
}


