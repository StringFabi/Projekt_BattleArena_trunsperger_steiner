package battleArena;

public class Dragon extends Characters{
		private int attackPower;
		private boolean isSpecialAttackActive;
		
		
		public Dragon(String name, int healthPower, boolean specialAbilityActive, int damage, int attackPower, boolean isSpecialAttackActive) {
			super(name, healthPower, specialAbilityActive, damage);
			this.attackPower = attackPower;
			this.isSpecialAttackActive = isSpecialAttackActive;
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


		@Override
		public String toString() {
			return "Dragon [attackPower=" + attackPower + ", isSpecialAttackActive=" + isSpecialAttackActive
					+ ", getAttackPower()=" + getAttackPower() + ", isSpecialAttackActive()=" + isSpecialAttackActive()
					+ ", getName()=" + getName() + ", getHealthPower()=" + getHealthPower()
					+ ", isSpecialAbilityActive()=" + isSpecialAbilityActive() + ", getDamage()=" + getDamage()
					+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ "]";
		}
		
		
}
