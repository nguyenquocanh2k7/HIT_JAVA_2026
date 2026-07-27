public class Calculate_Parameter_S_circle {
    private double r;
    private final double PI=3.14;
    public Calculate_Parameter_S_circle(double r)
    {
        this.r=r;
    }
    public void setR()
    {
        this.r=r;
    }
    public double getParameter(){
        return 2*PI*r;
    }
    public double getS(){
        return PI*r*r;
    }
}
