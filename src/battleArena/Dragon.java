package battleArena;

public class Dragon extends CharacterRole{
		private int attackPower;
		private boolean isSpecialAttackActive;
		
		
		public Dragon(String name, int healthPower, boolean specialAbilityActive, int damage) {
		    super(name, healthPower, specialAbilityActive, damage);
		}



		public int getAttackPower() {
			return attackPower;
		}


		public void setAttackPower(int attackPower) {
			this.attackPower = attackPower;
		}


		public boolean isSpecialAttackActive() {
			return isSpecialAttackActive;
		}


		public void setSpecialAttackActive(boolean isSpecialAttackActive) {
			this.isSpecialAttackActive = isSpecialAttackActive;
		}
		
		public int randomNumberGenerator(int min, int max) {
			int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
			return random_int;
		}
		
		public int attack() {
			return randomNumberGenerator(15, 25);
		}
		
		
}
