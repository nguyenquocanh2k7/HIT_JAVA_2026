import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Sinhvien> datasv = new ArrayList<>();
        Sinhvien s1 = new Sinhvien("20251","Anh",9.8,8.9,10);
        Sinhvien s2 = new Sinhvien("20252","Em",7.9,8.4,9.2);
        Sinhvien s3 = new Sinhvien("20253","Ba",7.1,9.4,9.9);
        datasv.add(s1);
        datasv.add(s2);
        datasv.add(s3);
    for (Sinhvien sv : datasv){
        sv.print();
        sv.inTB();
        }
    Sinhvien svMax = datasv.get(0);
    for (Sinhvien sv : datasv)
        if (svMax.diemTB()<sv.diemTB())
        {
            sv=svMax;
        }
        System.out.println("vay sinh vien co diem TB max la : "+ svMax.getTen());

    }
}