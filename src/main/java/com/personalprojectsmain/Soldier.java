package com.personalprojectsmain;

public abstract class Soldier {
	
	// =][= Variable declarations =][=
	protected int weaponSkill = 1;
	protected int ballisticSkill = 1;
	protected int strength = 1;
	protected int toughness = 1;
	protected int wounds = 1;
	protected int initiative = 1;
	protected int attacks = 1;
	protected int leadership = 1;
	protected int save = 0;
	protected String name = null;
	protected boolean moved = false;
	
	// =][= Begin Constructor =][=
	public Soldier(int weaponSkill, int ballisticSkill, int strength, int toughness, int wounds, int initiative,
			int attacks, int leadership, int save, String name, boolean moved) {
		this.weaponSkill = weaponSkill;
		this.ballisticSkill = ballisticSkill;
		this.strength = strength;
		this.toughness = toughness;
		this.wounds = wounds;
		this.initiative = initiative;
		this.attacks = attacks;
		this.leadership = leadership;
		this.save = save;
		this.name = name;
		this.moved = moved;
	} // =][= End Constructor =][=
	
	
	// =][= Begin Blank Constructor =][=
	public Soldier() {
	} // =][= End Blank Constructor =][=


	// =][= Getters and Setters =][=
	public int getWeaponSkill() {
		return weaponSkill;
	}

	public void setWeaponSkill(int weaponSkill) {
		this.weaponSkill = weaponSkill;
	}

	public int getBallisticSkill() {
		return ballisticSkill;
	}

	public void setBallisticSkill(int ballisticSkill) {
		this.ballisticSkill = ballisticSkill;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getToughness() {
		return toughness;
	}

	public void setToughness(int toughness) {
		this.toughness = toughness;
	}

	public int getWounds() {
		return wounds;
	}

	public void setWounds(int wounds) {
		this.wounds = wounds;
	}

	public int getInitiative() {
		return initiative;
	}

	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}

	public int getAttacks() {
		return attacks;
	}

	public void setAttacks(int attacks) {
		this.attacks = attacks;
	}

	public int getLeadership() {
		return leadership;
	}

	public void setLeadership(int leadership) {
		this.leadership = leadership;
	}

	public int getSave() {
		return save;
	}

	public void setSave(int save) {
		this.save = save;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMoved() {
		return moved;
	}

	public void setMoved(boolean moved) {
		this.moved = moved;
	} 
	
	
	
}
