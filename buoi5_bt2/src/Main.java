import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Sau đó tạo 3 sản phẩm khác nhau, tính tổng
//        giá trị hàng hóa và in ra số lượng sản phẩm đã được thêm.
        List<SanPham> dataSp = new ArrayList<>();
        SanPham sp1 = new SanPham("Toy",1000,10000);
        SanPham sp2 = new SanPham("Teddy",30,50000);
        SanPham sp3 = new SanPham("Machine",10,1500000);
        dataSp.add(sp1);
        dataSp.add(sp2);
        dataSp.add(sp3);
        System.out.println("THONG TIN SAN PHAM : ");
        double tongGiaTri=0;
        for (SanPham sp: dataSp)
        {
            System.out.println(sp.getName()+" , SO TIEN "+sp.getGia()+" ,SO LUONG "+sp.getSoLuong());
            tongGiaTri += sp.tinhTien();
        }
        System.out.println("Tổng giá trị hàng hóa: " + tongGiaTri);
        System.out.println("So luong sp dc them la : " + SanPham.getBienDem());
    }
}