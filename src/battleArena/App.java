package battleArena;

import java.util.Scanner;

public class App {
	
 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		CharacterRole Drache1 = new Dragon ("Drache1", 200, false, 20);
		CharacterRole Drache2 = new Dragon ("Drache2", 200, false, 20);
		
		BattleArena battle = new BattleArena(Drache1, Drache2);
		battle.simulateCombat(Drache1, Drache2);
	}
}