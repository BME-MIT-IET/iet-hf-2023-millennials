package test.subjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import main.Cape;
import subjects.Virologist;

@RunWith(JUnit4.class)
public class CapeTest {
    private Cape cape;
    private Virologist virologist;
    @Before
    public void initialize() {
        cape = new Cape();
        virologist = new Virologist("Tester", 3, 3, null);
    }

    @Test
    public void testStartEffect(){
        double defRate = virologist.getDefenseRating();
        cape.startEffect(virologist);
        assertEquals(defRate * 0.177, virologist.getDefenseRating(), 0.1);
    }

    @Test
    public void testEndEffect(){
        double defRate = virologist.getDefenseRating();
        cape.endEffect(virologist);
        assertEquals(defRate / 0.177, virologist.getDefenseRating(), 0.1);
    }

    @Test
    public void testToString() {
        String capeName = "Cape";
        assertEquals(capeName, cape.toString());
    }
}
