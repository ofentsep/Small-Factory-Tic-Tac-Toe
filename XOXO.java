public class XOXO {

    public static void gameboard(){ //@Sipho

    char[][] board = {{' ', '|', ' ', '|', ' '},
                      {'_', ' ', '_', ' ', '_'}, 
                      {' ', '|', ' ', '|', ' '}, 
                      {'_', ' ', '_', ' ', '_'}, 
                      {' ', '|', ' ', '|', ' '}};
                        
	for(char[] row:board){//for each array in the board
		for(char character: row){//for loop that loops for each character in each row
			System.out.print(character);	//print out each character
	        }
		    System.out.println();//prints a line after each row
		}//end of loop
    
	}//gameBoard

    public static boolean moveValidation (int moveidxRow, int moveidxCol, char[][] board2D){ //@Prince
        char position = board2D[moveidxRow][moveidxCol];
        if(position == '_' || position == ' '){//If space on board is unoccupied
            return true;
            }
            return false;
		}//moveValidation	
		
}//XOXO class
