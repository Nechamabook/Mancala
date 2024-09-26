package Mancala;
import java.util.*;
public class Game {
	private int [] board = {4,4,4,4,4,4,0,4,4,4,4,4,4,0};
	private boolean P1turn = true;
	private int p1store;
	private int p2store;
	Board brd;
	DistributeStones ds;
	Winner win = new Winner();
	
	public void StartGame(String name1, String name2) {
	    Scanner kb = new Scanner(System.in);
	    
	    ds = new DistributeStones();
	    displayBoard();
	    do {
	        if (P1turn) {
	            int pit;
	            
	            System.out.println(name1 + " which pit would you like to choose (1-6)");
	            pit = kb.nextInt();
	            while (pit < 1 || pit > 6 || board[pit - 1] == 0) {
	                System.out.println("Invalid pit. Choose again (1-6):");
	               pit = kb.nextInt();
	               
	            }
	    distribute(pit,name1,name2);
	            displayBoard();
	        } else {
	            int pit;
	            System.out.println(name2 + " which pit would you like to choose (7-12)");
	          pit = kb.nextInt();
	            while (pit < 8 || pit > 13 || board[pit - 1] == 0) {
	                System.out.println("Invalid pit. Choose again (8-13):");
	                pit = kb.nextInt();
	            }
	     distribute(pit,name1,name2);
	            displayBoard();
	        }
	    } while (true);
	}

	


private void displayBoard() {
	   
	brd = new Board();
	System.out.println(brd.toString(board));
	
}
	
	private void distribute(int pit, String name1, String name2) {
	ds = new DistributeStones();
	ds.distributeStones(board, pit, P1turn);
	win.checkWinner1(board, name1, name2);
	while(P1turn==true) {
		if(ds.getIndex()<7) {
		StartGame(name1,name2);}
		else {
		P1turn=false;	
		}
	}
	while(P1turn==false) {
			if(ds.getIndex()>6 && ds.getIndex()<14) {
			StartGame(name1,name2);}
			else {
			P1turn=true;	
			}	
    }
	
  
    
	
		
		
		
	
	}
	
}
	
	
