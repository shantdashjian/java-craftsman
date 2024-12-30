package chapter4.avoid_meaningless_terms.problem;

public class MainSpaceShipManager {
    AbstractRocketPropulsionEngine abstractRocketPropulsionEngine;
    INavigationController navigationController;
    boolean turboEnabledFlag;

    void navigateSpaceShipTo(PlanetInfo planetInfo) {
        RouteData data = navigationController.calculateRouteData(planetInfo);
        LogHelper.logRouteData(data);
        abstractRocketPropulsionEngine.invokeTask(data, turboEnabledFlag);
    }
}
