public class XOXO {

    public static void gameboard(){ //@Sipho
	 /**

        gameBoard
        _|_|_
        _|_|_
         | |

        Positions:
        [0, 0], [0, 2], [0, 4]
        [1, 0], [1, 2], [1, 4]
        [2, 0], [2, 2], [2, 4]

         */

	char[][] board = {{'_', '|', '_', '|', '_'},
			 {'_', '|', '_', '|', '_'},  
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
	
	public static void cpuMove () { //@Wetsi
        Random random = new Random();  // invokes new random class
        int cpumove = random.nextInt(9); // generates random number and stores it 
        System.out.println(cpumove); // displays random number
	}
    
    	public static boolean X_wins(board){ //@Sipho
	if(board[0][0] = 'X' && board[0][2] = 'X' && board[0][4] = 'X'){	//checks if there are three X in the first row going towards right
		return True	//if true, X wins
	}else{
		return False
	}
	
	if(board[1][0] = 'X' && board[1][2] = 'X' && board[1][4] = 'X'){	//checks if there are three X in the second row going towards the right
		return True	//if true, X wins
	}else{
		return False
	}
				
	if(board[2][0] = 'X' && board[2][2] = 'X' && board[2][4] = 'X'){	//checks if there are three X in the third row going towards the right
		return True	//if true, X wins
	}else{
		return False
	}
			
	if(board[0][0] = 'X' && board[1][0] = 'X' && board[2][0] = 'X'){	//checks if there are three X in the first coloumn going down
		return True	//if true, X wins
	}else{
		return False
	}
				
	if(board[0][2] = 'X' && board[1][2] = 'X' && board[2][2] = 'X'){	//checks if there are three X in the second coloumn going down
		return True	//if true, X wins
	}else{
		return False
	}
				
	if(board[0][4] = 'X' && board[1][4] = 'X' && board[2][4] = 'X'){	//checks if there are three X in the third coloumn going down
		return True	//if true, X wins
	}else{
		return False
	}
		
	if(board[0][0] = 'X' && board[1][2] = 'X' && board[2][4] = 'X'){	//checks if there are three X diagonally starting from the top left corner to the bottom right corner
		return True	//if true, X wins
	}else{
		return False
	}
				
	if(board[0][4] = 'X' && board[1][2] = 'X' && board[2][0] = 'X'){	//checks if there are three X diagonally starting from the top right corner to the bottom left corner
		return True	//if true, X wins
	}else{
		return False
	}
				
	}//X winning conditions
	
public static void Place(String[] Grid, int position){ //@Thandolwethu.
	
	/**This method is for taking the user input and place the place X or O in that position.*/
		
	if(position >= 1 && position <= 9){ // Check whether the user input is between the 1 to 9.
			
		switch(position){
				
			case 1: Grid[0] = "X"; // Placing the user move at position 1 of the board.
					break;
				
				
			case 2: Grid[1] = "X"; //Placing the user move at position 2 of the board.
					break;
				
			case 3: Grid[2] = "X"; //Placing the user move at position 3 of the board.
					break;
				
			case 4: Grid[3] = "X"; //Placing the user move at position 4of the board.
					break;
				
			case 5: Grid[4] = "X"; //Placing the user move at position 5 of the board.
					break;
				
			case 6: Grid[5] = "X"; //Placing the user move at position 6 of the board.
					break;
				
			case 7: Grid[6] = "X"; //Placing the user move at position 7 of the board.
					break;
				
			case 8: Grid[7] = "X"; //Placing the user move at position 8 of the board.
					break;
				
			case 9: Grid[8] = "X"; //Placing the user move at position 9 of the board.
					break;
			}
		}
		else{
			System.out.println("The position entered is not valid nt this board game.");
			//break;
		}
	
public static void userInput(){ //@Thando
	
	Scanner in = new Scanner(System.in); // initialising the scanner class.
	
	System.out.print("Which position you want to play at? : ");
	
	int position = in.nextInt(); // Taking the user's input and assigning it to the variable position.
	
	Place(position); // call-site of the method to place the user's playing move.
}
		
}//XOXO class
