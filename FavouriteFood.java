public class FavouriteFood{
    public static void main(String[] args){
        System.out.println("What is your name?");
        String name = System.console().readLine();
        System.out.println(name + ", what is your favourite food?");
        String food = System.console().readLine();
        System.out.println(name + ", your favourite food is " + food);

    }
}