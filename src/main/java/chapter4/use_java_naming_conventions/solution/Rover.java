package chapter4.use_java_naming_conventions.solution;

public class Rover {
    static final double WALKING_SPEED = 3;

    final String serialNumber;
    double milesPerHour;

    Rover(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    void Drive() {
        milesPerHour = WALKING_SPEED;
    }

    void Stop() {
        milesPerHour = 0;
    }
}
