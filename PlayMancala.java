package Mancala;
import java.util.Scanner;
public class PlayMancala {
public static void main(String[]args) {
	Scanner kb = new Scanner(System.in);
	Rules rules = new Rules();
	System.out.println(rules.toString());
	Game gm = new Game();	
	String name1;
	String name2;
	
	System.out.println("Player 1 Name: ");
	name1=kb.nextLine();
	
	System.out.println("Player 2 Name: ");
	name2=kb.nextLine();
	
	gm.StartGame(name1,name2);
	
}
}
