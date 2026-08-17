import java.util.List;

public class Calculator {
    public int cong(int a, int b) {
        return a + b;
    }

    public double cong(double a, double b) {
        return a + b;
    }

    public int cong(int a, int b, int c) {
        return a + b + c;
    }

    public int tinhTong(List<Integer> ds) {
        int tong = 0;
        for (int x : ds) {
            tong += x;
        }
        return tong;
    }
}
