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
			  {' ', '|', ' ', '|', ' '},		  
			  {' ', '|', ' ', '|', ' '}};
	printBoard(board);
	placePiece(board);
	}//main
	
	public static void placePiece (int pos, int player, char [][] board){
		char piece;
        	if (player == 1){
            		piece = 'X'; // If human player(1), use X as piece
        	} else {
            		piece = 'O'; // if computer (2),use O as piece
        	} //If statement
	
	switch(placement){	//takes placement, then case number = placement
		case 1:
			board[0][0] = piece;
			break;
		case 2:
			board[0][1] = piece;
			break;
		case 3:
			board[0][2] = piece;
			break;
		case 4:
			board[1][0] = piece;
			break;
		case 5:
			board[1][1] = piece;
			break;
		case 6:
			board[1][2] = piece;
			break;
		case 7:
			board[2][0] = piece;
			break;
		case 8:
			board[2][1] = piece;
			break;
		case 9:
			board[2][2] = piece;
			break;
	}
	printBoard(board); 
	}//Xplacement
	
	
	
	public static void printBoard(char[][] board){
		
		 /**




      		Positions:
        	[0][0], [0][1], [0][2]
        	[1][0], [1][1], [1][2]
        	[2][0], [2][1], [2][2]

         	*/
	for(char[] row:board){	//for each array in the board
		for(char character: row)
		{	//for loop that loops for each character in each row
			System.out.print(character);	//print out each character
		}
			System.out.println();	//prints a line after each row
			
	}
	}//printBoard	
	
	public static boolean xWins(board){ 
	if(board[0][0] = 'X' && board[0][1] = 'X' && board[0][2] = 'X'){	//checks if there are three X in the first row going towards right
		return True;	//if true, X wins
	}else{
		return False;
	}
	if(board[1][0] = 'X' && board[1][1] = 'X' && board[1][2] = 'X'){	//checks if there are three X in the second row going towards the right
		return True;	//if true, X wins
	}else{
		return False;
	}			
	if(board[2][0] = 'X' && board[2][1] = 'X' && board[2][2] = 'X'){	//checks if there are three X in the third row going towards the right
		return True;	//if true, X wins
	}else{
		return False;
	}		
	if(board[0][0] = 'X' && board[1][0] = 'X' && board[2][0] = 'X'){	//checks if there are three X in the first coloumn going down
		return True;	//if true, X wins
	}else{
		return False;
	}			
	if(board[0][1] = 'X' && board[1][1] = 'X' && board[2][1] = 'X'){	//checks if there are three X in the second coloumn going down
		return True;	//if true, X wins
	}else{
		return False;
	}			
	if(board[0][2] = 'X' && board[1][2] = 'X' && board[2][2] = 'X'){	//checks if there are three X in the third coloumn going down
		return True;	//if true, X wins
	}else{
		return False;
	}	
	if(board[0][0] = 'X' && board[1][1] = 'X' && board[2][2] = 'X'){	//checks if there are three X diagonally starting from the top left corner to the bottom right corner
		return True;	//if true, X wins
	}else{
		return False;
	}			
	if(board[0][2] = 'X' && board[1][1] = 'X' && board[2][0] = 'X'){	//checks if there are three X diagonally starting from the top right corner to the bottom left corner
		return True;	//if true, X wins
	}else{
		return False;
	}
	}//X winning conditions
	
	public static boolean oWins(board)
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
