//Aaryaman Jaising
//11/2/22
//Program to reuse menu function for user to select sound to play from soundlibrary
//Time:40 minutes, Bugs: Had to change old menu code because it would not work with quit, so TA suggested different while loop and I thought I could use recursion to get it to run again
public class SoundBoard {
    public static void menu(SoundLibrary library){
        library.list();
        System.out.println("");
        System.out.println("Enter Command: ");
        String choice = (System.console().readLine());
        if(choice.compareTo("quit")==0){
            System.exit(1);
        }
            while(!CheckInput.IsInteger(choice) || Integer.parseInt(choice) >= library.getNumSounds()|| (Integer.parseInt(choice) < 0)){
                System.out.println("Please enter a valid command");
                menu(library);
            }
            int i = Integer.parseInt(choice);
            library.playsoundlib(i);
            menu(library);
        
           
           
            
        }
    public static void main(String[] args) {
        SoundLibrary library = new SoundLibrary("sounds.txt");
        menu(library);
    }
    
}
