//Aaryaman Jaising
//12/6/22
//Time 1.5 hours: A major Bug was that I didn't realise that arraylist.remove moves back all the objects in the list after the one you removed, so you have to decrease the value you are iterating through by 1 if you use arraylist.remove
import java.util.ArrayList;
import java.util.HashMap;
public class WordCounts {
  public static void main(String[] args) {
    
    if (args.length < 2) {
      System.out.println("Usage: java-introcs WordCounts <filename> <NumWords> [<IgnoreWords>]");
      System.exit(0);
    }
    
    int N = Integer.parseInt(args[1]);
    
    String ignorefile = "";
    if (args.length == 3) {
      ignorefile = args[2];
    }
    
    In reader = new In(args[0]);
    HashMap<String, Word> map = new HashMap<String, Word>();
    while(!reader.isEmpty()){
      String word = reader.readString().toLowerCase();
      if(!map.containsKey(word)){
        Word temp = new Word(word);
        temp.incrementCount();
        map.put(word, temp);
      }
      else{
        map.get(word).incrementCount();
      }
    }
    System.out.println("The number of unique words is: " + map.size());
    
    //Assigning to array list
    ArrayList <Word> list = new ArrayList<Word>();
    for(String key : map.keySet()){
      list.add(map.get(key));
    }
    
    //removing words less than N
    
    for(int i = 0; i < list.size(); i++){
      Word temp = list.get(i);
      if(temp.getCount() <= N){
        list.remove(i);
        i--;
      }
    }
    
    //If ignore words is not null
    if(ignorefile.compareTo("") != 0){
      In ignorewords = new In(ignorefile);
      while(!ignorewords.isEmpty()){
        String iword = ignorewords.readString().toLowerCase();
        for(int i = 0; i < list.size(); i++){
          if(list.get(i).getWord().compareTo(iword)==0){
            list.remove(i);
            i--;
          }
        }
      }
    }
    
    
    System.out.println("The number of words with counts greater than " + N + ": " + list.size());
    //Display and sorting
    while(!list.isEmpty()){
      Word max = list.get(0);
      int counter = 0;
      for(int i = 0; i < list.size(); i++){
        if(max.getCount()<list.get(i).getCount()){
          max = list.get(i);
          counter = i;
        }
      }
      System.out.println(max);
      list.remove(counter);          
    }
    
    
    
    // your work here
    // Only load the ignorefile if the filename is not empty
  }
}
