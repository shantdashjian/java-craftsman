package chapter1.ensure_code_symmetry.problem;

import chapter1.ensure_code_symmetry.solution.CruiseControl;
import chapter1.ensure_code_symmetry.solution.User;

import java.util.Objects;

public class BoardComputer {

    CruiseControl cruiseControl;

    void authorize(User user) {
        Objects.requireNonNull(user);
        if (user.isUnknown()) {
            cruiseControl.logUnauthorizedAccessAttempt();
        } else if (user.isAstronaut()) {
            cruiseControl.grantAccess(user);
        } else if (user.isCommander()) {
            cruiseControl.grantAccess(user);
            cruiseControl.grantAdminAccess(user);
        }
    }
}
