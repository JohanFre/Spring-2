package com.example.demo;

import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	private int wins;
	private int losses;
	private int ties;
	private int counter;
	
	@RequestMapping(value = "/score/wins", method = RequestMethod.POST)
	public int addWins() {
		ScoreBean.wins++;
		return wins;
	}
	
	@RequestMapping(value = "/score/losses", method = RequestMethod.POST)
	public int addLosses() {
		ScoreBean.losses++;
		return losses;
	}
	
	@RequestMapping(value = "/score/ties", method = RequestMethod.POST)
	public int addTies() {
		ScoreBean.ties++;
		return ties;
	}
	
	@RequestMapping(value = "/score/counter", method = RequestMethod.POST)
	public int addCounter() {
		ScoreBean.counter++;
		return counter;
	}
	
	@RequestMapping(value = "/wins", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String winsUpdate() {
		String pattern = "{ \"Wins\": \"%s\"}";
		String json = String.format(pattern, ScoreBean.wins);
		return json;
	}
	
	@RequestMapping(value = "/losses", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String lossesUpdate() {
		String pattern = "{ \"Losses\": \"%s\"}";
		String json = String.format(pattern, ScoreBean.losses);
		return json;
	}
	
	@RequestMapping(value = "/ties", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String tiesUpdate() {
		String pattern = "{ \"Ties\": \"%s\"}";
		String json = String.format(pattern, ScoreBean.ties);
		return json;
	}

	@RequestMapping(value = "/counter", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String counterUpdate() {
		String pattern = "{ \"Game Round\": \"%s\"}";
		String json = String.format(pattern, ScoreBean.counter);
		return json;
	}
	
	@RequestMapping(value = "/score", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getScoreBean() {
		String pattern = "{ \"Wins\":\"%s\", \"Losses\":\"%s\", \"Ties\": \"%s\"}";
		String json = String.format(pattern, ScoreBean.wins, ScoreBean.losses, ScoreBean.ties);
		return json;

	}
	
	@RequestMapping(value = "/updatescore", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateScore(int wins, int losses, int ties) {
		ScoreBean.wins = wins;
		ScoreBean.losses = losses;
		ScoreBean.ties = ties;
		String pattern = "{ \"Wins\":\"%s\", \"Losses\":\"%s\", \"Ties\": \"%s\"}";
		String json = String.format(pattern, ScoreBean.wins, ScoreBean.losses, ScoreBean.ties);
		return json;
	}
	
	@RequestMapping(path = "/pve", method = RequestMethod.POST)
	public static String pve(String player) throws IOException {

		return rpsGame.pve(player);

	}
	
	@RequestMapping(path = "/pvp", method = RequestMethod.POST)
	public static String pvp(String playerOne, String playerTwo) throws IOException {

		return rpsGame.pvp(playerOne, playerTwo);

	}
}

