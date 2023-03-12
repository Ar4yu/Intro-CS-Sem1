//Aaryaman Jaising
//9/29/22
//Program to take an input of a word and to print it out in a form of a crossword
//12 minutes, thought of nested for loops to get the spaces in between. For reversing word, since the index starts with 0, used charAt(length - 1 - k) (instead of length-k)
public class Crossword {
    public static void main(String[] args){
        System.out.print("Enter a phrase: ");
        String word = System.console().readLine();
        System.out.println(word);
        int length = word.length();
        for(int i = 1; i < (length-1); i++){
            System.out.print(word.charAt(i));
            for(int j = 1; j < (length-1); j++){
                System.out.print(" ");
            }
            System.out.println(word.charAt(length-i-1));
        }
        for(int k = 0; k < length; k++){
            System.out.print(word.charAt(length-1-k));
        }
    }
    
}
