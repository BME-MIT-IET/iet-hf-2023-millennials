package test.subjects;

import main.Cape;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CapeTest {
    private Cape testCape;
    @Before
    public void initialize() {
        testCape = new Cape();
    }

    @Test
    public void testToString() {
        assert testCape.toString().equals("aape");
    }
}
