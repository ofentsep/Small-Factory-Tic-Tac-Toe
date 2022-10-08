import java.util.*;
import java.io.*;

public class XOXOGameplay {
	/*this class will carry out the execution part
	 *of the game which will give the user option of
	 *multi or single player */
	 
	private static XOXOBoard board = new XOXOBoard();
	private static XOXO xo = new XOXO();
	
	public static void gameMenu() {
		/*this method will display the game main menu
		 *allowing the user to see valid options
		 */
		 
		System.out.println("Tic-Tac-Toe... Tic-Tac Go... Let the games begin");
		System.out.println("Select an option: ");
		System.out.println("[1] Single Player");
		System.out.println("[2] Multiplayer");
		System.out.println("[Q] Quit");
		} //gameMenu
		
	public static void player1() {
		
		Scanner user = new Scanner(System.in);
		int userposition;
		boolean validmove = false;
		
		while(!validmove){
		try{
			userposition = user.nextInt(); //user enters position
			validmove = board.playerMove(1, userposition);
			validmove = true;
			return;
			} //try
		catch(Exception ex){
			System.err.println("Invalid Input\n");
			} //catch
		finally{
			System.out.println("Player 1\nChoose a position between 1-9:");
			continue;
			}
		} //while-loop
	} //player1
	
	public static void player2() {
		
		Scanner user = new Scanner(System.in);
		int userposition;
		boolean validmove = false;
		
		while(!validmove){
		try{
			userposition = user.nextInt(); //user enters position
			validmove = board.playerMove(2, userposition);
			validmove = true;
			break;
			} //try
		catch(Exception ex){
			System.err.println("Invalid Input\n");
			} //catch
		finally{
			System.out.println("Player 2\nChoose a position between 1-9: ");
			continue;
			}
		} //while-loop
	} //player2
	
	public static void main (String[] args) {
		Scanner user = new Scanner(System.in);
		String userin;
		int gameCnt = 0;
		boolean win = false;
		
		gameMenu();
		while(!win){
			userin = user.nextLine();
			switch(userin){
				case "1":
				board.displayboard();
				while(gameCnt < 5){
					if(board.winConditions('X') == false && board.winConditions('O') == false){
						System.out.println("\nChoose a position between 1-9");
						player1();
						board.cpuMove();
						board.displayboard();
						if(board.winConditions('X') == true){
							System.out.println("\nPlayer 1 wins");
							win = true;
							gameCnt = 5;
							return;
							} //player1 wins
						else{
							if(board.winConditions('O') == true){
								System.out.println("\nComputer Wins");
								win = true;
								gameCnt = 5;
								return;
								} //Computer wins
							else{
								if(gameCnt >= 5){
									System.out.print("\nIt's a TIE!");
									gameCnt = 0;
									win = true;
									return;
									} //TIE
								} //else
							}
						gameCnt++;
						}							
				} //while-loop
			
				case "2":
				board.displayboard();
				while(gameCnt < 5){
					if(board.winConditions('X') == false && board.winConditions('O') == false){
						System.out.println("\nPlayer 1, Choose a position between 1-9: ");
						player1();
						gameCnt++;
						board.displayboard();
						if(board.winConditions('X') == true){
							System.out.println("\nPlayer 1 wins");
							win = true;
							gameCnt = 5;
							return;
							} //player1 wins
						else{
							if(board.winConditions('O') == true){
								System.out.println("\nPlayer 2 Wins");
								win = true;
								gameCnt = 5;
								return;
								} //Player2 wins
							}
						if(gameCnt >= 5){
							System.out.print("\nIt's a TIE!");
							gameCnt = 0;
							win = true;
							return;
							} //TIE
						System.out.println("\nPlayer 2, Choose a position between 1-9: ");
						player2();
						board.displayboard();
						if(board.winConditions('X') == true){
							System.out.println("\nPlayer 1 wins");
							win = true;
							gameCnt = 5;
							break;
							} //player1 wins
						else{
							if(board.winConditions('O') == true){
								System.out.println("\nPlayer 2 Wins");
								win = true;
								gameCnt = 5;
								break;
								} //Player2 wins
							}
						}//keep playing
				} //while-loop
				case "Q": case "q":
					System.out.println("\nGame Over...");
					win = true;
					break;
			} //switch
		} //while-loop
	
	} //main
} //XOXOGameplay
