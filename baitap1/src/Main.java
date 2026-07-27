import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner n = new Scanner(System.in);
        int[] a = new int[10];
        int tong = 0;
        int hieu = 0;
        double thuong;
        double tich = 1;
        int i;
        for ( i = 0; i < n; i++) {
            tong += a[i];
        }

        for (i = 0; i < n; i++) {
            hieu -= a[i];
        }
        for ( i = 0; i < n; i++) {
            tich *= a[i];
        }
        if (a[n] != 0)
        {
            thuong=a[n]*1.0/a[0];
        }
    }
}