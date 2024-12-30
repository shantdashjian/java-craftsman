package chapter4.use_java_naming_conventions.problem;

public class Rover {
    static final double WalkingSpeed = 3;

    final String SerialNumber;
    double MilesPerHour;

    Rover(String NewSerialNumber) {
        SerialNumber = NewSerialNumber;
    }

    void Drive() {
        MilesPerHour = WalkingSpeed;
    }
    void Stop() {
        MilesPerHour = 0;
    }
}
