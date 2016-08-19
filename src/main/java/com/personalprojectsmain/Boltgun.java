package com.personalprojectsmain;

public class Boltgun extends Weapon{
	
	String owningSquad = null;

	

	public Boltgun(int weaponRange, int weaponStrength, int weaponArmorPiercing, int numShots, String weaponName,
			String owningSquad) {
		super(weaponRange, weaponStrength, weaponArmorPiercing, numShots, weaponName);
		this.owningSquad = owningSquad;
	}

	@Override
	public int shootsWeapon(int weaponRange, int weaponStrength, int weaponArmorPiercing, int numShots) {
		// TODO Code for shooting a Boltgun
		int hitsCaused = 0;
		int woundsCaused = 0;
		boolean targetInRange = false;
		if (weaponRange <= 24){
			targetInRange = true;
		} else {
			targetInRange = false;
		}
		
		if (targetInRange = true){
			boolean hitTarget = false;
			int toHitRoll = 0;
			
			toHitRoll = 1 + (int) (Math.random() * (6 - 0));
			if (toHitRoll >= 3){
				hitTarget = true;
				hitsCaused+=1;
			} 
		}
		
		
		
		return 0;
	}

	public Boltgun() {
	}
	
	
	
	public String getOwningSquad() {
		return owningSquad;
	}

	public void setOwningSquad(String owningSquad) {
		this.owningSquad = owningSquad;
	}



	
	
	
	
}
