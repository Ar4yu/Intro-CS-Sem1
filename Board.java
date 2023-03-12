
//Aaryaman Jaising
//10/24/22
//Program to generate board and display board for minesweeper
// Time 1 and a half hour. Bugs: The logic I was using to generate the board was not working for the first and last rows and columns to count the number of bombs around it, there would be a runtime error because of the array limit being exceeded. So to fix that I made the board 2 columns and 2 rows larger, assigned positions with bombs and then counted the bombs in all rows and columns besides the first and last rows and columns to which I assigned 0. Then using a loop I extracted the board from the larger board.
public class Board {
    public static void display(int[][] board) {
        // todo: display board to console
        int rows = board.length;
        int cols = board[0].length;
        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<cols; j++) {
                if(board[i][j]==-1){
                    System.out.print("X ");
                }
                else{
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static int[][] generate(int rows, int cols, double prob) {
        // todo: generate board with dimensions rows x cols
        // todo: fill board with prob chance of containing a bomb
        rows=rows+2;
        cols=cols+2;
        int[][] board = new int[rows][cols];
        for(int i = 1; i < rows; i++){
            for(int j = 1; j < cols; j++){
                double a = Math.random();
                if(a < prob){
                    board [i][j] = -1;
                }
                else{
                    board [i][j] = 0;
                }
            }
        }
        for(int i = 0; i < rows; i++){
            board[i][0] = 0;
        }
        for(int i = 0; i < rows; i++){
            board[i][cols-1] = 0;
        }
        for(int i = 0; i < rows; i++){
            board[0][i] = 0;
        }
        for(int i = 0; i < rows; i++){
            board[rows-1][i] = 0;
        }
        
        for(int i = 1; i < rows-1; i++){
            for(int j = 1; j < cols-1; j++){
                int counter = 0;
                if(board[i][j] == 0){
                    for(int a =i-1; a < i+2; a++){
                        for(int b = j - 1; b < j + 2; b++){
                            if( board [a][b] == -1){
                                counter++;
                            }
                        }
                    }
                    board[i][j] = counter;
                }
                
            }
        }
        int[][] board1 = new int[rows-2][cols-2];
        for(int i = 1; i < rows-1; i++){
            for(int j = 1; j < cols-1; j++){
                board1[i-1][j-1] = board[i][j];
            }}
        return board1;
    }
    
    public static void main(String[] args) {
        // call generate and display
        int rows =  Integer.parseInt(args[0]);
        int cols = Integer.parseInt(args[1]);
        double prob = Double.parseDouble(args[2]);
        int[][] board = generate(rows, cols, prob);
        display(board);
        
    }
}

