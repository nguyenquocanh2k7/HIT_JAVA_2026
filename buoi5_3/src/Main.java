import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("cong(int, int): " + calc.cong(3, 5));
        System.out.println("cong(double, double): " + calc.cong(2.5, 4.7));
        System.out.println("cong(int, int, int): " + calc.cong(1, 2, 3));

        List<Integer> ds = new ArrayList<>();
        ds.add(1);
        ds.add(2);
        ds.add(3);
        ds.add(4);
        ds.add(5);
        System.out.println("tinhTong(List<Integer>): " + calc.tinhTong(ds));
    }
}