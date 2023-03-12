//Aaryaman Jaising
//11/23/22
// Class for holding restaurant information
//Constructor

import java.util.Arrays;

class Restaurant {
private String Name;
private String City;
private String State;
private double avgstars;
private int numreviews;
private String[] categories;
//Constructor
public Restaurant(String name, String city, String state, double avgstars, int numreviews, String [] categories ) {
    this.Name = name;
    this.City = city;
    this.State = state;
    this.avgstars = avgstars;
    this.numreviews = numreviews;
    this.categories = categories;
}
//Accessors
public String getName(){
    return this.Name;
}
public String getCity(){
    return this.City;
}
public String getState(){
    return this.State;
}
public double getAvgstars(){
    return this.avgstars;
}
public int getNumreviews(){
    return this.numreviews;
}
public String[] getCategories(){
return this.categories;
}
public String categoriestoString(){
    String[] catarray = this.categories;
    String s = "";
    for(int i =0; i<catarray.length - 1; i++){
        s += catarray [i] + ", ";
    } 
    s += catarray [catarray.length-1];
    return s;
}
//main to test methods
public static void main(String[] args){
    String[] categories1 = {"BBQ","Fondue"};
    Restaurant R1 = new Restaurant("Jimmy's", " Philladelphia", "Pennsylvania", 4.1, 514, categories1 );
    System.out.println("Name - " + R1.getName());
    System.out.println("City - " + R1.getCity());
    System.out.println("State - " + R1.getState());
    System.out.println("Average Stars - " + R1.getAvgstars());
    System.out.println(("Number of reviews - " + R1.getNumreviews()));
    System.out.println("Categories - " + R1.categoriestoString());

}
}