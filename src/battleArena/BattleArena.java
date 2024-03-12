package battleArena;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BattleArena {


	private CharacterRole character1;
	private CharacterRole character2;
	private CharacterRole winner;
	private CharacterRole [] character;

	public BattleArena(CharacterRole  character1, CharacterRole  character2) {
		this.character = new CharacterRole [3];
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
	
	public int pickBeginner() {
		if(Math.random()<=0.5) {
			return 1;
		} else {
			return 0;
		}	
	}
	//UNFINISHED
	
	Scanner sc = new Scanner(System.in);
	
	public void fight(Scanner sc,CharacterRole attacker, CharacterRole victim) {
		String input = sc.nextLine();
		if(input.equalsIgnoreCase("activate")) {
			attacker.setSpecialAbilityActive(attacker);
			int attackNumber = ThreadLocalRandom.current().nextInt(20,25+1); //Richtige Parameter einfügen
			victim.setDamage(victim.getHealthPower()-attackNumber);
					
		}
		victim.setHealthPower(victim.getHealthPower()-attacker.getDamage());		
	}
	
	public void simulateCombat(CharacterRole character1, CharacterRole Character2) {
			CharacterRole beginner;
			CharacterRole second;
				if(pickBeginner() == 1) {
					beginner = character1;
					second = character2;
				} else {
					beginner = character2;
					second = character1;
				}
			System.out.println("Beginnender Character: " + beginner);
		while (character1.getHealthPower() > 0 || character2.getHealthPower() > 0){
			System.out.println("Beginnender Character bitte Anweisungen eingeben");
			fight(sc, beginner, second);
			System.out.println("Beginner HP: " + second.getHealthPower());
			System.out.println("Nächster Character bitte Anweisungen eingeben");
			fight(sc, second, beginner);
			System.out.println("second HP: " + beginner.getHealthPower());
		}
	}
	
}
