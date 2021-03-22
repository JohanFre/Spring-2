package com.example.demo;
import java.util.Random;

public class NPC {

	public static String npc() {
		
		// Generates random number 1-3 and selects from array.
		Random generator = new Random();
		int num = generator.nextInt(2 + 1);
		String[] array = new String[] { "rock", "paper", "scissor" };
		return array[num];
	}
}
