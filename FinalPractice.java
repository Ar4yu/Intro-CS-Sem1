public class FinalPractice {

    public static boolean phoneNumber(String number) {
        if(number.length()!=12){
            return false;
        }
        for(int i = 0; i < number.length(); i++){
            if((number.charAt(i)>'9' || number.charAt(i) < '0') && number.charAt(i) != '-'){
                return false;
            }
        }
        if(number.charAt(3) != '-' || number.charAt(7) != '-'){
            return false;
        }
        return true;
    }
    public static void main(String [] args ) {
        System.out.println(100+100.0);
        if(phoneNumber(args [0]) == true){
            System.out.println("That is a phone number!");
        }
        else{
            System.out.println("That is not a phone number");
        }
    }
}
