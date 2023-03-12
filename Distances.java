//Aaryaman Jaising
//12/12/22
//Distances display
import java.util.ArrayList;
public class Distances {
   public static void main(String[] args){
    In reader = new In("cities.csv");
    ArrayList <City> list = new ArrayList<City>();
    while(!reader.isEmpty()){
        String currLine = reader.readLine();
        String [] line = currLine.split(",");
        City temp = new City(line[0], line [1], Double.parseDouble(line[2]), Double.parseDouble(line[3]));
        list.add(temp);
    }
    //finding base as BrynMawr
    City base = new City(null, null, 0, 0);
    for(int i = 0; i < list.size(); i++){
        if(list.get(i).getName().compareTo("Bryn Mawr College") == 0){
            base = list.get(i);
        }
    }
    //Sorting the list
    for(int i = 0; i < list.size(); i++){
        for(int j = 0; j < list.size() -1; j++){
            if(list.get(j).distance(base) > list.get(j+1).distance(base)){
                City temp = list.get(j);
                list.set(j, list.get(j+1));
                list.set(j+1, temp);
            }
        }
    }
    System.out.printf("%-20s    %-10s %n","Name","Distance");
    for(int i = 0; i < list.size(); i++){
        double d = list.get(i).distance(base);
        String name = list.get(i).getName();
        System.out.printf("%-20s    %-10.1f %n",name,d);
    }
   } 
}
