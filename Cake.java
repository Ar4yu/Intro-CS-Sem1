import java.util.ArrayList;

class Cake {
  // what instance variables does a cake have?
  private String name;
  private double cost;
  // how do we make a new cake?
public Cake(String name, double cost){
    this.name = name;
    this.cost = cost;
}
public double getCost(){
    return this.cost;
}
  // how do we represent a Cake as a string?

  public String toString(){
    String output = this.name +": " + this.cost;
    return output;
  }
  // how do we load Cakes?

  public static ArrayList<Cake> LoadCakes(String filename) {
    ArrayList<Cake> list = new ArrayList<Cake>();
    In reader = new In(filename);
    while(!reader.isEmpty()){
        String [] line = reader.readLine().split(",");
        Cake temp = new Cake(line[0], Double.parseDouble(line[1]));
        list.add(temp);
    }
    return list;
  }

  public static void SelectionSort(ArrayList<Cake> L) {
    ArrayList<Cake> list= new ArrayList<Cake>();
    Cake max = L.get(0);
    for(int i = 0; i < L.size(); i ++){
        int count = 0;
        for(int j = i; j < L.size(); j++){
            if(max.getCost()<L.get(j).getCost()){
                max = L.get(j);
                count++;
            }
        }
        L.remove(count);
        L.add(max);
    }
  }

  public static void main(String[] args) {

    ArrayList<Cake> cakes = LoadCakes("cakes.csv");

    SelectionSort(cakes);
    for (int i = 0; i < cakes.size(); i++) {
      System.out.println(cakes.get(i));
    }

  }
}