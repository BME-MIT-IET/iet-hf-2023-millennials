package test.UITests;

import javax.swing.JMenu;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class GeneralUITest extends TestCase{
    private JMenu menu;

    @Before
    public void setUp() {
        UIMain app = new UIMain();
        app.initialize();
        menu = app.getMainFrame().getUIMenuBar().getMnNewMenu();
    }

    @Test
    public void testMenuBar() throws Exception{
        assertNotNull(menu);
        assertEquals(3,menu.getItemCount());
        assertEquals("New Virologist", menu.getItem(0).getText());
        assertEquals("Start", menu.getItem(1).getText());
        assertEquals("Exit", menu.getItem(2).getText());
    }
}

