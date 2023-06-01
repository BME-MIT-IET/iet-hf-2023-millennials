package test.UITests;

import UI.MainFrame;

public class UIMain {
    private static MainFrame mainFrame;

    public void initialize(){
        mainFrame = new MainFrame();
        mainFrame.initialize();
    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }
}
