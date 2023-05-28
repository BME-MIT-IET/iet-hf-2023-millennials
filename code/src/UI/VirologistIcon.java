package UI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class VirologistIcon extends JLabel {
    public VirologistIcon() {
        super("");
        if(getClass().getResource("images/virologist_icon_field.png")!=null){
            setIcon(new ImageIcon(getClass().getResource("images/virologist_icon_field.png")));
        }
	    setBounds(75, 61, 124, 112);
    }
}
