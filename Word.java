//Aaryaman Jaising
//12/6/22
//Time 15 minutes, added getword as an accessor to get the text because it was useful in WordCounts
public class Word {
    private String text;
    private int count;
    
    public Word(String text){
        this.text = text;
        this.count = 0;
    }
    public void incrementCount(){
        this.count++;
    }
    public String getWord(){
        return this.text;
    }
    public int getCount(){
        return this.count;
    }
    public void setCount(int c){
        this.count = c;
    }
    public String toString(){
        String s = this.text + ": " + this.count;
        return s;
    }
    public static void main(String[] args) {
        Word word = new Word("Test");
        System.out.println(word); // should print "Test: 0"
        
        word.incrementCount();
        System.out.println(word); // should print "Test: 1"
        
        word.setCount(10);
        System.out.println(word); // should print "Test: 10"
        System.out.println(word.getCount()); // should print "10"
        System.out.println(word.getWord());
    }
}
