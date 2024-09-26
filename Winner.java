package Mancala;

public class Winner {
	DistributeStones ds = new DistributeStones();
	public void checkWinner1( int [] board,String Player1, String Player2) {
		if(isGameOver(board)==true) {
			getWinner( board,Player1, Player2);
		}
	}
	
	
	public void getWinner( int [] board,String player1, String player2) {
		for(int i = 0; i<board.length; i++) {
	    if (board[6] > board[13]) {
	        System.out.println(player1 + " is the winner with a score of " + board[6]  + ". " + player2 + " scored " + board[13] + ".");
	    } 
	    else if (board[6]  < ds.getP2()) {
	        System.out.println(player2 + " is the winner with a score of " + board[13] + ". " + player1 + "scored " + board[6]  + ".");
	    } else {
	        System.out.println("Congrats, it's a tie! Both " + player1 + " and " + player2 + " scored " + board[6]  + ".");
	    }
	    System.exit(0);}
	}


public boolean isGameOver(int[] board) {
boolean p1Empty = true;
boolean p2Empty = true;

for (int i = 0; i < 6; i++) {
    if (board[i] != 0) {
        p1Empty = false;
        break;
    }
}
for (int i = 7; i < 13; i++) {
    if (board[i] != 0) {
        p2Empty = false;
        break;
    }
}

return p1Empty || p2Empty;
}

}
