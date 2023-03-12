//Aaryaman Jaising
//9/26/22
//Program to take input size and print checkerboard to console
//15 minutes
public class Checkerboard {
    public static void main(String[] args){
        System.out.println("Enter a size:");
        int size = Integer.parseInt(System.console().readLine());
        for(int i=0;i<size;i++){
            for(int j = 0; j< size; j++){
                if((i+j)%2 == 0){
                    System.out.print("o");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
        
    } 
    
}
