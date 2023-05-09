package test.Poison;

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

import main.PoisonAgent;
import subjects.Agent;
import subjects.Virologist;

public class PoisonAgentTest {
    private PoisonAgent poisAgent;
    private ArrayList<Agent> agents;

    @Before
    public void initialize() {
        poisAgent = new PoisonAgent(null, 7);
        agents = new ArrayList<>();
        agents.add(new PoisonAgent(null, 0));
        agents.add(new PoisonAgent(null, 0));
        agents.add(new PoisonAgent(null, 0));
        agents.add(new PoisonAgent(null, 0));
        agents.add(new PoisonAgent(null, 0));
        agents.add(new PoisonAgent(null, 0));
        agents.add(new PoisonAgent(null, 0));
    }

    @Test
    public void startEffectTest() {
        Virologist virologist = mock(Virologist.class);
        poisAgent.startEffect(virologist);
        verify(virologist, times(1)).setEffectFlag(1);
    }

    @Test
    public void endEffectTest() {
        Virologist virologist = mock(Virologist.class);
        poisAgent.endEffect(virologist);
        verify(virologist, times(1)).getEffectFlag();
        verify(virologist, times(1)).checkPoisonEffects();
        verify(virologist, times(1)).setEffectFlag(0);
    }

    @Test
    public void infectTest() {
        Virologist target = mock(Virologist.class);
        Virologist sender = mock(Virologist.class);
        
        PoisonAgent mock = Mockito.spy(poisAgent);

        mock.infect(target, sender);
        verify(target, times(1)).addEffect(mock, sender);
        verify(mock, times(1)).startEffect(target);
    }

    @Test
    public void isSameAndToStringTest() {
        assertTrue(poisAgent.isSame("PoisonAgent"));
        assertTrue(poisAgent.toString().equals("PoisonAgent"));
    }

    public void testTickBase(PoisonAgent mock) {
        Iterator<Agent> iter = agents.iterator();
        Virologist virologist = mock(Virologist.class);
        assertEquals(3, agents.size());
        int lifetime = mock.getLivetime();
        for (int i = 0; i < lifetime; i++) {
            assertEquals(lifetime - i, mock.getLivetime());
            iter.next();
            mock.tick(virologist, iter);
            assertEquals(lifetime - i - 1, mock.getLivetime());
        }
        assertEquals(0, mock.getLivetime());
        assertEquals(2, agents.size());
    } 

    @Test
    public void tickTest() {
        Iterator<Agent> iter = agents.iterator();
        Virologist virologist = mock(Virologist.class);

        PoisonAgent mock = Mockito.spy(poisAgent);

        assertEquals(7, agents.size());

        int lifetime = mock.getLivetime();
        for (int i = 0; i < lifetime; i++) {
            assertEquals(lifetime - i, mock.getLivetime());
            iter.next();
            mock.tick(virologist, iter);
            assertEquals(lifetime - i - 1, mock.getLivetime());
        }
        verify(mock, times(lifetime)).notifyObservers();
        assertEquals(0, mock.getLivetime());
        assertEquals(6, agents.size());
    }

    @Test
    public void tickWithEffectTest() {
        Iterator<Agent> iter = agents.iterator();
        Virologist virologist = mock(Virologist.class);

        PoisonAgent mock = Mockito.spy(poisAgent);
        
        mock.startEffect(virologist);
        assertEquals(7, agents.size());
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
        assertEquals(6, agents.size());
    }
}
