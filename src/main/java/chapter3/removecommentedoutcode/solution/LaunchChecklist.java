package chapter3.removecommentedoutcode.solution;

import java.util.Arrays;
import java.util.List;

public class LaunchChecklist {

    List<String> checks = Arrays.asList(
            "Cabin Leak",
            "Engine",
            "Hull",
            "OxygenTank"
    );

    Status prepareLaunch(Commander commander) {
        for (String check : checks) {
            boolean shouldAbortTakeoff = commander.isFailing(check);
            if (shouldAbortTakeoff) {
                return Status.ABORT_TAKE_OFF;
            }
        }
        return Status.READY_FOR_TAKE_OFF;
    }
}
