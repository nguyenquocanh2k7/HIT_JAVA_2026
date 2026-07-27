import java.sql.SQLOutput;
import java.util.Random;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap r");
        double r = sc.nextDouble();
        if (r>0 && r<1000)
        {
            Calculate_Parameter_S_circle calculateParameterSCircle = new Calculate_Parameter_S_circle(r);
            double S= calculateParameterSCircle.getS();
            double P= calculateParameterSCircle.getParameter();
            System.out.printf(" Vậy chu vi và diện tích là : %.3f %.3f ",P ,S );
        } else {
            System.out.println("Bán kính không hợp lệ");
        }



        System.out.println("nhap chuoi");
        String input = sc.nextLine();
        Check_OP checkOp= new Check_OP(input);
        if (checkOp.isOP())
            System.out.println(input.toUpperCase() + " chuỗi này đối xứng nè!");
        else {
            System.out.println(input.toLowerCase() + " chuỗi này k dxung");
        }


        Sum_Random quiz = new Sum_Random();
        quiz.ShowQuestion();
        System.out.println("Bạn nhập từ 'phép tính đúng' hoặc 'phép tính sai' ");
        String Answer = sc.nextLine();
        if (quiz.Check_Answer(Answer)) System.out.println("Bạn trả lời đúng");
        else System.out.println("Bạn trả lời sai");
        System.out.println("nhap 3 so nguyen phan biet A,B,C: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        Math_3 math3 = new Math_3(A,B,C);
        System.out.println("vay so trung vi la : " + math3.getMiddle());
        System.out.println("nhap so ptu : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("nhap ptu thu " + (i+1));
            arr[i]= sc.nextInt();
        }
        Mountain_points mountainPoints = new Mountain_points(arr);
        System.out.println(mountainPoints.countMountain());
    }
}