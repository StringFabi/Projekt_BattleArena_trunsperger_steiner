package battleArena;

public class Characters {
		private String name;
		private int healthPower;
		private boolean specialAbilityActive;
		private int damage;
		
		
		public Characters(String name, int healthPower, boolean specialAbilityActive, int damage) {
			super();
			this.name = name;
			this.healthPower = healthPower;
			this.specialAbilityActive = specialAbilityActive;
			this.damage = damage;
		}


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


		public void setSpecialAbilityActive(boolean specialAbilityActive) {
			this.specialAbilityActive = specialAbilityActive;
		}


		public int getDamage() {
			return damage;
		}


		public void setDamage(int damage) {
			this.damage = damage;
		}


		@Override
		public String toString() {
			return "Characters [name=" + name + ", healthPower=" + healthPower + ", specialAbilityActive="
					+ specialAbilityActive + ", damage=" + damage + ", getName()=" + getName() + ", getHealthPower()="
					+ getHealthPower() + ", isSpecialAbilityActive()=" + isSpecialAbilityActive() + ", getDamage()="
					+ getDamage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		
		
}
