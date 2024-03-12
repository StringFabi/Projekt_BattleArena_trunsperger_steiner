package battleArena;

public class App {
	


	public static void main(String[] args) {
		
		Dragon Drache1 = new Dragon ("Drache1", 200, false, 520);
		Dragon Drache2 = new Dragon ("Drache2", 200, false, 520);
		
		BattleArena battle = new BattleArena(Drache1, Drache2);

	}

}
