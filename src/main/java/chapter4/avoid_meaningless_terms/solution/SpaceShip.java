package chapter4.avoid_meaningless_terms.solution;

public class SpaceShip {
    Engine engine;
    Navigator navigator;
    boolean turboEnabled;

    void navigateTo(Planet destination) {
        Route route = navigator.calculateRouteTo(destination);
        Logger.log(route);
        engine.follow(route, turboEnabled);
    }
}
