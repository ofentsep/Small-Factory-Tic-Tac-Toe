import java.util.*;
import java.io.*;

public class XOXOBoard {
	/*this class is responsible for every aspect which
	 *includes the usage of the board
	 */
	
	protected int cpuMoveTrack = 0;
	protected static int tie = 0; //TieCondition
	protected static char[][] board; //Board Variable
	protected static char piece; //Board piece
	
    public char[][] gameboard(){
	/*this METHOD creates a 2D-array which will be used
	 *to create the board and initializen the board
	 *in the constructor
	 */
		char[][] board = {{' ', '|', ' ', '|', ' '},
						  {' ', '|', ' ', '|', ' '}, 
						  {' ', '|', ' ', '|', ' '}, };
				return board;} //gameboard

	public XOXOBoard(){
		this.board = gameboard();
		} //Constructor for the board
    
	public void displayboard(){
	/*this METHOD prints out the layout of the board
	*/
	
	int termloop = 0;
		System.out.println();
		for(char[] row:board){//for each array in the board
			for(char character: row){//for loop that loops for each character in each row
				System.out.print(character); //print out each character	
				}
		if(termloop != 2){
			termloop += 1;
			System.out.println("\n-+-+-");
			}// Printing the board horizontal divider
		}//end of loop
			System.out.println();
	} //displayboard
	
	public static int[] posConvert (int playerIn){
	/**This METHOD converts the player input to an index
	 * that can be used effectively to get the 2D-Array version
	 * of index that can be pout into respective field
	 */

	String[] validIdxs = {"0, 0", "0, 2", "0, 4",
						  "1, 0", "1, 2", "1, 4",
						  "2, 0", "2, 2", "2, 4"};
	
	String idxExtr = validIdxs[playerIn - 1]; /*Extracts the player seletected
												fields using the passed index */					
		int colIdx = Integer.parseInt(idxExtr.substring(0, 1)); //Gets the firt digit
		int rowIdx = Integer.parseInt(idxExtr.substring(3, 4)); //Gets the second digit
		int[] resultVal = {colIdx, rowIdx}; //Inputs the digits into an array
		return resultVal; //VOILAAAAAA!
		} //positionConvert

	
	public static void addXorO (int player1or2orCPU, int position) {
	/*this METHOD is responsible for adding X and O to the board
	*/

	if(player1or2orCPU == 1){
		piece = 'X';
		}
		else{
			piece = 'O';}

	int[] boardIdxs = posConvert(position); //Will convert the player input posistion to 2D-array indexes
		int colIdx = boardIdxs[0], rowIdx = boardIdxs[1];
		board[colIdx][rowIdx] = piece; //Add Piece

		} //addXorO
		
	public void cpuMove () {
		/*this method will be responsible for the cpu
		 *versus version */
		 
		int position = 0;
		boolean posValid = false;
		XOXO valid = new XOXO();
		Random move = new Random();
		
		cpuMoveTrack++;
		while(!posValid && cpuMoveTrack < 5){
			position = move.nextInt(1, 10);
			posValid = valid.moveValidation(board, posConvert(position));
			} //while-loop
			if(cpuMoveTrack != 5){
			addXorO(2, position);
			}
			return;
			
		} //cpuMove	
		
	public static boolean playerMove(int player1or2, int position){
		/*this method is responsible for making sure player moves are valid
		 *and no moves are repeated
		 */
		
		XOXO pValid = new XOXO();
		boolean posValid = pValid.moveValidation(board, posConvert(position));
		
		if(posValid == true){
			posValid = pValid.moveValidation(board, posConvert(position));
			addXorO(player1or2, position);
			return true;	
			} //successful move
		else{
			return false;
			} //space occupied
		} //playerMove
		
	public boolean winConditions (char x_o) {
	/*this method will be responsible for displaying the winner
	 *@param empty/takes no parameter
	 *@return returns an integer 1 or 2, or -1 for a tie
	 */
	
	if(board[0][0] == x_o && board[0][2] == x_o && board[0][4] == x_o){
		return true;
		}
	if(board[1][0] == x_o && board[1][2] == x_o && board[1][4] == x_o){
		return true;
		}
	if(board[2][0] == x_o && board[2][2] == x_o && board[2][4] == x_o){
		return true;
		}
	if(board[0][0] == x_o && board[1][2] == x_o && board[2][4] == x_o){
		return true;
		}
	if(board[0][4] == x_o && board[1][2] == x_o && board[2][0] == x_o){
		return true;
		}
	if(board[0][2] == x_o && board[1][2] == x_o && board[2][2] == x_o){
		return true;
		}
	else {
		return false;
		} //tie or no winner yet
	} //winConditions
		
}//XOXOBoard
