package com.example.demo;

import java.io.IOException;

public class rpsGame {
	
		public static String pve(String player)throws IOException{
			
			String playerOne = player.toLowerCase();
			String npc = NPC.npc();
			String results = "";
			
			if (playerOne.equals(npc)) {
				ScoreBean.ties++;
				results = "It's a tie!";
			}else if(playerOne.equals("rock") && npc.equals("scissor")) {
				ScoreBean.wins++;
				results = "PlayerOne wins!";
			}else if(playerOne.equals("paper") && npc.equals("rock")) {
				ScoreBean.wins++;
				results = "PlayerOne wins!";
			}else if(playerOne.equals("scissor") && npc.equals("paper")) {
				ScoreBean.wins++;
				results = "PlayerOne wins!";
			}else {
				ScoreBean.losses++;
				results = "PlayerOne loses!";
			}
			return results;
		}
		
		public static String pvp(String pOne, String pTwo)throws IOException{
			
			String playerOne = pOne.toLowerCase();
			String playerTwo = pTwo.toLowerCase();
			String results = "";
			
			if (playerOne.equals(playerTwo)) {
				ScoreBean.ties++;
				results = "It's a tie!";
			}else if(playerOne.equals("rock") && playerTwo.equals("scissor")) {
				ScoreBean.wins++;
				results = "PlayerOne wins!";
			}else if(playerOne.equals("paper") && playerTwo.equals("rock")) {
				ScoreBean.wins++;
				results = "PlayerOne wins!";
			}else if(playerOne.equals("scissor") && playerTwo.equals("paper")) {
				ScoreBean.wins++;
				results = "PlayerOne wins!";
			}else {
				ScoreBean.losses++;
				results = "PlayerOne loses!";
			}
			return results;
			
		}
}
