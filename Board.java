package Mancala;

public class Board {

		public String toString(int [] board) {
			StringBuilder str = new StringBuilder();
	    str.append("\n");	
	    str.append("\n");	
	    str.append("       pit1            pit2            pit3            pit4            pit5            pit6\n");
		for(int i =0; i<6; i++) {
			str.append("	" + board[i] + "	");
		}
		str.append("\n");
		str.append(  "Store 14                           								" + "STORE 7\n");
		str.append(board[13]);
		
		str.append(  "                                   								" + board [6] + "\n");
		for(int j=12;j>6; j--) {
			str.append("	" + board[j] + "	");
		}
		str.append("\n");
		str.append("       pit13            pit12            pit11            pit10           pit9           pit8");
		
		return str.toString();
		}	
	
}

