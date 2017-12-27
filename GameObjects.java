package pl.fyv;


public enum GameObjects {

    ROCK(1),
    PAPER(2),
    SCISSOR(3),
    LIZARD(4),
    SPOCK(5);

    public static GameObjects set(int value) {
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

    private int value;
    private GameObjects(int value) {
        this.value = value;
    }


    public boolean beats(GameObjects things) {
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


