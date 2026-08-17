public class Sinhvien {
    private String maSV;
    private String ten;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public Sinhvien() {
    }

    public Sinhvien(String maSV, String ten,double diemHoa, double diemLy, double diemToan) {
        this.diemHoa = diemHoa;
        this.diemLy = diemLy;
        this.diemToan = diemToan;
        this.maSV = maSV;
        this.ten = ten;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void print() {
        System.out.println(getTen()+ " " +getMaSV()+ " " + getDiemHoa() +" " +getDiemLy()+" "+getDiemToan()  );
    }
    public double diemTB(){
        return (diemHoa+diemLy+diemToan)/3;
    }
    public void inTB(){
        System.out.println(getTen()+" co diem tbinh la : "+ diemTB());
    }
}
