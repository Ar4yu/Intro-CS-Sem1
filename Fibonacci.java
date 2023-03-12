//Aaryaman Jaising
//9/29/22
//Program to take commandline argument integer and to print that many numbers in the Fibonacci series
//15 minutes, figuring out whether to print number 1 or number 2 and then using a temporary variable numbertemp so that I could change number1 and then number2 using numbertemp which had the old value of number1 
public class Fibonacci {
    public static void main(String[] args){
        int limit = Integer.parseInt(args[0]);
        int number1 = 1;
        int number2 = 1;
        int numbertemp = 0;
        for(int i = 0; i < limit; i++){
            System.out.print(number1 + " ");
            numbertemp = number1;
            number1 = number2;
            number2 = numbertemp + number2;
        }
    }
}
