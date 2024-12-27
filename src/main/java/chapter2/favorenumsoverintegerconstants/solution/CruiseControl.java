package chapter2.favorenumsoverintegerconstants.solution;

import java.util.Objects;

public class CruiseControl {

    private double targetSpeedKmh;

    void setPreset(SpeedPreset speedPreset) {
        Objects.requireNonNull(speedPreset);

        setTargetSpeedKmh(speedPreset.speedKmh);
    }

    private void setTargetSpeedKmh(double speed) {
        targetSpeedKmh = speed;
    }
}

enum SpeedPreset {
    STOP(0), PLANETARY_SPEED(7667), CRUISE_SPEED(16944);

    final double speedKmh;

    SpeedPreset(double speedKmh) {
        this.speedKmh = speedKmh;
    }
}
