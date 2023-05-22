package UI;

import javax.swing.*;

import subjects.Game;

import java.awt.*;
import java.awt.event.*;

public class NewVirologistDialog extends JDialog {

    private JPanel panel;
    private JLabel nameLabel;
    private JTextField nameField;
    private JButton okButton;

    public NewVirologistDialog() {
        setSize(300, 100);
        setLocation(400, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setModalityType(ModalityType.APPLICATION_MODAL);
        setTitle("Virológus felvétele");
        setResizable(false);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));

        nameLabel = new JLabel("Név:");
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(nameLabel);
        nameField = new JTextField(10);
        panel.add(nameField);

        okButton = new JButton("OK");
        okButton.setName("okButton");
        okButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        okButton.addActionListener(new OkButtonActionListener(nameField));
        panel.add(okButton);

        add(panel);
        setVisible(true);
    }
    
    class OkButtonActionListener implements ActionListener {
        private JTextField nameField2;
        public OkButtonActionListener(JTextField nameField) {
            this.nameField2 = nameField;
        }

        public void actionPerformed(ActionEvent e) {
            Game.createVirologist(nameField.getText());
            dispose();
        }
    }

    public JPanel getPanel() {
        return panel;
    }
    public JLabel getNameLabel() {
        return nameLabel;
    }
    public JTextField getNameField() {
        return nameField;
    }
    public void setNameField(String text) {
        this.nameField.setText(text);
    }
    public JButton getOkButton() {
        return okButton;
    }
}
