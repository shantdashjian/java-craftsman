package chapter1.always_use_braces.solution;

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
