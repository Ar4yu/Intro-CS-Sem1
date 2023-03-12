//Aaryaman Jaising
//10/25/22
//Program to create the game minesweeper using the board.java program methods and taking in command line arguments. Also reusing checkinput to validate the input, using banner to output welcome message. 
//Time 1 and half hour. Bugs, I found it really useful to make the second board a string type just for output and displaying, and the board with an int to keep referencing to check if it has bombs or which integer is there. Also the checkwin function I was not sure so I thought I could just equate the number of points selected in the output board which are not bombs to the number of blocks that are not bombs in the reference board.
public class Minesweeper {
    public static void display(String[][] BoardOut){
        int rows = BoardOut.length;
        int cols = BoardOut[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(BoardOut[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void banner(String[] args){
        String input = args[0];
        String decorator = args[1];
        int a = input.length();
        for(int i = 0; i < (a+4); i++){
            System.out.print(decorator);
        }
        System.out.println("");
        System.out.println(decorator+" "+ input + " " + decorator);
        for(int i = 0; i < (a+4); i++){
            System.out.print(decorator);
        }
        System.out.println("");
    }
    public static boolean CheckWin(int[][] board, String[][] BoardOut){
        int rows = board.length;
        int cols = board[0].length;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(CheckInput.IsInteger(BoardOut[i][j])){
                    if(Integer.parseInt(BoardOut[i][j])>=0){
                        count1++;
                    }
                }
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(board[i][j]>=0){
                    count2++;
                }
            }
        }
        if(count1==count2){
            return true;
        }
        else{
            return false;
        }
    }
    public static int validateinput(String a, int b){
        System.out.println("Enter a " + a + " :" );
        String choice = System.console().readLine();
        int counter = 0;
        while(counter == 0){
            if(CheckInput.IsInteger(choice)==false){
                System.out.println("Please enter a positive integer from [0," + b +")");
                System.out.println("Enter a " + a + " :" );
                choice = (System.console().readLine());
            }
            if(CheckInput.IsInteger(choice)==true){
                if(Integer.parseInt(choice) <0){
                    System.out.println(("Please enter a positive integer from [0," + b +")"));
                    System.out.println("Enter a " + a + " :" );
                    choice = (System.console().readLine());
                }
                else if(Integer.parseInt(choice) >= b){
                    System.out.println(("Please enter a positive integer from [0," + b +")"));
                    System.out.println("Enter a " + a + " :" );
                    choice = (System.console().readLine());
                }
                if(CheckInput.IsInteger(choice) == true && Integer.parseInt(choice) >= 0 && Integer.parseInt(choice) < b)
                {counter++;}    }
            }
            return Integer.parseInt(choice);
        }
        public static void main(String[] args){
            int rows =  Integer.parseInt(args[0]);
            int cols = Integer.parseInt(args[1]);
            double prob = Double.parseDouble(args[2]);
            int[][] board = Board.generate(rows, cols, prob);
            String[][] BoardOut = new String[rows][cols];
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    BoardOut[i][j] = ".";
                }
            }
            String[] out1 = {"Welcome to Minesweeper!","*"};
            banner(out1);
            String[] out2 = {"Good Luck! :)","*"};
            banner(out2);
            display(BoardOut);
            int countover = 0;
            while(countover == 0){
                int i = validateinput("row",rows);
                int j = validateinput("column", cols);
                if (board[i][j] == -1) {
                    BoardOut[i][j] = "X";
                }
                else {
                    BoardOut[i][j] = Integer.toString(board[i][j]);
                    display(BoardOut);
                    
                }
                if (board[i][j] == -1) {
                    countover++;
                }
                if (CheckWin(board,BoardOut)) {
                    countover++;
                }
            }
            
            if(CheckWin(board,BoardOut)){
                String[] outwin = {"Congragulations!!! You Win <3", "#"}; 
                banner(outwin);
            }
            else{
                String[] outlose = {"Oh no! You hit a bomb!", "?"};
                banner(outlose);
            }
            String[] over = {"Game over","-"};
            banner(over);
            Board.display(board);
        } 
    }
    