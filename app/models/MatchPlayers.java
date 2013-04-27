package models;


public class MatchPlayers {
	public MatchPlayers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MatchPlayers(Player local, Player visit) {
		super();
		this.local = local;
		this.visit = visit;
	}
	
	public Player local;
	public Player visit;
}
