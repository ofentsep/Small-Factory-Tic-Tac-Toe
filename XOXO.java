public class XOXO {
    public static void gameboard()
    {
	char[][] board = {{' ', '|', ' ', '|', ' '},
					  {'_', ' ', '_', ' ', '_'}, 
					  {' ', '|', ' ', '|', ' '}, 
		              {'_', ' ', '_', ' ', '_'}, 
				      {' ', '|', ' ', '|', ' '}};
		
	for(char[] row:board)   //for each array in the board
    {	
		for(char character: row)    //for loop that loops for each character in each row
        {	
			System.out.print(character);	//print out each character
	    }
		System.out.println();	//prints a line after each row
			
	}
	}

    
}
