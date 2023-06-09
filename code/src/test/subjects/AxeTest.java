package test.subjects;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import main.Axe;
import subjects.Virologist;

@RunWith(JUnit4.class)
public class AxeTest {
    private Axe axe;
    private Virologist virologist1;
    private Virologist virologist2;
    @Before
    public void initialize() {
        axe = new Axe();
        virologist1 = mock(Virologist.class);
        virologist2 = mock(Virologist.class);
    }

    @Test
    public void testUseFirstTime(){
        axe.use(virologist1);
        verify(virologist1, times(1)).axeHit();
    }

    @Test
    public void testUseMultipleTime(){
        axe.use(virologist1);
        axe.use(virologist2);
        verify(virologist1, times(1)).axeHit();
    }

    @Test
    public void testToString() {
        String axeName = "Axe";
        assertEquals(axeName, axe.toString());
    }
}
