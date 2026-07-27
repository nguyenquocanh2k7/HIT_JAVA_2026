import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap chieu dai: ");
//        double width = sc.nextDouble();
//        System.out.println("nhap chieu rong: ");
//        double length = sc.nextDouble();
//        double area = width * length;
//        double perimeter = 2 * (width + length);
//        System.out.println("Chu vi la : " + perimeter);
//        System.out.println("Dien tich la: " + area);
////Kiểm tra năm nhuận.
//        System.out.println("nhap nam nay : ");
//        int year = sc.nextInt();
//        if (year%4==0 && year%400==0)
//            System.out.println("nam nay la nam nhuan");
//        else
//            System.out.println("nam nay k nhuan");
////Nhập n, tính n! và tổng số chẵn từ 1 đến n.
//        System.out.println("nhap n: ");
//        int n = sc.nextInt();
//        double tich=1,tongchan=0;
//        for (int i=1;i<=n;i++)
//        {
//            tich*=i;
//            if (i%2==0)
//            {
//                tongchan+=i;
//            }
//        }
//        System.out.println("vay n! = " + tich);
//        System.out.println("tong cac so chan tu 1 den n la : " + tongchan);
//        //In bảng cửu chương và duyệt mảng với for each.
//        int[] cuuchuong= {0,1,2,3,4,5,6,7,8,9};
//        System.out.println("bang cuu chuong ");
//        for (int i:cuuchuong)
//        {
//            System.out.println("bang nhan " + i + " :");
//            for (int j=0;j<=9;j++)
//            {
//                System.out.println(i*j);
//            }
//        }
        //Đảo ngược số nguyên và kiểm tra số đối xứng.
        System.out.print("nhap so : ");
        String so = sc.nextLine();
        System.out.println("so sau khi dao la : ");
        String sosau = "";
        for (int i=so.length();i>=0;i++)
        {
            sosau+=so.charAt(i);
        }
        System.out.println("so luc sau la : " + sosau);



        //In tam giác dấu sao
        System.out.printf("nhap so hang cua tam giac : ");
        int rows= sc.nextInt();
        for (int i=1;i<=rows;i++)
        {
            for (int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
            for (int l=1;l<=i*2-1;l++)
                System.out.print("*");

        }

    }
}