//Aaryaman Jaising
//11/7/22
//Time 20 minutes; Bugs size, used compare to instead of ==
public class Dog extends Pet {
    private String size;
    //Constructor for dog to include size
    public Dog(String pname, String oname, double wt, String size) {
        super(pname, oname, wt);
        this.size = size;
    }
    //override visit function and to adjust cost
    @Override
    public double visit(int shots) {
        double visitcost = 25.0 + 85.0 + 30.0*shots;
        if(this.size.compareToIgnoreCase("medium") == 0){
            visitcost += 5.5*shots;
        }
        else if(this.size.compareToIgnoreCase("large") == 0){
            visitcost += 12.75*shots;
        }
        visits++;
        totalcost += visitcost;
        return visitcost;
    }
    public static void main(String[] args){
        Dog dog1 = new Dog("Teddy", "Mr Bond", 110, "large");
        System.out.println(dog1.toString());
    }
    
}
