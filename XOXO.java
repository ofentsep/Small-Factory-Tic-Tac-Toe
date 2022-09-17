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
	
	public static void Place(String[] Grid, int position){ //Thandolwethu
		
	/** This method is for placing the player's input.*/
		
		if(position >= 1 && position <= 9){ //To check whether the user input is within  the range of the availalbe places to ply at.
			
			switch(position){
				
				case 1: Grid[0] = "X"; // 
						break;
				
				case 2: Grid[1] = "X";
						break;
				
				case 3: Grid[2] = "X";
						break;
				
				case 4: Grid[3] = "X";
						break;
				
				case 5: Grid[4] = "X";
						break;
				
				case 6: Grid[5] = "X";
						break;
				
				case 7: Grid[6] = "X";
						break;
				
				case 8: Grid[7] = "X";
						break;
				
				case 9: Grid[8] = "X";
						break;
			}
		}
		else{
			System.out.println("The position entered is not valid in this board game.");
			//break;
		}
		
		System.out.println(Arrays.toString(Grid));
		GridBoard(Grid);
		
	public static void userInput(){ // Thandolwethu
		
		/**This method is for asking an input from the player.*/
		
		System.out.print("Which position you want to play at? : ");
		
		int position = in.nextInt() //This is where the player input is assigned to.
	}
		
}//XOXO class
