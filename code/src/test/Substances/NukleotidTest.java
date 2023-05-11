package test.Substances;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

import main.MaximumSubstanceException;
import main.Nukleotid;
import subjects.Virologist;

@RunWith(JUnit4.class)
public class NukleotidTest {
    private Nukleotid nukleotid1;
    private Nukleotid nukleotid2;
    private Virologist virologist;

    @Before
    public void initialize() {
        nukleotid1 = new Nukleotid();
        nukleotid2 = new Nukleotid();
        virologist = new Virologist("Tester", 1, 1, null);
    }

    @Test
    public void testPickUp() throws Exception{
        nukleotid1.pickUp(virologist);
        assertEquals(1, virologist.countSubstance(nukleotid1));
    }

    @Test(expected = MaximumSubstanceException.class)
    public void testPickUpWhenThereIsNoSpace() throws Exception{
        nukleotid1.pickUp(virologist);
        nukleotid2.pickUp(virologist);
    }
}
