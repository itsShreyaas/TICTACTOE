import java.util.Scanner;

class tictactoe{
    public static void main(String[] args) {
        char[][]board= new char[3][3];
        for(int row=0;row <board.length;row++){
            for(int col=0; col <board.length ;col++){
                board[row][col]=' ';
            }
        }
    
    char player ='X';
    boolean Gameover=false;
    Scanner sc=new Scanner(System.in);

    while(!Gameover){
        printBoard(board);
        System.out.print("Player"+ " "+ player+"  " +"enter: ");
        int row=sc.nextInt();
        int col=sc.nextInt();

        if(board[row][col]==' '){
            board[row][col]=player;
            Gameover=havewon(board,player);
            if(Gameover){
                System.out.println("Player"+" "+player+ " " +"HaveWon:  ");
            }else{
                if(player=='X'){
                  player= 'O';
                }else{
                    player='X';
                }
            }
        
        }else{
            System.out.println("Invalid Move.try again ");
        }
        if(isFull(board)) {
            System.out.println("Game is Tie");
            break;
        }
       
    }

}
private static boolean havewon(char[][] board, char player) {
    for(int row=0;row <board.length;row++){
        if(board[row][0] ==player && board[row][1] ==player && board[row][2] ==player){
            return true;
        }         
    }
    for(int col=0;col <board[0].length;col++){
        if(board[0][col]== player && board[1][col] ==player && board[2][col]  ==player){
           return true;

        }
    }
    if(board[0][0] ==player && board[1][1] ==player && board[2][2] ==player){
        return true;
    }
    if(board[0][2] == player && board[1][1] == player && board[2][0] ==player){
        return true;
    }
    return false;
}
public static void printBoard(char[][]board){
    for(int row=0;row <board.length;row++){
        for(int col=0; col <board.length ;col++){
            System.out.print(board[row][col]+ " | ");
        } 
    System.out.println("");
}
}
public static boolean isFull (char[][]board){
    for(int row =0; row <board.length ;row++){
        for(int col =0;col<board[row].length;col++){
            if(board[row][col]==' '){
                return false;
            }
        }
    }
    return true;



}
}