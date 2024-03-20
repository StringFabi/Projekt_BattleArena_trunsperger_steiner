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
 
	/**
	 * getter and setter
	 * @return
	 */
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


	public void fight(CharacterRole attacker, CharacterRole victim) {
		System.out.print(attacker.getName()+ " ");
		System.out.println(attacker.getHealthPower());
		System.out.print(victim.getName() + " ");
		System.out.println(victim.getHealthPower());
	}
	Scanner sc = new Scanner(System.in);
	
	
	/**
	 * 
	 * @param sc
	 * @param attacker
	 * @param victim
	 * @return 	true wenn ein gültiger Befehl eingegeben wurde, nächster Spieler an der Reihe
	 * 			false wenn kein gültiger Befehl eingegeben wurde, Spieler nochmal am Zug
	 */
	public boolean fight(Scanner sc,CharacterRole attacker, CharacterRole victim) {

		String input = sc.nextLine();
		if(input.equalsIgnoreCase("activate")) {
			attacker.setSpecialAbilityActive(attacker);
			int attackNumber = ThreadLocalRandom.current().nextInt(20,25+1); //Richtige Parameter einfügen
			victim.setHealthPower(victim.getHealthPower()-attackNumber);
			victim.setHealthPower(victim.getHealthPower()-attacker.getDamage());
		}
		else if(input.equals("deactivate") && attacker.isSpecialAbilityActive()==true) {
			attacker.resetSpecialAbilityActive(attacker);
		}
		else if(input.equalsIgnoreCase("attack")) {
			victim.setHealthPower(victim.getHealthPower()-attacker.getDamage());
		} else {
			System.out.println("Eingabefehler, bitte einen der folgenden Kommandos eingeben: \n\t\t "
					+ "activate, deactivate, attack");
			return false;
		}
		victim.setHealthPower(victim.getHealthPower()-attacker.getDamage());
		return true;		
	}
	/**
	 * Hilfsmethode um den Gewinner eines Kampfes zu ermitteln
	 * @param c1 Charakter 1
	 * @param c2 Charakter 2
	 */
	public String determineWinner(CharacterRole c1, CharacterRole c2) {
		String winner;
		if(c1.getHealthPower()>c2.getHealthPower()) {
			System.out.println(c1.getName() + " Gewinnt");
			winner = c1.getName();
		} else {
			System.out.println(c2.getName() + " Gewinnt");
			winner = c2.getName();
		}
		return winner;
	}
	
	/**
	 * Simulates a combat between the two characters
	 * @param character1
	 * @param Character2
	 */
	public void simulateCombat(CharacterRole character1, CharacterRole Character2) {
			boolean round1 = false;
			boolean round2 = false;
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
		
		while (second.getHealthPower() > 0 || beginner.getHealthPower() > 0){
			if (second.getHealthPower() <= 0 || beginner.getHealthPower() <= 0) {
				determineWinner(second, beginner);
			}
				System.out.println("Beginnender Character bitte Anweisungen eingeben");
				round1 = fight(sc, beginner, second);
				System.out.println(second.getName() + " HP: " + second.getHealthPower());
				System.out.println("Nächster Character bitte Anweisungen eingeben");
			if(round1 == true) {
				round2 = fight(sc, second, beginner);
				System.out.println(beginner.getName() + "HP: " + beginner.getHealthPower());
			} else {
				if (second.getHealthPower() <= 0 || beginner.getHealthPower() <= 0) {
					determineWinner(second, beginner);
				}
				round1 = fight(sc, beginner, second);
				System.out.println(second.getName() + "HP: " + beginner.getHealthPower());
			}
			if(round2 == false) {
				round2 = fight(sc, second, beginner);
				System.out.println(beginner.getName() + "HP: " + beginner.getHealthPower());
			} 
			if (second.getHealthPower() <= 0 || beginner.getHealthPower() <= 0) {
				determineWinner(second, beginner);
			}
		} 
	}
	
}