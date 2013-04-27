package models;

import java.util.HashMap;
import java.util.Map;

public class Team {
	
	private static final Map<String, Team> teams = new HashMap<String, Team>();
	
	public String key;
	public String name;
	public String imageURL;
	
	public static Map<String, Team> all() {
		if(teams.isEmpty()) {
			Team team = new Team("la-naranja-mecanica", "La Naranja Mecanica", "la-naranja-mecanica.png");
			teams.put(team.key, team);
			
			team = new Team("descanso-verde", "Descanso Verde", "descanso-verde.png");
			teams.put(team.key, team);
			
			team = new Team("lmds", "Los Mismos de Siempre", "los-mismos-de-siempre.png");
			teams.put(team.key, team);
			
			team = new Team("hacha-y-tiza", "Hacha Y Tiza", "hacha-y-tiza.png");
			teams.put(team.key, team);
			
			team = new Team("las-aguilas-de-niupi", "Las Aguilas de Niupi", "las-aguilas-de-niupi.png");
			teams.put(team.key, team);
			
			team = new Team("pelos", "Pelos FC", "pelos.png");
			teams.put(team.key, team);
			
			team = new Team("cristal", "Cristal FC", "cristal.png");
			teams.put(team.key, team);
		}
		
		return teams;
	}
	
	public static Team get(String teamKey) {
		return all().get(teamKey);
	}

	public Team(String key, String name, String imageURL) {
		super();
		this.key = key;
		this.name = name;
		this.imageURL = imageURL;
	}
	
	public Team() {
		
	}
	
	
}
