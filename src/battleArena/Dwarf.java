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
		
		
		
}
