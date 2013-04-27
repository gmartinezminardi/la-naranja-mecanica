package models;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import play.api.libs.Files;
import play.libs.Json;

public class Match {
	private static final List<Match> matches = new ArrayList<Match>();
	
	public String date;
	public Team local;
	public Team visit;
	public String localScore;
	public String visitScore;
	public List<MatchPlayers> players;
	public String summaryTitle;
	public String summary;
	public String commentarist;


	public Match(String date, Team local, String localScore, Team visit, 
			String visitScore, List<MatchPlayers> players, String summaryTitle,
			String summary, String commentarist) {
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

	public Match() {
	}

	public static List<Match> all() {
		if (matches.isEmpty()) {
			matches.add(Json.fromJson(Json.parse(Files.readFile(new File("app/resources/matchs/1.json")).toString()), Match.class));
			matches.add(Json.fromJson(Json.parse(Files.readFile(new File("app/resources/matchs/2.json")).toString()), Match.class));
			matches.add(Json.fromJson(Json.parse(Files.readFile(new File("app/resources/matchs/3.json")).toString()), Match.class));
			matches.add(Json.fromJson(Json.parse(Files.readFile(new File("app/resources/matchs/4.json")).toString()), Match.class));
			matches.add(Json.fromJson(Json.parse(Files.readFile(new File("app/resources/matchs/5.json")).toString()), Match.class));
			matches.add(Json.fromJson(Json.parse(Files.readFile(new File("app/resources/matchs/6.json")).toString()), Match.class));
		}
		
		return matches;
	}

	public static Match get(Integer index) {
		
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
