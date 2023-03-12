//Aaryaman Jaising
//11/7/22
//Program to make subclass cat under pet
//Time 30 minutes; Bugs made 4 parameters including inside cat as one, then changed it in accordance with Assignment09driver
public class Cat extends Pet{
    private boolean isInsideCat;
    /*Constructor for cat */
    public Cat(String pname, String oname, double wt) {
        super(pname, oname, wt);
        this.isInsideCat = true;
    }
    /*makes an inside cat an outside cat */
    public void goOutside(){
        this.isInsideCat = false;
    }
    /*Overriding visit method to include 40 dollar base cost and extra shot if it is not an inside cat */
    @Override
    public double visit(int shots) {
        if(!isInsideCat){
            shots++;
        }
        double visitcost = 40.0 + 85.0 + 30.0*shots;
        visits++;
        totalcost += visitcost;
        return visitcost;
    }
    //Main function to test methods
    
    public static void main(String[] args){
        Cat cat1 = new Cat("Lil Dan", "Daniel", 7.5);
        cat1.goOutside();
        System.out.println(cat1.toString());
    }
}
