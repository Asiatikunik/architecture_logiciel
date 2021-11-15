package View.Room;

import Controller.PersonController;
import Controller.RoomController;
import Model.Person;
import Model.Room;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AffichageAddRoom extends JFrame {
        JLabel labelCapacity = new JLabel();
        TextField textFieldCapacity = new TextField();
        Button okButton = new Button();

      public AffichageAddRoom() {
      }

      public void affichage(JFrame frame, ActionEvent e) {        	JDialog d = new JDialog(frame, "Créer une salle");
        	d.setResizable(false); // la fenêtre ne peut pas être retaillée par l'utilisateur
            d.setLayout(null); // pas de Layout, nous positionnons les composants nous-mêmes
            d.setSize(348, 253); // widht et height de la fenêtre
            okButton.setBounds(70, 150, 200, 30); // positionnement du bouton
            okButton.setLabel("Validez votre entrée !"); // titre du bouton
            labelCapacity.setBounds(24, 70, 100, 23); // positionnement de l'étiquette
            labelCapacity.setText("Capacity"); // titre de l'étiquette
            textFieldCapacity.setBackground(Color.white);// couleur du fond de l'éditeur mono ligne
            textFieldCapacity.setBounds(100, 70, 198, 23);// positionnement de l'éditeur mono ligne
            d.add(okButton, null);// ajout dans la fenêtre du bouton
            d.add(textFieldCapacity, null);// ajout dans la fenêtre de l'éditeur mono ligne
            d.add(labelCapacity, null);// ajout dans la fenêtre de l'étiquette
            d.setVisible(true);
          d.setVisible(true);

          okButton.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent arg0) {
              RoomController roomController = new RoomController();
              Room room = new Room(textFieldCapacity.getText());
              roomController.addRoom(room);
              JOptionPane.showMessageDialog(null, "Bien ajouté !", "Information", JOptionPane.INFORMATION_MESSAGE);
              setVisible(false);
          }

        });
      }


}
