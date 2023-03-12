// Ask a question to a user (What is your name)
// ask that person using their name how their dooing

public class AskName{
    public static void main(String[] args){
        System.out.println("What is your name?");
        String name = System.console().readLine();
        System.out.println("Hi" + name + ",how are you doing?");
    }
}