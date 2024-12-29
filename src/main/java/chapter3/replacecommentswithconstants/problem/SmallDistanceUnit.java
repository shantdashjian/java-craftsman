package chapter3.replacecommentswithconstants.problem;

public enum SmallDistanceUnit {

    CENTIMETER, INCH;

    double getConversationRate(SmallDistanceUnit unit) {
        if (this == unit) {
            return 1; // identity conversion rate
        }

        if (this == CENTIMETER && unit == INCH) {
            return 0.393701; // one centimeter in inch
        } else {
            return 2.54; // one inch in centimeters
        }
    }
}
