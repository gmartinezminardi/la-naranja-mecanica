package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Match;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
	
	public static final List<Match> matches = new ArrayList<Match>();
	
	public static Result index() {
		return ok(views.html.index.render());
	}
	
	public static Result tournament(String index) {
		Match match = Match.get(new Integer(index));
		if(match == null)
			return notFound();
		
		return ok(views.html.tournament.render(match.toString(), match));
	}
	
	public static Result fixture() {
		return ok(views.html.fixture.render("Fixture"));
	}

}
