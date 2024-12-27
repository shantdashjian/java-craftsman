package chapter1.alwaysusebraces.problem;

public class User {

    Rank rank;
    public Rank getRank() {
        return rank;
    }

    public boolean isUnknown() {
        return rank == Rank.UNKNOWN;
    }

    public boolean isAstronaut() {
        return rank == Rank.ASTRONAUT;
    }

    public boolean isCommander() {
        return rank == Rank.COMMANDER;
    }
}
