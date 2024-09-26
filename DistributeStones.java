package Mancala;

public class DistributeStones {
	private int p1store;
	 private int p2store;
	 private int lastPit;
	

 public boolean distributeStones(int [] board, int pit, boolean P1turn){
	 
		int stones = board[pit-1];
		board[pit-1]=0;
		int index = pit-1;
		
		
		if(P1turn == true) {
		P1turn = false;
		doStones(stones, index, board, 13, P1turn);
			
		}
		
		else{
			P1turn = true;
	  doStones(stones, index, board, 6, P1turn);
		}
		
		
	
	return P1turn;
 }
	 

 public boolean doStones(int stones, int index, int [] board, int store, boolean turn) {
	 boolean P1turn=!turn;
		while(stones>0) {
			
			index = (index+1)% board.length;
			
			 if ((turn && index == 6) || (!turn && index == 13)) {
		            continue;
		        }
			 
			board[index]++;
			stones--;
	        setIndex(index);
			
		
			}
		if(board[index] == 0) {
			P1turn = turn;
		}
		return P1turn;
 }
 
 public void setIndex(int index) {
	 this.lastPit = index;
 }
 
 public int getP1(){
	 return p1store;
 }
 
 public int getP2(){
	 return p2store;
 }
 
 public int getIndex() {
	 return lastPit;
 }
 
}

