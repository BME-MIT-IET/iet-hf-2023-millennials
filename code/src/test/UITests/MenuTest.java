package test.UITests;

import javax.swing.JMenu;

import org.junit.Before;
import org.junit.Test;
import UI.MenuBar;
import junit.framework.TestCase;

public class MenuTest extends TestCase{
    private MenuBar menuBar;
    private JMenu menu;

    @Before
    public void setUp() {
        UIMain app = new UIMain();
        app.initialize();
        menuBar = app.getMainFrame().getUIMenuBar();
        menu = app.getMainFrame().getUIMenuBar().getMnNewMenu();
    }

    @Test
    public void testExit() {
        menuBar.setTest(true);
        menu.getItem(2).doClick();
        assertTrue(menuBar.isExitCalled());
    }
}
