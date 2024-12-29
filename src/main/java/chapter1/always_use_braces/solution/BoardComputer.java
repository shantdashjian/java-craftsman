package chapter1.always_use_braces.solution;

import java.util.Objects;

public class BoardComputer {

    CruiseControl cruiseControl;

    void authorize(User user) {
        Objects.requireNonNull(user);
        if (user.isUnknown()) {
            cruiseControl.logUnauthorizedAccessAttempt();
        }
        if (user.isAstronaut()) {
            cruiseControl.grantAccess(user);
        }
        if (user.isCommander()) {
            cruiseControl.grantAccess(user);
        }
        cruiseControl.grantAdminAccess(user); // SECURITY THREAT
    }
}
