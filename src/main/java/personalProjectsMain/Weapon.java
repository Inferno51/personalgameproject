package personalProjectsMain;

public abstract class Weapon {
	protected int weaponRange;
	protected int weaponStrength = 1;
	protected int weaponArmorPiercing = 0;
	protected String weaponName = null;
	
	public Weapon(int weaponRange, int weaponStrength, int weaponArmorPiercing, String weaponName) {
		this.weaponRange = weaponRange;
		this.weaponStrength = weaponStrength;
		this.weaponArmorPiercing = weaponArmorPiercing;
		this.weaponName = weaponName;
	}

	public int getWeaponRange() {
		return weaponRange;
	}

	public void setWeaponRange(int weaponRange) {
		this.weaponRange = weaponRange;
	}

	public int getWeaponStrength() {
		return weaponStrength;
	}

	public void setWeaponStrength(int weaponStrength) {
		this.weaponStrength = weaponStrength;
	}

	public int getWeaponArmorPiercing() {
		return weaponArmorPiercing;
	}

	public void setWeaponArmorPiercing(int weaponArmorPiercing) {
		this.weaponArmorPiercing = weaponArmorPiercing;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	
	
	
}
