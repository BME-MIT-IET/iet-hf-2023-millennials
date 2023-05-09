package test.Defence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import main.DefenceAgent;
import main.DefenceGenetic;
import main.PoisonAgent;
import subjects.Agent;
import subjects.Genetics;
import subjects.Virologist;

public class DefenceAgentTest {
    private DefenceAgent defAgent;
    private ArrayList<Agent> agents;
    
    @Before
    public void initialize(){
        Genetics defgen = new DefenceGenetic();
        defAgent = new DefenceAgent(defgen, 4);
        agents = new ArrayList<>();
        agents.add(new PoisonAgent(null, 0));
        agents.add(new DefenceAgent(null, 0));
        agents.add(new DefenceAgent(null, 0));
        agents.add(new DefenceAgent(null, 0));
        agents.add(defAgent);
    }

    @Test
    public void startEffectTest() {
        Virologist virologist = mock(Virologist.class);
        defAgent.startEffect(virologist);
        verify(virologist, times(1)).setEffectFlag(3);
    }

    @Test
    public void endEffectTest() {
        Virologist virologist = mock(Virologist.class);
        defAgent.endEffect(virologist);
        verify(virologist, times(1)).setEffectFlag(0);
    }

    @Test
    public void infectTest() {
        Virologist target = mock(Virologist.class);
        Virologist sender = mock(Virologist.class);
        
        DefenceAgent mock = Mockito.spy(defAgent);

        mock.infect(target, sender);
        verify(target, times(1)).addEffect(mock, sender);
        verify(mock, times(1)).startEffect(target);
    }

    @Test
    public void isSameAndToStringTest() {
        assertTrue(defAgent.isSame("DefenceAgent"));
        assertTrue(defAgent.toString().equals("DefenceAgent"));
    }

    @Test
    public void tickTest() {
        Iterator<Agent> iter = agents.iterator();
        Virologist virologist = mock(Virologist.class);

        DefenceAgent mock = Mockito.spy(defAgent);

        assertEquals(5, agents.size());

        int lifetime = mock.getLivetime();
        for (int i = 0; i < lifetime; i++) {
            assertEquals(lifetime - i, mock.getLivetime());
            iter.next();
            mock.tick(virologist, iter);
            assertEquals(lifetime - i - 1, mock.getLivetime());
        }
        verify(mock, times(lifetime)).notifyObservers();
        assertEquals(0, mock.getLivetime());
        assertEquals(4, agents.size());
    }

    @Test
    public void tickWithEffectTest() {
        Iterator<Agent> iter = agents.iterator();
        Virologist virologist = mock(Virologist.class);

        DefenceAgent mock = Mockito.spy(defAgent);
        
        mock.startEffect(virologist);

        int lifetime = mock.getLivetime();
        for (int i = 0; i < lifetime; i++) {
            assertEquals(lifetime - i, mock.getLivetime());
            iter.next();
            mock.tick(virologist, iter);
            assertEquals(lifetime - i - 1, mock.getLivetime());
        }

        verify(virologist, times(1)).setEffectFlag(0);
        verify(mock, times(lifetime - 1)).notifyObservers();
        assertEquals(0, mock.getLivetime());
        assertEquals(4, agents.size());
    }
}
