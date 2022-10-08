import java.util.*;
import java.io.*;

public class XOXOgame {
	
	public static void main(String[] args){
		XOXOBoard board = new XOXOBoard(); 
        System.out.println(Arrays.toString(board.posConvert(3)));
            board.addXorO(1, 9);
            board.printboard();
	}//main
	
} //XOXOgame