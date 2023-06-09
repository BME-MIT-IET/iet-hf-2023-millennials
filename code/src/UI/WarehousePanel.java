package UI;

import javax.swing.ImageIcon;

import main.Coordinate;
import subjects.Field;

public class WarehousePanel extends FieldPanel {
    public WarehousePanel(Coordinate coordinate, Field field) {
        super(coordinate, field);
        if(getClass().getResource("images/field_warehouse_icon.png")!=null){
            field_type_icon.setIcon(new ImageIcon(getClass().getResource("images/field_warehouse_icon.png")));
        }
    }
}
