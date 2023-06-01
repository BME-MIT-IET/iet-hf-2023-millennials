package test.subjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import main.Gloves;
import subjects.Virologist;

@RunWith(JUnit4.class)
public class GlovesTest {
    private Gloves gloves;
    private Virologist virologist;
    @Before
    public void initialize() {
        gloves = new Gloves();
        virologist = new Virologist("Tester", 3, 3, null);
        virologist.addEquipment(gloves);
    }

    @Test
    public void testUseOnce(){
        gloves.use(virologist);
        assertEquals(1, virologist.getEquipments().size());
    }

    @Test
    public void testUseMultipleTime(){
        gloves.use(virologist);
        gloves.use(virologist);
        gloves.use(virologist);
        assertEquals(0, virologist.getEquipments().size());
    }

    @Test
    public void testToString() {
        String glovesName = "Gloves";
        assertEquals(glovesName, gloves.toString());
    }
}
