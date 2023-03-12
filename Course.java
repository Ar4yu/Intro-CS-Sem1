//Aaryaman Jaising
//10/25/22

public class Course {
   static String name;
   static double coursenum;
   static int numstudents;
   static String instructor;

   public Course(){
    String name = "Calculus III";
   double coursenum = 5.5;
   int numstudents = 24;
   String instructor = "Smith";
   } 
   public Course( String name,double coursenum,int numstudents,String instructor ){
    this.name = name;
   this.coursenum = coursenum;
   this.numstudents = numstudents;
   this.instructor = instructor;
   }
   public String getname(){
    return name;
   }
   public double getcoursenum(){
    return coursenum;
   }
   public int getnumstudents(){
    return numstudents;
   }
   public String getinstructor(){
    return instructor;
   }
   public void setname( String newname){

   }
   public static void main(String[] args){
    Course Course1 = new Course();
    Course1 = new Course("Calculus III",5.5,24, "Smith");
    System.out.println("The course is " + name + "number of students " + numstudents + " Course num " + coursenum + " Instructor " + instructor);
   }
}
