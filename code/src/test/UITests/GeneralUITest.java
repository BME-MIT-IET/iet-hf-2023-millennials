package test.UITests;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.JMenu;

import org.junit.Before;
import org.junit.Test;
import javax.swing.SwingUtilities;

import UI.MenuBar;
import junit.framework.TestCase;

public class GeneralUITest extends TestCase{
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
    public void testMenuBar() throws Exception{
        assertNotNull(menu);
        assertEquals(3,menu.getItemCount());
        assertEquals("New Virologist", menu.getItem(0).getText());
        assertEquals("Start", menu.getItem(1).getText());
        assertEquals("Exit", menu.getItem(2).getText());
    }

    @Test(timeout = 2000)
    public void testNewVirologist() throws Exception{
        menu.getItem(1).doClick();
        Thread.sleep(500);
        menu.getItem(0).doClick();
        assertEquals("Név:",menuBar.getNewVirologistDialog().getNameLabel().getText());
        menuBar.getNewVirologistDialog().getNameField().setText("Test");
        assertEquals("Test",menuBar.getNewVirologistDialog().getNameField().getText());
    }

    @Test
    public void testExit() throws Exception{
        menuBar.setTest(true);
        menu.getItem(2).doClick();
        assertTrue(menuBar.isExitCalled());
    }
}

