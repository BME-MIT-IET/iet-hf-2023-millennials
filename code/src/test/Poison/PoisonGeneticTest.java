package test.Poison;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import main.Amino;
import main.BearGenetic;
import main.MaximumSubstanceException;
import main.Nukleotid;
import main.PoisonGenetic;
import subjects.Agent;
import subjects.Virologist;

public class PoisonGeneticTest {
    private PoisonGenetic poisGen;
    private Virologist vir;

    @Before
    public void initialize() {
        poisGen = new PoisonGenetic(4, 3);
        vir = new Virologist(
            "Teszt", 
            2, 
            10, 
            null);
    }

    @Test
    public void toStringTest() {
        boolean same = poisGen.toString().equals("PoisonGenetic");
        assertTrue(same);
    }

    @Test
    public void isSameTest() {
        PoisonGenetic newPoisGen = new PoisonGenetic(4, 3);
        boolean isSame = poisGen.isSame(newPoisGen);
        assertTrue(isSame);
    }

    @Test
    public void isNotSameTest() {
        BearGenetic bearGenetic = new BearGenetic(2, 2);
        boolean isNotSame = poisGen.isSame(bearGenetic);
        assertFalse(isNotSame);
    }

    @Test
    public void generateWithMissingSubstanceTest() {
        Virologist mock = Mockito.spy(vir);
        Agent poisAgent = poisGen.generate(mock, 4);
        verify(mock, times(1)).checkSubstanceRequirements(poisGen);
        assertTrue(poisAgent == null);
    }

    @Test
    public void generateWithEnoughSubstanceTest() throws MaximumSubstanceException {
        for (int i = 0; i < 5; i++) vir.addSubstance(new Amino());
        for (int j = 0; j < 5; j++) vir.addSubstance(new Nukleotid());

        Virologist mock = Mockito.spy(vir);
        Agent poisAgent = poisGen.generate(mock, 4);
        assertTrue(poisAgent.isSame("PoisonAgent"));
        verify(mock, times(1)).checkSubstanceRequirements(poisGen);
        verify(mock, times(1)).removeMaterials(poisGen);
    }
}
