class City {
    private String name;
    private String country;
    private double x;
    private double y;
    
    public City(String name, String country, double x, double y){
        this.name = name;
        this.country = country;
        this.x = x;
        this.y = y;
    }
    public double distance(City other){
        double x1 = this.x-other.getX();
        double y1 = this.y - other.getY();
        double distance = Math.pow(x1,2) + Math.pow(y1, 2);
        double distanceroot = Math.pow(distance, 0.5);
        return distanceroot;
    }
    public String getName(){
        return this.name;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }

}
