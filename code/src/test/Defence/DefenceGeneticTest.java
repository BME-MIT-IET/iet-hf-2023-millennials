package test.Defence;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import main.Amino;
import main.DefenceGenetic;
import main.MaximumSubstanceException;
import main.Nukleotid;
import subjects.Agent;
import subjects.Virologist;

public class DefenceGeneticTest {
    private DefenceGenetic defGen;
    private Virologist vir;

    @Before
    public void initialize() {
        defGen = new DefenceGenetic(2, 3);
        vir = new Virologist(
            "Teszt", 
            2, 
            10, 
            null);
    }

    @Test
    public void toStringTest() {
        boolean same = defGen.toString().equals("DefenceGenetic");
        assertTrue(same);
    }

    @Test
    public void isSameTest() {
        DefenceGenetic newDefGen = new DefenceGenetic(2, 3);
        boolean isSame = defGen.isSame(newDefGen);
        assertTrue(isSame);
    }

    @Test
    public void generateWithMissingSubstanceTest() {
        Virologist mock = Mockito.spy(vir);
        Agent defAgent = defGen.generate(mock, 4);
        verify(mock, times(1)).checkSubstanceRequirements(defGen);
        assertTrue(defAgent == null);
    }

    @Test
    public void generateWithEnoughSubstanceTest() throws MaximumSubstanceException {
        for (int i = 0; i < 3; i++) vir.addSubstance(new Amino());
        for (int j = 0; j < 5; j++) vir.addSubstance(new Nukleotid());

        Virologist mock = Mockito.spy(vir);
        Agent defAgent = defGen.generate(mock, 4);
        assertTrue(defAgent.isSame("DefenceAgent"));
        verify(mock, times(1)).checkSubstanceRequirements(defGen);
        verify(mock, times(1)).removeMaterials(defGen);
    }
}
