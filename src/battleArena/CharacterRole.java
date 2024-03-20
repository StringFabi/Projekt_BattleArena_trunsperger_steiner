package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class CharacterRole {
		private String name;
		private int healthPower;
		private boolean specialAbilityActive;
		private int damage;
		
		
		public CharacterRole(String name, int healthPower, boolean specialAbilityActive, int damage) {
			this.name = name;
			this.healthPower = healthPower;
			this.specialAbilityActive = specialAbilityActive;
			this.damage = damage;
		}

		/**
		 * getter and setter
		 * @return
		 */

		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getHealthPower() {
			return healthPower;
		}


		public void setHealthPower(int healthPower) {
			this.healthPower = healthPower;
		}


		public boolean isSpecialAbilityActive() {
			return specialAbilityActive;
		}


		public boolean setSpecialAbilityActive(CharacterRole attacker) {
			if(attacker.isSpecialAbilityActive()) {
				System.out.println("Special abilty bereits aktiv");
			}
			if(!attacker.isSpecialAbilityActive()) {
				specialAbilityActive = true;
				System.out.println("Special ability akiviert");
			}
			return specialAbilityActive;
		}
/**
 * Deactivates the special ability of the attacker
 * @param attacker
 * @return
 */
		public boolean resetSpecialAbilityActive(CharacterRole attacker) {
			if(attacker.isSpecialAbilityActive()) {
				specialAbilityActive = false;
				System.out.println("Special abilty deaktiviert");
			}
			if(!attacker.isSpecialAbilityActive()) {
				System.out.println("Special ability bereits deaktiviert");
			}
			return specialAbilityActive;
		}

		public int getDamage() {
			return damage;
		}


		public void setDamage(int damage) {
			this.damage = damage;
		}


		@Override
		public String toString() {
			return "Character Type: " + this.getClass().getName() + "\n"
					+ "Name: " + this.getName() + "\n"
					+ "Health: " + this.getHealthPower();
		}
		
		public void getDamage(int points) {
		    this.healthPower -= points;
		}

	/*	public void attack(Character enemy) {
			this.attackValue(damage);
		}
	*/	
		/**
		 * Sets the attack value of the character
		 * @param Value
		 */
		public void attackValue(int Value) {
			this.attackValue(ThreadLocalRandom.current().nextInt(20, 25 +1));
		}
		
}
