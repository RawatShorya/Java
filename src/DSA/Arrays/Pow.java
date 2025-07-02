package DSA.Arrays;

public class Pow {
    public static void main(String[] args){
        myPow(2.00000, 10);
    }
    public static double myPow(double x, int n) {
        double result = 1.00000;
        int pow = 0;
        if (n<0){
            pow = n * -1;
        }
        for(int i =1; i<=pow; i++){
            result = result * x;
        }
        if(pow != 0){
            result = 1/result;
        }
        return result;
    }
}
