package test.subjects;

import main.Axe;
import main.BearAgent;
import subjects.Game;
import subjects.Virologist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AxeTest {
    private Game game;
    private Axe axe;
    private BearAgent bearAgent;
    private Virologist virologist;
    @Before
    public void initialize() {
        game = new Game();
        axe = new Axe();
        bearAgent = new BearAgent();
        virologist = new Virologist("Tester", 3, 3, null);
        game.addPlayer(virologist);
    }

    @Test
    public void testUseFirstTime(){
        bearAgent.startEffect(virologist);
        axe.startEffect(virologist);
        assertEquals(null, game.getPlayers());
    }

    @Test
    public void testUseMultipleTime(){
        bearAgent.startEffect(virologist);
        axe.startEffect(virologist);
        assertEquals(null, game.getPlayers());
    }

    @Test
    public void testToString() {
        String axeName = "Axe";
        assertEquals(axeName, axe.toString());
    }
}
