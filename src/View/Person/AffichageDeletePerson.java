package View.Person;

import Controller.PersonController;
import Model.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AffichageDeletePerson extends JFrame {
     JLabel labelId = new JLabel();
     TextField textLabelId = new TextField();
     Button okButton = new Button();

      public AffichageDeletePerson() {
      }

      public void affichage(JFrame frame, ActionEvent e) {
        	JDialog d = new JDialog(frame, "Supprimer une personne");
        	d.setResizable(false);
            d.setLayout(null);
            d.setSize(348, 253);

            okButton.setBounds(70, 150, 200, 30);
            okButton.setLabel("Validez votre entrée !");

            labelId.setBounds(24, 40, 100, 23);
            labelId.setText("IdPerson");

            textLabelId.setBackground(Color.white);
            textLabelId.setBounds(100, 40, 198, 23);

            d.add(okButton, null);
            d.add(textLabelId, null);
            d.add(labelId, null);
            d.setVisible(true);

          okButton.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent arg0) {
              PersonController personController = new PersonController();

              Person supp1 = new Person(textLabelId.getText());
              personController.deletePerson(supp1);

              JOptionPane.showMessageDialog(null, "Bien supprimé !", "Information", JOptionPane.INFORMATION_MESSAGE);
              setVisible(false);
          }

        });
      }


}
