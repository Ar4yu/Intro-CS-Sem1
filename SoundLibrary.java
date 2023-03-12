//Aaryaman Jaising
//11/1/22
//Program to make a constructor for an array of sounds (soundlibrary), function to list the songs in the library, function to get number of sounds, function to play a sound.
// Time 1 hour, Bugs: Had some trouble reading in the values, then a problem was that I did not assign a length to the array of soundlibrary which cause a nullpoint error.
public class SoundLibrary {
    private Sound[] soundlib;
    public SoundLibrary(String filename){
        In reader = new In(filename);
        int numbersounds = reader.readInt();
        soundlib = new Sound [numbersounds];
        for(int i = 0; i < soundlib.length;i++) {
            String name = reader.readString();
            Double Duration = reader.readDouble();
            String File = reader.readString(); 
            soundlib[i] = new Sound(name, Duration, File);
            //System.out.println(name+" "+Duration+" "+File);
            ;
           
        }
        
    }

    public void list(){
        for(int i = 0; i < soundlib.length; i++){
            String name = soundlib[i].getName();
            double Duration = soundlib[i].getDuration();
            System.out.println(i+") " + name + " - " + Duration + "s");
        }
    }
    public int getNumSounds(){
        return this.soundlib.length;   
    }
    public void playsoundlib(int songNumber){
        this.soundlib[songNumber].play();
    }
    public static void main(String[] args) {
        SoundLibrary library = new SoundLibrary("sounds.txt");
        library.list();
        library.playsoundlib(1);
    }
}
