package com.alexanderarend.characters;

public abstract class Character {
	
	private int movementFactor;
	private int damageFactor;
	private int maxHealth;
	
	public Character(final int movementFactorIn, final int damageFactorIn, final int maxHealthIn){
		movementFactor = movementFactorIn;
		damageFactor = damageFactorIn;
		maxHealth = maxHealthIn;
	}

	public int getMovementFactor() {
		return movementFactor;
	}

	public void setMovementFactor(int movementFactor) {
		this.movementFactor = movementFactor;
	}

	public int getDamageFactor() {
		return damageFactor;
	}

	public void setDamageFactor(int damageFactor) {
		this.damageFactor = damageFactor;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	
	
}
