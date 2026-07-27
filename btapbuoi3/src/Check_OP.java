public class Check_OP {
    private String tx;
    public Check_OP(String tx){
        this.tx= tx;
    }
    public boolean isOP(){
    int left = 0;
    int right = tx.length()-1;
    while (left<right){
        if (tx.charAt(left)!=tx.charAt(right))
        {
            return false;
        }
        left++;
        right--;
        }
        return true;
    }
}