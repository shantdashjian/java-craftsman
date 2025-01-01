package chapter5.fail_fast.problem;

public class CruiseControl {
    static final double SPEED_OF_LIGHT_KMH = 1079252850;
    static final double SPEED_LIMIT = SPEED_OF_LIGHT_KMH;

    private double targetSpeedKmh;

    void setTargetSpeedKmh(double speedKmh) {
        if (speedKmh < 0) {
            throw new IllegalArgumentException();
        } else if (speedKmh <= SPEED_LIMIT) {
            targetSpeedKmh = speedKmh;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
