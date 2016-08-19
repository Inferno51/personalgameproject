package com.personalprojectsmain;

public class TestClass {
	public static void main(String[] args) {
		
		int toHitRoll = 0;
		for (int i = 0; i < 100; i++) {
			toHitRoll = 1 + (int) (Math.random() * (6 - 0));
			System.out.println(toHitRoll);
		}
		
	}
}
