package com.personalprojectsmain;

import java.util.Scanner;

public class TacticalSquad extends Soldier{
	int numMarines = 5;
	int moveDistance = 6;
	
	// =][= Begin Constructor =][=
	public TacticalSquad(int weaponSkill, int ballisticSkill, int strength, int toughness, int wounds, int initiative,
			int attacks, int leadership, int save, String name, boolean moved, int numMarines, int moveDistance) {
		super(weaponSkill, ballisticSkill, strength, toughness, wounds, initiative, attacks, leadership, save, name,
				moved);
		this.numMarines = numMarines;
		this.moveDistance = moveDistance;
	} // =][= End Constructor =][=
	
	// =][= Begin Blank Constructor =][=
	public TacticalSquad() {
	} // =][= End Blank Constructor =][=

	
	// =][= Movement Method =][=
	public void movement() {
		String userInput;
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to move your unit?\n");
		
		userInput = sc.nextLine();
		
		if (userInput.equalsIgnoreCase("yes")){
			System.out.println("You unit moved " + moveDistance + " yards.");
		} else {
			System.out.println("Your unit holds, weapons ready.");
		}
		sc.close();
	}
	
	
	// =][= Begin Getters and Setters =][=
	public int getNumMarines() {
		return numMarines;
	}

	public void setNumMarines(int numMarines) {
		this.numMarines = numMarines;
	}

	public int getMoveDistance() {
		return moveDistance;
	}

	public void setMoveDistance(int moveDistance) {
		this.moveDistance = moveDistance;
	}
	
	
	
}
