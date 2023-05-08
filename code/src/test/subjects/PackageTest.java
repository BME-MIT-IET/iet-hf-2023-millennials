package test.subjects;

import main.Package;
import subjects.Virologist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PackageTest {
    private Package package1;
    private Virologist virologist;
    @Before
    public void initialize() {
        package1 = new Package();
        virologist = new Virologist("Tester", 3, 3, null);
    }

    @Test
    public void testStartEffect(){
        int maxSubstance = virologist.getMaxSubstance();
        package1.startEffect(virologist);
        assertEquals(maxSubstance + 5, virologist.getMaxSubstance());
    }

    @Test
    public void testEndEffect(){
        int maxSubstance = virologist.getMaxSubstance();
        package1.endEffect(virologist);
        assertEquals(maxSubstance - 5, virologist.getMaxSubstance());
    }

    @Test
    public void testToString() {
        String packageName = "Package";
        assertEquals(packageName, package1.toString());
    }
}
