package test.UITests;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JMenu;

import org.junit.Before;
import org.junit.Test;

import UI.MenuBar;
import junit.framework.TestCase;
import subjects.Field;
import subjects.Game;

public class MenuBarTest extends TestCase{
    private JMenu menu;
    private MenuBar menuBar;

    @Before
    public void setUp() {
        UIMain app = new UIMain();
        app.initialize();
        menu = app.getMainFrame().getUIMenuBar().getMnNewMenu();
        menuBar = app.getMainFrame().getUIMenuBar();
    }

    
    @Test
    public void testStart() throws Exception{
        Game.stopTimer(null);
        menu.getItem(1).doClick();
        ArrayList<Field> fields = Game.getMap().getFields();
        assertEquals(25,fields.size());
    }

    @Test
    public void testMenuBar() throws Exception{
        assertNotNull(menu);
        assertEquals(3,menu.getItemCount());
        assertEquals("New Virologist", menu.getItem(0).getText());
        assertEquals("Start", menu.getItem(1).getText());
        assertEquals("Exit", menu.getItem(2).getText());
    }

    @Test
    public void testNewVirologist() throws Exception{
        if(Game.getMap()==null || Game.getMap().getFields().size()==0){
            ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
            Thread testThread = Thread.currentThread();
            executor.schedule(testThread::interrupt, 2, TimeUnit.SECONDS);
            menu.getItem(1).doClick();
            menu.getItem(0).doClick();

            assertEquals("Név:",menuBar.getNewVirologistDialog().getNameLabel().getText());
            menuBar.getNewVirologistDialog().getNameField().setText("Test");
            assertEquals("Test",menuBar.getNewVirologistDialog().getNameField().getText());
        }
    }

    @Test
    public void testMap() throws Exception{
        if(Game.getMap()==null || Game.getMap().getFields().size()==0){
            menu.getItem(1).doClick();
            ArrayList<Field> fields = Game.getMap().getFields();
    
            assertEquals("F1", fields.get(0).getName());
            assertEquals("F2", fields.get(1).getName());
            assertEquals("W1", fields.get(2).getName());
            assertEquals("F3", fields.get(3).getName());
            assertEquals("L1", fields.get(4).getName());
            assertEquals("F4", fields.get(5).getName());
            assertEquals("S1", fields.get(6).getName());
            assertEquals("F5", fields.get(7).getName());
            assertEquals("L2", fields.get(8).getName());
            assertEquals("W2", fields.get(9).getName());
            assertEquals("L3", fields.get(10).getName());
            assertEquals("W3", fields.get(11).getName());
            assertEquals("L4", fields.get(12).getName());
            assertEquals("F6", fields.get(13).getName());
            assertEquals("L5", fields.get(14).getName());
            assertEquals("F7", fields.get(15).getName());
            assertEquals("S2", fields.get(16).getName());
            assertEquals("F8", fields.get(17).getName());
            assertEquals("S3", fields.get(18).getName());
            assertEquals("L6", fields.get(19).getName());
            assertEquals("L7", fields.get(20).getName());
            assertEquals("S4", fields.get(21).getName());
            assertEquals("F9", fields.get(22).getName());
            assertEquals("W4", fields.get(23).getName());
            assertEquals("S5", fields.get(24).getName());
        }
    }

    @Test
    public void testExit() throws Exception{
        menuBar.setTest(true);
        menu.getItem(2).doClick();
        assertTrue(menuBar.isExitCalled());
    }

}

