//Aaryaman Jaising
//10/1/22
//Program to count the number of times a letter is repeated in a given text and to print it out in a histogram using the data
//Time 1 hour, some bugs were that I initially used StdIn.readChar directly without using a temp variable of char typ eto assign it too and then the value of all letters output 0. So I assigned StdIn.readChar to a temp variable char in the loop so that it would check for each alphabet.

public class LetterFrequency {
    public static void main(String[] args){
        
        char[] letter = new char[26];
        char firstletter = 'a';
        int [] count = new int[26];
        for(int i = 0; i<26; i++){
            letter[i] = (char) (firstletter + i);
        }
        while(!StdIn.isEmpty()){
            while (StdIn.hasNextChar()) {
                char temp = StdIn.readChar();
                for(int j = 0; j<26; j++){
                    if(letter[j] == temp){
                        count[j]++;
                    }
                }
            }
            
        }
        int max = 0;
        for(int l = 0; l < 26; l++){
            if(count[l]>max){
                max = count [l];
            }
        }
        double[] scale = new double [26];
        for(int l = 0; l < 26; l++){
            scale [l] = (double) count [l]/max;
        }
        for(int l = 0; l < 26; l++){
            System.out.printf(letter[l] + ": %.3f",scale[l]);
            System.out.println("");
        }
        StdDraw.setXscale(0, 26);
        for(int i = 0; i<26; i++){
            StdDraw.setPenColor(255*i/26, 50, 255*(26-i)/26);
            StdDraw.filledRectangle(i+0.5, 0.5*scale[i], 0.5, 0.5*scale[i]);
        }
    }    
}
