//Aaryaman Jaising
//10/25/22
//Program to calculate GCD of two numbers using command line arguments
public class GCD {
    public static int gdc(int a, int b){
        int gcd = 1;
        int max= 0;
        if(a>b){
            max = b;
        }
        else{
            max = a;
        }
        for(int i = 1; i <= max; i++){
            if(a%i==0&&b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(("The GCD of " + a + " and "+ b + " is " + gdc(a, b)));
    }
}
