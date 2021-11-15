package View.TimeSlot;

import Controller.PersonController;
import Controller.TimeSlotController;
import Model.Person;
import Model.TimeSlot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AffichageAddTimeSlot extends JFrame {
        JLabel labelDate = new JLabel();
        JLabel labelStart = new JLabel();
        JLabel labelEnd = new JLabel();
        TextField textFieldDate = new TextField();
        TextField textFieldStart = new TextField();
        TextField textFieldEnd = new TextField();
        Button okButton = new Button();

      public AffichageAddTimeSlot() {
      }

      public void affichage(JFrame frame, ActionEvent e) {

        	JDialog d = new JDialog(frame, "Créer un créneau");
        	d.setResizable(false); // la fenêtre ne peut pas être retaillée par l'utilisateur
            d.setLayout(null); // pas de Layout, nous positionnons les composants nous-mêmes
            d.setSize(348, 260); // widht et height de la fenêtre

            okButton.setBounds(70, 180, 200, 30); // positionnement du bouton
            okButton.setLabel("Validez votre entrée !"); // titre du bouton

            labelDate.setBounds(24, 40, 100, 23); // positionnement de l'étiquette
            labelDate.setText("Date"); // titre de l'étiquette
            labelStart.setBounds(24, 90, 100, 23); // positionnement de l'étiquette
            labelStart.setText("Heure début"); // titre de l'étiquette
            labelEnd.setBounds(24, 140, 100, 23); // positionnement de l'étiquette
            labelEnd.setText("Heure fin"); // titre de l'étiquette

            textFieldDate.setBackground(Color.white);// couleur du fond de l'éditeur mono ligne
            textFieldDate.setBounds(100, 40, 198, 23);// positionnement de l'éditeur mono ligne
            textFieldStart.setBackground(Color.white);// couleur du fond de l'éditeur mono ligne
            textFieldStart.setBounds(120, 90, 180, 23);// positionnement de l'éditeur mono ligne
            textFieldEnd.setBackground(Color.white);// couleur du fond de l'éditeur mono ligne
            textFieldEnd.setBounds(100, 140, 198, 23);// positionnement de l'éditeur mono ligne

            d.add(okButton, null);// ajout dans la fenêtre du bouton
            d.add(textFieldDate, null);// ajout dans la fenêtre de l'éditeur mono ligne
            d.add(labelDate, null);// ajout dans la fenêtre de l'étiquette
            d.add(textFieldStart, null);// ajout dans la fenêtre de l'éditeur mono ligne
            d.add(labelStart, null);// ajout dans la fenêtre de l'étiquette
            d.add(textFieldEnd, null);// ajout dans la fenêtre de l'éditeur mono ligne
            d.add(labelEnd, null);// ajout dans la fenêtre de l'étiquette
            d.setVisible(true);

          okButton.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent arg0) {
              TimeSlotController timeSlotController = new TimeSlotController();
              TimeSlot timeSlot = new TimeSlot(textFieldDate.getText(), textFieldStart.getText(), textFieldEnd.getText());
              timeSlotController.addTimeSlot(timeSlot);
              JOptionPane.showMessageDialog(null, "Bien ajouté !", "Information", JOptionPane.INFORMATION_MESSAGE);
              setVisible(false);
          }

        });
      }


}
