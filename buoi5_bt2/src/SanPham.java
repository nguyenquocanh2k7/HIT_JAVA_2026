public class SanPham {
    private String name;
    private double gia;
    private int soLuong;
    private static int bienDem=0;

    public SanPham( String name,int soLuong, double gia) {
        this.soLuong = soLuong;
        this.name = name;
        this.gia = gia;
        bienDem++;
    }
    public void themSanPham(int soluongThem){
        this.soLuong += soluongThem;
    }

    public double tinhTien(){
        return gia*soLuong;
    }
    public void inThongTin(){
        System.out.println("Tên: " + name + ", Giá: " + gia + ", Số lượng: " + soLuong + ", Thành tiền: " + tinhTien());
    }

    public static int getBienDem() {
        return bienDem;
    }

    public static void setBienDem(int bienDem) {
        SanPham.bienDem = bienDem;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
