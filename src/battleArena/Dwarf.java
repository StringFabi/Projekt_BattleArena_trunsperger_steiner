package battleArena;

public class Dwarf extends CharacterRole{
		private int calculateAttackPower;
		
		
		public Dwarf(String name, int healthPower, boolean specialAbilityActive, int damage, int calculateAttackPower) {
			super(name, healthPower, specialAbilityActive, damage);
			this.calculateAttackPower = calculateAttackPower;
		}


		public int getCalculateAttackPower() {
			return calculateAttackPower;
		}


		public void setCalculateAttackPower(int calculateAttackPower) {
			this.calculateAttackPower = calculateAttackPower;
		}
}