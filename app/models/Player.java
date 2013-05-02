package models;

public class Player {
	public String name;
	public String card;
	public Integer goals;
	public Integer score;

	public Player(String name, Integer goals, String card, Integer score) {
		super();
		this.name = name;
		this.goals = goals;
		this.card = card;
		this.score = score;
	}

	public Player() {
		super();
	}
	
}
