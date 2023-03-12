class Fish extends Animal{
    public Fish(String name, boolean hasHair, int numberLegs, boolean swimable) {
        this.name = name;
        this.hasHair = hasHair;
        this.numberLegs = numberLegs;
        this.swimable = swimable;
    }
    public void locomote() {
        System.out.println("I swim");
    }

}
