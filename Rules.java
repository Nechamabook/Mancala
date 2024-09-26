package Mancala;

public class Rules {

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Rules to Mancala:\n");
		str.append("Player 1 goes first \n");
		str.append("Pick a pit, if you land on your side or in your store you get to go again \nIf you land on the other opponents side your turn is over ");
	    str.append("When One opponents side is empty the game is over\n");
	    str.append("Whoever has more stones in their store wins the game\n");
	    str.append("Have fun!");
		return str.toString();
	}
}
