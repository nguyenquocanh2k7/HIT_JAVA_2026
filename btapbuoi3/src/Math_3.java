import java.util.Scanner;

public class Math_3 {
    private int A,B,C;
    public Math_3(int A,int B, int C){
        this.A=A;
        this.B=B;
        this.C=C;
    }
    public int getMiddle(){
        return (A> B ? (A<C?  A : (B>C ? B : C))      :   (B<C ? B : (A>C ? A : C))   );
    }
}
