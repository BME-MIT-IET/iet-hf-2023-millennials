package test.Substances;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import main.Amino;
import main.Nukleotid;

@RunWith(JUnit4.class)
public class SubstanceTest {
    private Amino amino1;
    private Amino amino2;
    private Nukleotid nukleotid;

    @Before
    public void initialize() {
        amino1 = new Amino();
        amino2 = new Amino();
        nukleotid = new Nukleotid();
    }

    @Test
    public void testIsSameWhenItIsSame(){
        boolean same = amino1.isSame(amino2);
        assertTrue(same);
    }

    @Test
    public void testIsSameWhenItIsNotSame(){
        boolean notSame = amino1.isSame(nukleotid);
        assertFalse(notSame);
    }
}
