import models.Game;

import org.junit.Test;

import play.libs.Json;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    @Test
    public void getJSon() {
    	Game match = Game.get(1);
    	System.out.println(Json.stringify(Json.toJson(match)));
    }
   
}
