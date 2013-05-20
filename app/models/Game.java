package models;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import play.api.libs.Files;
import play.libs.Json;

public class Game {
	private static final List<Game> games = new ArrayList<Game>();
	
	public String date;
	public Team local;
	public Team visit;
	public String localScore;
	public String visitScore;
	public List<GamePlayers> players;
	public String summaryTitle;
	public String summary;
	public String commentarist;


	public Game(String date, Team local, String localScore, Team visit, String visitScore, 
				List<GamePlayers> players, String summaryTitle, String summary, String commentarist) {
		super();
		this.date = date;
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

	public static List<Game> all() {
		if (games.isEmpty()) {
			games.add(Json.fromJson(Json.parse(Files.readFile(new File("app/resources/game/1.json")).toString()), Game.class));
			games.add(Json.fromJson(Json.parse(Files.readFile(new File("app/resources/game/2.json")).toString()), Game.class));
			games.add(Json.fromJson(Json.parse(Files.readFile(new File("app/resources/game/3.json")).toString()), Game.class));
			games.add(Json.fromJson(Json.parse(Files.readFile(new File("app/resources/game/4.json")).toString()), Game.class));
			games.add(Json.fromJson(Json.parse(Files.readFile(new File("app/resources/game/5.json")).toString()), Game.class));
			games.add(Json.fromJson(Json.parse(Files.readFile(new File("app/resources/game/6.json")).toString()), Game.class));
			games.add(Json.fromJson(Json.parse(Files.readFile(new File("app/resources/game/7.json")).toString()), Game.class));
			games.add(Json.fromJson(Json.parse(Files.readFile(new File("app/resources/game/8.json")).toString()), Game.class));
		}
		
		return games;
	}

	public static Game get(Integer index) {
		
		if(index == 0 || index > all().size()) {
			return null;
		}
		
		return all().get(index - 1);

	}
	
	@Override
	public String toString() {
		return local.name + " vs " + visit.name;
	}

}
