//Aaryaman Jaising
//10/25/22
//Program to simulate two dice being thrown
public class Dice {
    public static int rollDice(){
       int die1= (int)Math.round( Math.random()*5 +1);
       int die2= (int)Math.round( Math.random()*5 +1);
       return (die1+die2);
    }
    public static void main(String[] args){
        for(int i = 0; i < 3; i++){
            System.out.println("Roll dice: " + rollDice());
        }
    }
}
