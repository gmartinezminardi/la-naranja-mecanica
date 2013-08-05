package models;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import controllers.Application;

import play.api.libs.Files;
import play.libs.Json;

public class Game {
	private static final Map<String, List<Game>> tournament = new HashMap<String, List<Game>>();
	private static final Integer MATCHES = 20;
	
	public String date;
	public String round;
	public Team local;
	public Team visit;
	public String localScore;
	public String visitScore;
	public List<GamePlayers> players;
	public String summaryTitle;
	public String summary;
	public String commentarist;


	public Game(String date, String round, Team local, String localScore, Team visit, String visitScore, 
				List<GamePlayers> players, String summaryTitle, String summary, String commentarist) {
		super();
		this.date = date;
		this.round = round;
		this.local = local;
		this.visit = visit;
		this.players = players;
		this.localScore = localScore;
		this.visitScore = visitScore;
		this.summaryTitle = summaryTitle;
		this.summary = summary;
		this.commentarist = commentarist;
	}

	public Game() {
	}

	public static List<Game> all(String year, String tournament) {
		String key = tournament + "-" + year;

		List<Game> games = Game.tournament.get(key);
		
		if (games == null) {
			games = new ArrayList<Game>();
			
			for (int i = 1; i < MATCHES; i++) {
				try {
					File file = new File(Application.getPath(year, tournament, i+".json"));
					Game game = Json.fromJson(Json.parse(Files.readFile(file).toString()), Game.class);
					games.add(game);
				} catch (Exception e){
					break;
				}
			}
			
			Game.tournament.put(key, games);
		
		}
		
		return games;
	}

	public static Game get(String year, String tournament, Integer index) {
		
		if(index == 0 || index > all(year, tournament).size()) {
			return null;
		}
		
		return all(year, tournament).get(index - 1);

	}
	
	@Override
	public String toString() {
		return local.name + " vs " + visit.name;
	}

}
