package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Game;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

	public static final List<Game> matches = new ArrayList<Game>();

	public static Result index() {
		return ok(views.html.index.render());
	}

	public static Result game(String index) {
		Game game = Game.get(new Integer(index));
		if (game == null)
			return ok(views.html.index.render());

		return ok(views.html.game.render(game.toString(), game));
		
	}

	public static Result stats() {
		return ok(views.html.stats.index.render("Estadisticas"));
	}

	public static Result data() {
		return ok(views.html.index.render());
	}

	public static Result photos() {
		return ok(views.html.index.render());
	}

}
