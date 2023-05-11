package test.Substances;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import main.Amino;
import main.MaximumSubstanceException;
import subjects.Virologist;

@RunWith(JUnit4.class)
public class AminoTest {
    private Virologist virologist;
    private Amino amino1;
    private Amino amino2;

    @Before
    public void initialize() {
        virologist = new Virologist("Tester", 1, 1, null);
        amino1 = new Amino();
        amino2 = new Amino();
    }

    @Test
    public void testPickUp() throws Exception{
        amino1.pickUp(virologist);
        assertEquals(1, virologist.countSubstance(amino1));
    }

    @Test(expected = MaximumSubstanceException.class)
    public void testPickUpWhenThereIsNoSpace() throws Exception{
        amino1.pickUp(virologist);
        amino2.pickUp(virologist);
    }
}
