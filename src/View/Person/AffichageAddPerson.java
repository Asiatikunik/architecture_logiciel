package View.Person;

import Controller.PersonController;
import Model.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AffichageAddPerson extends JFrame {
     JLabel labelFirstname = new JLabel();
     JLabel labelLastname = new JLabel();
     TextField textFieldFirstname = new TextField();
     TextField textFieldLastname = new TextField();
     Button okButton = new Button();

      public AffichageAddPerson() {
      }

      public void affichage(JFrame frame, ActionEvent e) {
          JDialog d = new JDialog(frame, "Créer une personne");
          d.setResizable(false);
          d.setLayout(null);
          d.setSize(348, 300);

          okButton.setBounds(70, 200, 200, 30);
          okButton.setLabel("Validez votre entrée !");

          labelFirstname.setBounds(24, 70, 100, 23);
          labelFirstname.setText("FirstName");

          labelLastname.setBounds(24, 115, 100, 23);
          labelLastname.setText("LastName");

          textFieldFirstname.setBackground(Color.white);
          textFieldFirstname.setBounds(100, 70, 198, 23);

          textFieldLastname.setBackground(Color.white);
          textFieldLastname.setBounds(100, 115, 198, 23);

          d.add(okButton, null);// ajout dans la fenêtre du bouton
          d.add(textFieldFirstname, null);
          d.add(labelFirstname, null);
          d.add(textFieldLastname, null);
          d.add(labelLastname, null);
          d.setVisible(true);

          okButton.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent arg0) {
              PersonController personController = new PersonController();
              Person person = new Person(textFieldFirstname.getText(), textFieldLastname.getText());
              personController.addPerson(person);
              JOptionPane.showMessageDialog(null, "Bien ajouté !", "Information", JOptionPane.INFORMATION_MESSAGE);
              setVisible(false);
          }

        });
      }


}
