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
} //End of XOXO class
