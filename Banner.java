//Aaryaman Jaising
//9/26/22
//Program to take input phrase and decorator and to print them in pattern to the console
// No bugs, relatively simple and mechanical program, like 10 minutes


public class Banner {
    public static void main(String[] args){
        System.out.println("Enter a phrase:");
        String input = System.console().readLine();
        System.out.println("Enter a decorator character:");
        String decorator = System.console().readLine();
        int a = input.length();
        for(int i = 0; i < (a+4); i++){
            System.out.print(decorator);
        }
        System.out.println("");
        System.out.println(decorator+" "+ input + " " + decorator);
        for(int i = 0; i < (a+4); i++){
            System.out.print(decorator);
        }
        
    }
    
}
