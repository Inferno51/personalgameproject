package com.personalprojectsmain;

public class WarhammerGame {
	// Variable declarations
	int turnNumber = 0;
	int d6 = 1;
	String armyName = null;
	String playerName = null;
	
	
	// =][= Begin Constructor =][=
	public WarhammerGame(int turnNumber, int d6, String armyName, String playerName) {
		this.turnNumber = turnNumber;
		this.d6 = d6;
		this.armyName = armyName;
		this.playerName = playerName;
	} // =][= End Constructor =][=

	public static void main(String[] args) {
		
		TacticalSquad alpha = new TacticalSquad();
		alpha.movement();
		
	} // =][= End Main =][=
	
	
	
	public int getTurnNumber() {
		return turnNumber;
	}

	public void setTurnNumber(int turnNumber) {
		this.turnNumber = turnNumber;
	}

	public int getD6() {
		return d6;
	}

	public void setD6(int d6) {
		this.d6 = d6;
	}

	public String getArmyName() {
		return armyName;
	}

	public void setArmyName(String armyName) {
		this.armyName = armyName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	
} // =][= End Class =][=
