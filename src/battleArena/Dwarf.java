package battleArena;

public class Dwarf extends CharacterRole{
		private int calculateAttackPower;
		private int dwarfCoconut;
		
		
		public Dwarf(String name, int healthPower, boolean specialAbilityActive, int damage, int calculateAttackPower, int dwarfCoconut) {
			super(name, healthPower, specialAbilityActive, damage);
			this.calculateAttackPower = calculateAttackPower;
			this.dwarfCoconut = dwarfCoconut;
		}


		public int getCalculateAttackPower() {
			return calculateAttackPower;
		}


		public void setCalculateAttackPower(int calculateAttackPower) {
			this.calculateAttackPower = calculateAttackPower;
		}


		public int getDwarfCoconut() {
			return dwarfCoconut;
		}


		public void setDwarfCoconut(int dwarfCoconut) {
			this.dwarfCoconut = dwarfCoconut;
		}


		@Override
		public String toString() {
			return "Dwarf [calculateAttackPower=" + calculateAttackPower + ", dwarfCoconut=" + dwarfCoconut
					+ ", getCalculateAttackPower()=" + getCalculateAttackPower() + ", getDwarfCoconut()="
					+ getDwarfCoconut() + ", getName()=" + getName() + ", getHealthPower()=" + getHealthPower()
					+ ", isSpecialAbilityActive()=" + isSpecialAbilityActive() + ", getDamage()=" + getDamage()
					+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ "]";
		}
		
		
		
}
