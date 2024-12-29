package chapter2.replace_magic_numbers_with_constants.problem;

public class CruiseControl {

    private double targetSpeedKmh;

    void setPreset(int speedPreset) {
        if (speedPreset == 2) {
            setTargetSpeedKmh(16944);
        } else if (speedPreset == 1) {
            setTargetSpeedKmh(7667);
        } else if (speedPreset == 0) {
            setTargetSpeedKmh(0);
        }
    }

    private void setTargetSpeedKmh(double speed) {
        targetSpeedKmh = speed;
    }
}
