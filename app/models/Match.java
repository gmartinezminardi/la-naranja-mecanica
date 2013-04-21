package models;

import java.util.ArrayList;
import java.util.List;

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
			
			List<MatchPlayers> players = new ArrayList<MatchPlayers>();
			players.add(new MatchPlayers(new Player("Fede Regojo", 0, null, 6 ), new Player("Santiago Huernos", 0, null, 6 )));
			players.add(new MatchPlayers(new Player("Mariano Lope", 0, null, 7 ), new Player("Simonelli Hernan", 0, null, 5 )));
			players.add(new MatchPlayers(new Player("Maxi Marquez", 1, null, 6 ), new Player("Foray Facundo", 0, null, 5 )));
			players.add(new MatchPlayers(new Player("Horacio Ricardo", 1, null, 6 ), new Player("Facundo Estevez", 0, null, 5 )));
			players.add(new MatchPlayers(new Player("Santi Fernandez", 0, null, 7 ), new Player("Zamudio Gonzalez", 0, null, 5 )));
			players.add(new MatchPlayers(new Player("Keki Sanchez", 3, null, 8 ), new Player("Santiago Poklepovich", 0, null, 5 )));
			players.add(new MatchPlayers(new Player(null, 0, null, null ), new Player("Federico Vazquez", 1, null, 6 )));
			players.add(new MatchPlayers(new Player(null, 0, null, null ), new Player("Manuel Bulgaria", 0, null, 4 )));
			
			Match match = new Match(
				"09/03/2013 - Fecha 1 - Apertura 2013",
				Team.get("la-naranja-mecanica"), 	"5", 
				Team.get("descanso-verde"), 		"1", 
				players,
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
			
			players = new ArrayList<MatchPlayers>();
			players.add(new MatchPlayers(new Player("Matias Cano", 0, null, 4), new Player("Fede Regojo", 0, null, 6 )));
			players.add(new MatchPlayers(new Player("Mauro Antico", 0, null, 6 ), new Player("Mariano Lope", 1, null, 6 )));
			players.add(new MatchPlayers(new Player("Leandro Caceres", 1, "yellow", 6 ), new Player("Maxi Marquez", 1, "yellow", 7 )));
			players.add(new MatchPlayers(new Player("Federico Perez", 1, null, 6 ), new Player("Trapo Sarán", 5, null, 9 )));
			players.add(new MatchPlayers(new Player("Martin Jacomelli", 6, null, 7 ), new Player("Santi Fernandez", 0, null, 7 )));
			players.add(new MatchPlayers(new Player("Juan Jacomelli", 0, null, 6 ), new Player("Keki Sanchez", 0, null, 5 )));

			match = new Match(
					"16/03/2013 - Fecha 2 - Apertura 2013",
					Team.get("hacha-y-tiza"),			"7", 
					Team.get("la-naranja-mecanica"), 	"8", 
					players,
					"Fiebre Naranja", 
					"Dos pesos pesados se enfrentaban en un gran partido que se viviría como una verdadera final, La Naranja Mecánica frente a Hacha y Tiza. " +
					"Tincho Jacomelli abriría la cuenta a los 6´, pero minutos más tarde Maxi Márquez igualaría tras un potente remate afuera del área. " +
					"Pero inmediatamente responderían los celestes que de contra serían letales gracias a los buenos movimientos de Antico y Cáceres, " +
					"Jacomelli marcaría un doblete y el ya mencionado Cáceres aumentaría la diferencia. Sarán descontaba en la agonía. <br/> " + 
					"La Naranja arrancaría con todo esta segundo tiempo y en una ráfaga de dos minutos lo daría vuelta gracias a los goles de Trapo, Keki y Lope " +
					"para asombro de los rivales que rápidamente descontarían a través de su máximo artillero Jacomelli volviendo a marcar. " +
					"Sin embargo, El Trapo, recién regresado de Europa, sería el héroe del partido con sus goles. " +
					"Hacha buscó y buscó pero las buenas respuestas de Regojo le impidieron al menos llevarse un punto y la gloria fue toda Naranja, que no tiene a Cruyff, pero lo tiene al trapo.", 
					"Maximiliano Rodriguez");
			matches.add(match);
			
			players = new ArrayList<MatchPlayers>();
			players.add(new MatchPlayers(new Player("Fede Regojo", 0, null, 6), new Player("Pedro Sacon", 0, null, 5 )));
			players.add(new MatchPlayers(new Player("Yiyo Martinez", 2, "yellow", 6), new Player("Lucas Gagliote", 1, null, 6 )));
			players.add(new MatchPlayers(new Player("Maxi Marquez", 1, null, 6), new Player("Alejandro Soriano", 2, null, 7 )));
			players.add(new MatchPlayers(new Player("Rodrigo Saran", 9, null, 10), new Player("Gonzalo Clerici", 0, null, 6 )));
			players.add(new MatchPlayers(new Player("Santi Fernandez", 0, null, 6), new Player("Diego Alvarez", 0, null, 5 )));
			players.add(new MatchPlayers(new Player("Keki Sanchez", 1, null, 7), new Player("Alejandro Lacolla", 0, null, 7 )));
			players.add(new MatchPlayers(new Player("Mariano Lope", 1, null, 7), new Player(null, 0, null, null )));

			match = new Match(
					"23/03/2013 - Fecha 3 - Apertura 2013", 
					Team.get("la-naranja-mecanica"), 	"14",
					Team.get("lmds"), 					"3", 
					players,
					"A Todo Trapo", 
					"La Naranja Mecánica goleó a LMDS por 14 a 3. No tuvo mucha chance LMDS, empezó perdiendo por 3 goles, todos de Rodrigo Saran. " +
					"Después siguió ampliando la ventaja sin darle respiro al rival M. Márquez ponía el 4 a 0 a los 8 minutos. Mariano López anotó el quinto. " +
					"La Naranja apretó y cada llegada era un golpe bajo para su rival, que no se recupero hasta el final que descontó Alejandro Soriano con un golazo de media chilena afuera del area. <br/>" +
					"En el segundo tiempo volvió el Trapo a la cancha y siguió sumando 4 goles más otro de E. Sánchez para el 10 a 1. " +
					"Al minuto 13 un descuido de la defensa llevaría al descuento de Lucas Gagliote. " +
					"Pero 2 min después vuelve a convertir La Naranja esta vez 2 goles de G. Martínez, y sigue sumando Saran otro gol más al minuto 18. " +
					"Cerca del final descuenta Alejandro Soriano de penal, y para cerrar la goleada de la Naranja R.Saran cierra el 14 a 3.", 
					"Jonatan Leites");
			matches.add(match);
			
			players = new ArrayList<MatchPlayers>();
			players.add(new MatchPlayers(new Player("Fernando Lamas", 0, "yellow", 6), new Player("Fede Ribera", 0, null, 6 )));
			players.add(new MatchPlayers(new Player("Federico Caldara", 0, null, 7 ), new Player("Mariano Lope", 1, null, 7 )));
			players.add(new MatchPlayers(new Player("Mariano Sarago", 0, null, 6 ), new Player("Maxi Marquez", 0, null, 6 )));
			players.add(new MatchPlayers(new Player("Federico Burlaka", 0, null, 6 ), new Player("Trapo Sarán", 3, "yellow", 7 )));
			players.add(new MatchPlayers(new Player("Mariano Gomez", 2, null, 7 ), new Player("Yiyo Martinez", 1, null, 7 )));
			players.add(new MatchPlayers(new Player("Martin Sisca", 1, null, 7 ), new Player("Keki Sanchez", 0, null, 7 )));
			players.add(new MatchPlayers(new Player("Martin Saban", 1, null, 7 ), new Player("Horacio Ricardo", 0, null, 6 )));
			players.add(new MatchPlayers(new Player("Guillermo Moreira", 0, null, 6 ), new Player(null, 0, null, null )));

			match = new Match(
					"06/04/2013 - Fecha 4 - Apertura 2013", 
					Team.get("las-aguilas-de-niupi"),	"4", 
					Team.get("la-naranja-mecanica"), 	"5", 
					players,
					"Sobre el final", 
					"Las Águilas del Niupi reciben a la Naranja Mecánica a las 13 horas jugando la Categoría “A” del torneo de los Sábados. " +
					"Se espera un muy buen partido, por el buen nivel de los equipos y jugadores. " +
					"Fue un primer tiempo parejo donde abre el partido las Águilas con el gol de Mariano Gómez a los 8 minutos, " +
					"4 minutos después con el ingreso del “trapo” R. Saran llega el empate y a los 15 minutos pone a su equipo arriba. " +
					"En una de las últimas del primer tiempo se pondrían iguales con un Bombazo de Martin Sisca que de un tiro libre pone el 2 a 2.<br/> " +   
					"En el segundo tiempo se pone arriba la naranja a los 2 minutos con el gol de Yiyo Martínez, pero 2 minutos después empatan las Águilas con el gol de Martin Saban de contrataque. " +
					"Es un partido ida y vuelta, muy parejo, pero la naranja con el correr del tiempo empezó a presionar mas y a tomar el control. " +
					"En el minuto 15 R. Saran pone arriba a la Naranja otra vez, minuto 18 con un puntazo cruzado empata el partido 4 a 4, " +
					"pero parecía terminar en empate casi no queda tiempo pero en un contra ataque de la naranja pase cruzado y " +
					"entra Mariano López para poner el 5 a 4 y darle los 2 puntos a la naranja en un Partido Muy parejo y reñido.", 
					"Jonatan Leites");
			matches.add(match);
			
			players = new ArrayList<MatchPlayers>();
			players.add(new MatchPlayers(new Player("Fede Ribera", 0, "yellow", 6), new Player("Pablo Zvaliauskas", 0, null, 6 )));
			players.add(new MatchPlayers(new Player("Yiyo Martinez", 1, null, 6), new Player("Fernando Sosa", 0, null, 5 )));
			players.add(new MatchPlayers(new Player("Santi Fernandez", 1, null, 6), new Player("Mariano Lanzo", 0, null, 6 )));
			players.add(new MatchPlayers(new Player("Rodrigo Saran", 1, null, 6), new Player("Matias Lanzi", 0, null, 5 )));
			players.add(new MatchPlayers(new Player("Santi Fernandez", 0, null, 6), new Player("Andres Zvaliauskas", 0, null, 5 )));
			players.add(new MatchPlayers(new Player("Keki Sanchez", 0, null, 6), new Player("Gaston Villaschi", 0, null, 7 )));
			players.add(new MatchPlayers(new Player("Mariano Lope", 0, null, 6), new Player("Gabriel Zvaliauskas", 2, null, 7 )));
			players.add(new MatchPlayers(new Player(null, 0, null, null), new Player("Hernan Valles", 0, null, 6 )));

			match = new Match(
					"13/04/2013 - Fecha 5 - Apertura 2013",
					Team.get("la-naranja-mecanica"), 	"3", 
					Team.get("pelos"),					"2", 
					players,
					"Se complicó solo", 
					"Bien tempranito se jugaba el partido entre uno de los punteros, La Naranja Mecánica, y el siempre complicado Pelos. " +
					"A los 5 minutos de comenzado el encuentro llegaría el tanto de Gabriel Zvaliauskas quien simplemente tendría que acertarle al arco luego de robar en la mitad de cancha. " +
					"La Naranja Mecánica se hacía dueño del juego. Ezequiel Sánchez rompería el palo a los 9 minutos. " +
					"Tres minutos después llegaría el empate por medio de Santiago Fernández aprovechando un corner. <br/>" +
					"A los 4 minutos de la segunda parte Rodrigo Sarán aprovecharía un buen pase de Federico Ribera para dejar a los de casaca naranja arriba en el marcador. " +
					"Guillermo Martínez estiraría la diferencia a los 7 minutos. " +
					"Pelos no encontraba la forma de empatar el partido y por eso Gabriel Zvaliauskas pasaría al arco a cinco minutos del cierre. " +
					"La Naranja Mecánica tenía el partido controlado sin embargo un penal que Gabriel Zvaliauskas cambiaría por gol iba a ponerle pimienta al final del partido. " +
					"La Naranja sigue como puntero junto con Humildad y Talento que ganaría sin siquiera jugar gracias al faltazo (cacona) de los pibes de Flojo Licuado.", 
					"Conte-Grand, Tomás");
			matches.add(match);
			
			players = new ArrayList<MatchPlayers>();
			players.add(new MatchPlayers(new Player("Alejandro Alvarez", 0, null, 4), new Player("Fede Regojo", 0, null, 6 )));
			players.add(new MatchPlayers(new Player("Martin Salgado", 0, null, 4), new Player("Mariano Lope", 2, null, 7 )));
			players.add(new MatchPlayers(new Player("Matias Burgo", 0, "yellow", 4), new Player("Maxi Marquez", 2, null, 8 )));
			players.add(new MatchPlayers(new Player("Ariel Sassone", 0, null, 6 ), new Player("Trapo Sarán", 5, null, 8 )));
			players.add(new MatchPlayers(new Player("Santiago Gimenez", 0, null, 5), new Player("Yiyo Martinez", 0, null, 6 )));
			players.add(new MatchPlayers(new Player(null, 0, null, null), new Player("Keki Sanchez", 0, null, 6 )));
			players.add(new MatchPlayers(new Player(null, 0, null, null), new Player("Horacio Ricardo", 1, null, 6 )));
			
			match = new Match(
					"20/04/2013 - Fecha 6 - Apertura 2013",
					Team.get("cristal"),					"0", 
					Team.get("la-naranja-mecanica"), 		"10", 
					players,
					" ", 
					" ", 
					"Jonatan Leites");
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
		return local.name + " vs " + visit.name;
	}

}
