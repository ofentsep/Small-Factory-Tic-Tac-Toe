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
	
	public static void cpuMove ()
	{
        Random random = new Random();  // invokes new random class
        int cpumove = random.nextInt(9); // generates random number and stores it 
        System.out.println(cpumove); // displays random number
	}
    
    public static boolean X_wins(board){
	if(board[0][0] = 'X' && board[0][2] = 'X' && board[0][4] = 'X'){	//checks if there are three X in the first row going towards right
		return True	//if true, X wins
	}else{
		return False
	}
	
	if(board[2][0] = 'X' && board[2][2] = 'X' && board[2][4] = 'X'){	//checks if there are three X in the second row going towards the right
		return True	//if true, X wins
	}else{
		return False
	}
				
	if(board[4][0] = 'X' && board[4][2] = 'X' && board[4][4] = 'X'){	//checks if there are three X in the third row going towards the right
		return True	//if true, X wins
	}else{
		return False
	}
			
	if(board[0][0] = 'X' && board[2][0] = 'X' && board[4][0] = 'X'){	//checks if there are three X in the first coloumn going down
		return True	//if true, X wins
	}else{
		return False
	}
				
	if(board[0][2] = 'X' && board[2][2] = 'X' && board[4][2] = 'X'){	//checks if there are three X in the second coloumn going down
		return True	//if true, X wins
	}else{
		return False
			}
				
	if(board[0][4] = 'X' && board[2][4] = 'X' && board[4][4] = 'X'){	//checks if there are three X in the third coloumn going down
		return True	//if true, X wins
	}else{
		return False
			}
		
	if(board[0][0] = 'X' && board[2][2] = 'X' && board[4][4] = 'X'){	//checks if there are three X diagonally starting from the top left corner to the bottom right corner
		return True	//if true, X wins
	}else{
		return False
	}
		
	if(board[0][4] = 'X' && board[2][2] = 'X' && board[4][0] = 'X'){	//checks if there are three X diagonally starting from the top right corner to the bottom left corner
		return True	//if true, X wins
	}else{
		return False
			}
				
	}//X winning conditions
		
}//XOXO class
