import java.util.*;
import java.io.*;

public class XOXO {
	/*this class is responsible for additional methods not related
	 *to the board directly */

    public boolean moveValidation (char[][] board, int[] positions){
		/**This method will validate whether the specified
		 *position is filled or not
		 
		 @param interger-array "positions"
		 @param 2d-array "board2D"
		 
		 @return boolean
		*/
		
        char position = board[positions[0]][positions[1]];
        if(position == ' ') { //If space on board is unoccupied
			return true;
            }
            return false;
		}//moveValidation
		
}//XOXO class
