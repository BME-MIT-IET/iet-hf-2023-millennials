package UI;

import javax.swing.ImageIcon;

import main.Coordinate;
import subjects.Field;

public class LaboratoryPanel extends FieldPanel {
    public LaboratoryPanel(Coordinate coordinate, Field field) {
        super(coordinate, field);
        if(getClass().getResource("images/field_lab_icon.png")!=null){
            field_type_icon.setIcon(new ImageIcon(getClass().getResource("images/field_lab_icon.png")));
        }
    }
}
