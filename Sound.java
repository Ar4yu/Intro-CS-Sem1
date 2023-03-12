//Aaryaman Jaising
//11/1/22
//Program to make constructor for variable sound with methods for accessors and method to play using stdaudio
//Time 30 minutes, Bugs: had some trouble getting the wav file in the same directory

class Sound{
    private String Name;
    private double Duration;
    private String Filename;
    //Constructor
    public Sound(String Name, double Duration, String Filename){
        this.Name = Name;
        this.Duration = Duration;
        this.Filename = Filename;
    }
    //accessors
    public String getName(){
        return this.Name;
    }
    public double getDuration(){
        return this.Duration;
    }
    public String getFilename(){
        return this.Filename;
    }
    //play the WAV file
    public void play(){
        StdAudio.play(Filename);
    }
    public static void main(String[] args) {
        Sound sound = new Sound("cricket", 0.5, "wav/337435__ev-dawg__cricket.wav");
        System.out.printf("Sound: %s (%.2fs)\n", sound.getName(), sound.getDuration());
        sound.play();
    }
}