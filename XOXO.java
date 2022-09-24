import java.util.*;
public class XOXO {
	/**
	 | |
	-+-+-
	 | |
	-+-+-
	 | |
	*/
	public static void main(String[]args){
	char[][] board = {{' ', '|', ' ', '|', ' '},
			  {'-', '+', '-', '+', '-'},  
			  {' ', '|', ' ', '|', ' '},
			  {'-', '+', '-', '+', '-'},
			  {' ', '|', ' ', '|', ' '}};
	printBoard(board);
	Xplacement(board);
	}//main
	
	public static void Xplacement(char[][] board){
	Scanner input = new Scanner(System.in);	//Creating a new scanner object
	System.out.print("Placement: ");	//takes in position number
	int placement = input.nextInt();
	
	switch(placement){	//takes placement, then case number = placement
		case 1:
			board[0][0] = 'X';
			break;
		case 2:
			board[0][2] = 'X';
			break;
		case 3:
			board[0][4] = 'X';
			break;
		case 4:
			board[2][0] = 'X';
			break;
		case 5:
			board[2][2] = 'X';
			break;
		case 6:
			board[2][4] = 'X';
			break;
		case 7:
			board[4][0] = 'X';
			break;
		case 8:
			board[4][2] = 'X';
			break;
		case 9:
			board[4][4] = 'X';
			break;
	}
	printBoard(board); 
	}//Xplacement
	
	
	
	public static void printBoard(char[][] board){
	for(char[] row:board){	//for each array in the board
		for(char character: row)
		{	//for loop that loops for each character in each row
			System.out.print(character);	//print out each character
		}
			System.out.println();	//prints a line after each row
			
	}
	}//printBoard	
	public static boolean O_wins(board)
    {
        if (board[0][0]= 'O' && board[0][1]= 'O' && board[0][2]='O' ){
            return true; // CHECK FIRST ROW LEFT TO RIGHT
        } 
       
        if (board[1][0]= 'O' && board [1][1]='O' && board[1][2] = 'O'){
            return true; // CHECK SECOND ROW LEFT TO RIGHT
        } 
        
        if (board[2][0] = 'O' && board [2][1] = 'O' && board[2][2]= 'O'){
            return true; // CHECK THIRD ROW LEFT TO RIGHT
        } 
        
        if (board[0][0] = 'O' && board [1][0] = 'O' && board[2][0] = 'O'){
            return true; // CHECK FIRST COLOUMN TOP TO BOTTOM
        } 
       
        if (board [0][2] = 'O' && board [1][2]= 'O' && board[2][2] = 'O'){
            return true; // CHECK SECOND COLOUMN TOP TO BOTTOM
        } 
        
        if (board[0][2] = 'O' && board [1][2]= 'O' && board[2][2]= 'O') {
            return true; // CHECK THIRD COLOUMN TOP TO BOTTOM
        } 
       
        if (board[0][0] = 'O' && board [1][1]= 'O' && board[2][2]= 'O' ){
            return true; // CHECK DIAGONAL FROM TOP LEFT TO BOTTOM RIGHT
        }

        if (board[0][2] = 'O' && board [1][1]= 'O' && board[2][0]= 'O' ){
            return true; // CHECK DIAGONAL FROM TOP RIGHT TO BOTTOM LEFT
        } 
        return false;
    } // end of O wins
} //End of XOXO class
