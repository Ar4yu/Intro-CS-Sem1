//Aaryaman Jaising
//10/24/22

public class Board2 {
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
        int[][] board = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                double a = Math.random();
                if(a < prob){
                    board [i][j] = -1;
                }
                else{
                    board [i][j] = 0;
                }
            }
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
        
        for(int j = 1; j < cols -1; j++){
            int counter =0;
            if(board[0][j] == 0){
                for(int a = 0; a < 2; a++){
                    for(int b = j - 1; b < j + 2; b++){
                        if( board [a][b] == -1){
                            counter++;
                        }
                    }
                }
                board[0][j] = counter;
            }
        }

        for(int j = 1; j < cols -1; j++){
            int counter =0;
            if(board[rows-1][j] == 0){
                for(int a = 0; a < 2; a++){
                    for(int b = j - 1; b < j + 2; b++){
                        if( board [a][b] == -1){
                            counter++;
                        }
                    }
                }
                board[rows -1][j] = counter;
            }
        }

        for(int j = 1; j < rows -1; j++){
            int counter =0;
            if(board[j][0] == 0){
                for(int a = j-1; a < j+2; a++){
                    for(int b = 0; b < 2; b++){
                        if( board [b][a] == -1){
                            counter++;
                        }
                    }
                }
                board[j][0] = counter;
            }
        }

        for(int j = 1; j < rows -1; j++){
            int counter =0;
            if(board[j][0] == 0){
                for(int a = j-1; a < j+2; a++){
                    for(int b = 0; b < 2; b++){
                        if( board [b][a] == -1){
                            counter++;
                        }
                    }
                }
                board[j][cols - 1] = counter;
            }
        }

        if(board[0][0]==0){
            int counter =0;
            for(int a = 0; a <2; a++){
                for( int b = 0; b< 2; b++){
                    if( board [a][b] == -1){
                        counter++;
                    }
                }
            }
            board[0][0] = counter;
        }

        if(board[0][rows-1]==0){
            int counter =0;
            for(int a = 0; a <2; a++){
                for( int b = cols-2; b< cols; b++){
                    if( board [a][b] == -1){
                        counter++;
                    }
                }
            }
            board[rows-1][0] = counter;
        }      
        
        if(board[0][0]==0){
            int counter =0;
            for(int a = rows-2; a <rows; a++){
                for( int b = 0; b< 2; b++){
                    if( board [a][b] == -1){
                        counter++;
                    }
                }
            }
            board[rows-1][0] = counter;
        }    
        
        if(board[rows-1][cols-1]==0){
            int counter =0;
            for(int a = rows-2; a <rows; a++){
                for( int b = cols-2; b< cols; b++){
                    if( board [a][b] == -1){
                        counter++;
                    }
                }
            }
            board[rows-1][cols-1] = counter;
        }    
        return board;
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