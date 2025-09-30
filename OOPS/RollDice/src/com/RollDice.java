package com;

import java.util.Random;
import java.util.Scanner;

public class RollDice {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		RollDice r = new RollDice();
		r.rollDice();
	}

	public void rollDice() {
		
		int score = 0;
		int diceValue =0;
		while(diceValue != 1) {
		System.out.println("Enter 10 to roll the dice");
		sc.next();
		Random random = new Random();
		diceValue = random.nextInt(1,6);
		System.out.println("Your Dice value "+ diceValue);
		score += diceValue;
		}
		
		System.out.println("You are out of the game");
		System.out.println("Your Final Score : "+ score);
	}
}
