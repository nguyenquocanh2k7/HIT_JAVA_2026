import java.util.Random;

public class Sum_Random {
    private int a,b,c;
    public Sum_Random(){
        Random random = new Random();
        a =random.nextInt(0,100);
        b =random.nextInt(0,100);
        c =random.nextInt(0,200);
    }
    public void ShowQuestion(){
        System.out.println(a + " + " + b + "=" + c);
    }
    public boolean Check_Answer(String UserAnswer){
        boolean correct = (a+b==c);
        if (correct && UserAnswer.equals("phép tính đúng")){return true;}
        else if (!correct && UserAnswer.equals("phép tính sai")){return true;}
        else return false;
    }
}
