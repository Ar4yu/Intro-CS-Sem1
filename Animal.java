class Animal {

    protected boolean hasHair;
    protected int numberLegs;
    protected String name;
    protected boolean swimable; // can it swim or not

    // empty constructor
    public Animal() {
        this.hasHair = false;
        this.numberLegs = 0;
        this.name = "No named animal";
        this.swimable = true;
    }

    // implement accessors and getters
    public boolean gethasHair() {
        return this.hasHair;
    }
    public boolean getswimable(){
        return this.swimable;
    }
    public String getname(){
        return this.name;
    }
    public int getnumberlegs(){
        return this.numberLegs;
    }
    //Setters
    public void sethasHair(boolean hasHair){
        this.hasHair = hasHair;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setswimable(boolean swimable){
        this.swimable = swimable;
    }
    public void setnumberlegs(int numberLegs){
        this.numberLegs = numberLegs;
    }
    public void locomote() {
        System.out.println("I locomote");
    }
    public static void main(String[] args) {
        Animal emptyAnimal = new Animal();
        emptyAnimal.locomote();
    }
}