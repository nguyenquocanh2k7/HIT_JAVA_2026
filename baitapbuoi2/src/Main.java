import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn chương trình muốn chạy:");
        System.out.println("1. Kiểm tra tam giác");
        System.out.println("2. Tính khoảng cách giữa hai điểm");
        System.out.println("3. Kiểm tra mật khâu có hợp lệ không?");
        System.out.println("4. PHÂN TÍCH & CHUẨN HÓA THÔNG TIN NHÂN VIÊN  ");
        int choice = sc.nextInt();

        if (choice == 1) {
            KiemTraTamGiac.main();
        } else if (choice == 2) {
            TinhKhoangCach.main();
        } else if (choice == 3) {
            CheckPasswordAvailable.main();
        } else if (choice == 4)
            Analyst_And_Correctly_Information.main();
        else {
            System.out.println("Lựa chọn không hợp lệ!");
        }
        sc.close();
    }
}
class KiemTraTamGiac {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Tam giác hợp lệ.");
            if (a == b && b == c) {
                System.out.println("Tam giác đều.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tam giác cân.");
            } else {
                System.out.println("Tam giác thường.");
            }
            double p = (a + b + c) / 2;
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("Chu vi: %.2f", (a + b + c));
            System.out.printf("Diện tích: %.2f", S);
        } else {
            System.out.println("Không tạo thành tam giác hợp lệ.");
        }
    }
}

class TinhKhoangCach {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tọa độ xA: ");
        double xA = sc.nextDouble();
        System.out.print("Nhập tọa độ yA: ");
        double yA = sc.nextDouble();
        System.out.print("Nhập tọa độ xB: ");
        double xB = sc.nextDouble();
        System.out.print("Nhập tọa độ yB: ");
        double yB = sc.nextDouble();

        double d = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
        System.out.printf("Khoảng cách giữa A và B là: %.2f", d);
    }
}
class CheckPasswordAvailable {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("moi nhap mat khau");
        String password = sc.nextLine();
        password.trim();
        boolean ktra = true;
        if (password.length() < 8) {
            System.out.println("mat khau k hop le");
            ktra = false;
        }
        boolean coSo = false;
        boolean coChuHoa = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            {
                if (c >= '0' && c <= 9) {
                    coSo = true;
                }
            }
            if (c >= 'A' && c <= 'Z' ) {
                coChuHoa = true;
            }
        }
            if (!coSo) {
                System.out.println("- Mật khẩu phải chứa ít nhất 1 chữ số (0-9).");
                ktra = false;
            }
            if (!coChuHoa) {
                System.out.println("- Mật khẩu phải chứa ít nhất 1 chữ cái viết hoa (A-Z).");
                ktra = false;
            }

            if (ktra) {
                System.out.println("✅ Mật khẩu hợp lệ!");
            } else {
                System.out.println("❌ Mật khẩu chưa đạt yêu cầu.");
            }
            sc.close();
    }
}
class Analyst_And_Correctly_Information{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập thông tin nhân viên: ");
        String input_information = sc.nextLine();
        String[] Split = input_information.trim().split("-");


        if (input_information.length() < 4) {
            System.out.println("Khong hop le vi sai dinh dang!");
            return;
        }


        String passcode = Split[0].trim();
        String name = Split[1].trim();
        String birth_year = Split[2].trim();
        String department = Split[3].trim();

        String[] words = name.split("\\s+");
        String after_adjust = "";
        for (String w : words) {
            String word = w.substring(0, 1).toUpperCase();
            String remaining_word = w.substring(1).toLowerCase();
            after_adjust += word + remaining_word + " ";
        }

        String formattedName = after_adjust.trim();
        System.out.println("Tên sau khi chuẩn hóa là : " + after_adjust.trim());
        if (department.toLowerCase().contains("kỹ thuật") || department.toLowerCase().contains("ky thuat"))
            System.out.println("Phân loại: Nhân viên kỹ thuật");
        else
            System.out.println("Phân loại: Nhân viên nghiệp vụ");
        int birthyear = Integer.parseInt(birth_year);
        int age = 2026 - birthyear;
        System.out.println("Mã nhân viên: " + passcode +
                " | Họ và tên: " + formattedName +
                " | Tuổi: " + age +
                " | Bộ phận: " + department);

        sc.close();
    }
}
