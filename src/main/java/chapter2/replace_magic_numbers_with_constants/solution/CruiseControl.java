package chapter2.replace_magic_numbers_with_constants.solution;

public class CruiseControl {

    public static final int CRUISE_SPEED_PRESET = 2;
    public static final int PLANETARY_SPEED_PRESET = 1;
    public static final int STOP_PRESET = 0;

    public static final int CRUISE_SPEED_KMH = 16944;
    public static final int PLANETARY_SPEED_KMH = 7667;
    public static final int STOP_SPEED_KMH = 0;

    private double targetSpeedKmh;

    void setPreset(int speedPreset) {
        if (speedPreset == CRUISE_SPEED_PRESET) {
            setTargetSpeedKmh(CRUISE_SPEED_KMH);
        } else if (speedPreset == PLANETARY_SPEED_PRESET) {
            setTargetSpeedKmh(PLANETARY_SPEED_KMH);
        } else if (speedPreset == STOP_PRESET) {
            setTargetSpeedKmh(STOP_SPEED_KMH);
        }
    }

    private void setTargetSpeedKmh(double speed) {
        targetSpeedKmh = speed;
    }
}
