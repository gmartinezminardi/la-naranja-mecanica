package models;


public class GamePlayers {
	
	public Player local;
	public Player visit;
	
	public GamePlayers() {
		super();
	}
	
	public GamePlayers(Player local, Player visit) {
		super();
		this.local = local;
		this.visit = visit;
	}

}
