package UI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import main.Coordinate;
import main.IncorrectParameterException;
import subjects.Field;
import subjects.Game;

import java.awt.Color;
import java.awt.event.*;

public class FieldPanel extends JPanel {
	Field field;
	JLabel field_type_icon;
	JButton field_select_button;

    public FieldPanel(Coordinate coordinate, Field field) {
		this.field = field;
		setOpaque(false);
		setFocusable(false);
		setBackground(Color.WHITE);
		setBorder(new LineBorder(new Color(64, 64, 64), 4));
		setBounds(coordinate.getX(), coordinate.getY(), 144, 134);
		setLayout(null);

		field_type_icon = new JLabel("");
		field_type_icon.setIcon(new ImageIcon(""));
		field_type_icon.setBounds(10, 11, 124, 112);
		add(field_type_icon);

		field_select_button = new JButton("");
		field_select_button.setOpaque(false);
		field_select_button.setBorder(null);
		field_select_button.setFocusable(false);
		field_select_button.setBounds(10, 11, 124, 79);
		field_select_button.setBackground(null);
		add(field_select_button);
		
		field_select_button.addActionListener(new MoveActionListener(field));
    }

	class MoveActionListener implements ActionListener {
		private Field field;
		public MoveActionListener(Field field) {
			this.field = field;
		}
		
		public void actionPerformed(ActionEvent e) {
			try {
				Game.selectedVirologist.move(field);
				Game.selectedVirologist = null;
			} 
			catch(IncorrectParameterException ex) {
				Game.errorMessage(ex.getMessage());
			}
			catch(NullPointerException ex) {
				Game.errorMessage("No virologist is selected");
			}
		}
	}
}
