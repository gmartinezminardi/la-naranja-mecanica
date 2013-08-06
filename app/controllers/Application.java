package controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import models.Game;
import play.api.libs.Files;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

	public static final List<Game> matches = new ArrayList<Game>();
	public static Map <String, List<LinkedHashMap<String,String>>> players = new HashMap<String, List<LinkedHashMap<String,String>>>();
	public static Map <String, List<LinkedHashMap<String,String>>> positions = new HashMap<String, List<LinkedHashMap<String,String>>>();

	public static Result index() {
		return ok(views.html.index.render());
	}

	public static Result game(String year, String tournament, String index) {
		Game game = Game.get(year, tournament, new Integer(index));
		if (game == null)
			return ok(views.html.index.render());

		return ok(views.html.game.render(game.toString(), game));
		
	}

	@SuppressWarnings({ "unchecked" })
	public static Result stats(String year, String tournament) {
		
		String key = getTournamentKey(year, tournament);
		
		if (players.get(key) == null) {
			File file = new File(getPath(year, tournament, "stats.json"));
			List<LinkedHashMap<String,String>> playerList = Json.fromJson(Json.parse(Files.readFile(file).toString()), ArrayList.class);
			Collections.sort(playerList, getComparator("goals"));
			players.put(key, playerList);
		}
		
		if (positions.get(key) == null) {
			File file = new File(getPath(year, tournament, "positions.json"));
			List<LinkedHashMap<String,String>> teamsList = Json.fromJson(Json.parse(Files.readFile(file).toString()), ArrayList.class);
			Collections.sort(teamsList, getComparator("pts"));
			positions.put(key, teamsList);
		}
		
		return ok(views.html.stats.index.render("Estadisticas", Game.all(year, tournament), players.get(key), year, tournament, positions.get(key)));
	}

	public static Result data() {
		return ok(views.html.data.render("Algunos Datos"));
	}

	public static Result photos() {
		return ok(views.html.index.render());
	}
	
	public final static Comparator<LinkedHashMap<String, String>> getComparator(final String key) {
		Comparator<LinkedHashMap<String,String>> comparator = new Comparator<LinkedHashMap<String,String>>() {
			@Override
			public int compare(LinkedHashMap<String,String> o1, LinkedHashMap<String,String> o2) {
				return new Integer (o2.get(key)) - new Integer (o1.get(key));
			}
		};
		
		return comparator;
	}
	
	public static String getPath(String year, String tournament, String file) {
		return String.format("app/resources/%s/%s/%s", year, tournament, file);
	}
	
	public static String getTournamentKey(String year, String tournament) {
		return tournament + "-" + year;
	}
}
