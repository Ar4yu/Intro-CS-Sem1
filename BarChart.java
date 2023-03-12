public class BarChart {
    public static void bar(int[] numbers){
        for ( int i = 0; i < numbers.length; i++){
            System.out.print(i + ": ");
            for(int j =0; j < numbers[i];j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        bar(nums);
    }
}
