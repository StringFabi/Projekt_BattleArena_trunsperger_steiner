package battleArena;

public class BattleArena {


	private CharacterRole character1;
	private CharacterRole character2;
	private CharacterRole winner;
	private CharacterRole [] character;

	public BattleArena(CharacterRole  character1, CharacterRole  character2) {
		this.character = new CharacterRole  [2];
		this.setCharacter1(character1);
		this.setCharacter2(character2);
		character[0] = character1;
		character[1] = character2;
		character[2] = winner;
	}

	public CharacterRole getCharacter2() {
		return character2;
	}

	public void setCharacter2(CharacterRole character2) {
		this.character2 = character2;
	}

	public CharacterRole getCharacter1() {
		return character1;
	}

	public void setCharacter1(CharacterRole character1) {
		this.character1 = character1;
	}
	
	
}
