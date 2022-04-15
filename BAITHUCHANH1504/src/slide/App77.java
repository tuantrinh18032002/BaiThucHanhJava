package slide;

public class config {
    public static final int SO_LUONG_HINH_TOI_THIEU = 0;
    public static final int SO_LUONG_HINH_TOI_DA = 5;

    public static final float PI = 3.14f;
    public static final float INCH_CM = 2.54f;
    public static final int DON_VI_CM = 1;
    public static final int DON_VI_INCH = 2;
    public static int donvi = DON_VI_CM;

    public static float ChuyenCentimetSangInch(float cm) {
        float inch = cm / INCH_CM;
        return inch;
    }

    public static float ChuyenInchSangCentimet(float inch) {
        float cm = inch * INCH_CM;
        return cm;
    }
}

