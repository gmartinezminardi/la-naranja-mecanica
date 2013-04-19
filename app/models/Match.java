package models;

import java.util.ArrayList;
import java.util.List;

public class Match {
	private static final List<Match> matches = new ArrayList<Match>();

	public String localTeam;
	public String visitTeam;
	public String localScore;
	public String visitScore;

	public List<String> players;

	public String summaryTitle;
	public String summary;
	public String commentarist;

	public Match(String localTeam, String visitTeam, String localScore, String visitScore, List<String> players, String summaryTitle, String summary,
			String commentarist) {
		super();
		this.localTeam = localTeam;
		this.visitTeam = visitTeam;
		this.localScore = localScore;
		this.visitScore = visitScore;
		this.players = players;
		this.summaryTitle = summaryTitle;
		this.summary = summary;
		this.commentarist = commentarist;
	}

	public Match() {
	}

	public static List<Match> all() {
		if (matches.isEmpty()) {

			Match match = new Match(
				"La Naranja Mecánica", 
				"Descanso Verde", 
				"5", "1", 
				new ArrayList<String>(), 
				"En 4 minutos liquidó la historia", 
				"En otro partido por la primera fecha en la máxima categoría se enfrentaban La naranja Mecánica contra Descanso Verde. " +
				"El partido empezaría con el tanto de Sánchez a los 3' primeros minutos de juego. " +
				"Luego el partido estuvo parejo a pesar de que termino ganando la primera etapa la naranja., " +
				"porque Descanso verde inquieto e hizo temblar el arco en varias ocasiones. " +
				"En el final la naranja encontraría de nuevo el rumbo y terminaría de la mejor manera creando buenas situaciones.<br/> " +
				"En el segundo tiempo Vázquez a los 6' minutos de juego empataría el partido y le daría un condimento a esta etapa. " +
				"Pero le duro poco las esperanzas al conjunto celeste, porque vendría la seguidilla de goles de Sánchez x2 que darían vuelta el partido y " +
				"abrió el camino para que vengan los goles de Márquez y Magallanes. Todo esto pasó en cuatro minutos de juego, " +
				"la naranja en tan poco tiempo saco una gran ventaja y también gano el dominio de pelota y hasta el final del partido llevo el partido a su antojo. " +
				"Y sonaría el pitido final y la naranja ganaría por 5 a 1.", 
				"Francisco Rolón");
			
			matches.add(match);

			match = new Match("Hacha y Tiza", "La Naranja Mecánica", "7", "8", new ArrayList<String>(), "Cronica", "", "");
			matches.add(match);

			match = new Match("La Naranja Mecánica", "LMDS", "14", "3", new ArrayList<String>(), "Cronica", "", "");
			matches.add(match);

			match = new Match("Las Aguilas de Niupi", "La Naranja Mecánica", "4", "5", new ArrayList<String>(), "Cronica", "", "");
			matches.add(match);

			match = new Match("Pelos FC", "La Naranja Mecánica", "2", "3", new ArrayList<String>(), "Cronica", "", "");
			matches.add(match);

			match = new Match("La Naranja Mecánica", "Cristal", "", "7", new ArrayList<String>(), "Cronica", "", "");
			matches.add(match);

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
		return localTeam + " vs " + visitTeam;
	}

}
