package View.Room;

import Controller.PersonController;
import Controller.RoomController;
import Model.Person;
import Model.Room;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AffichageDeleteRoom extends JFrame {
        JLabel labelId = new JLabel();
        TextField textFieldId = new TextField();
        Button okButton = new Button();

      public AffichageDeleteRoom() {
      }

      public void affichage(JFrame frame, ActionEvent e) {
        	JDialog d = new JDialog(frame, "Supprimer une salle");
        	d.setResizable(false); // la fenêtre ne peut pas être retaillée par l'utilisateur
            d.setLayout(null); // pas de Layout, nous positionnons les composants nous-mêmes
            d.setSize(348, 253); // widht et height de la fenêtre

            okButton.setBounds(70, 150, 200, 30); // positionnement du bouton
            okButton.setLabel("Validez votre entrée !"); // titre du bouton

            labelId.setBounds(24, 60, 100, 23); // positionnement de l'étiquette
            labelId.setText("idRoom"); // titre de l'étiquette

            textFieldId.setBackground(Color.white);// couleur du fond de l'éditeur mono ligne
            textFieldId.setBounds(100, 60, 198, 23);// positionnement de l'éditeur mono ligne

            d.add(okButton, null);// ajout dans la fenêtre du bouton
            d.add(textFieldId, null);// ajout dans la fenêtre de l'éditeur mono ligne
            d.add(labelId, null);// ajout dans la fenêtre de l'étiquette
            d.setVisible(true);

          okButton.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent arg0) {
              RoomController roomController = new RoomController();

              Room room = new Room();
              room.setIdRoom(textFieldId.getText());
              roomController.deleteRoom(room);

              JOptionPane.showMessageDialog(null, "Bien supprimé !", "Information", JOptionPane.INFORMATION_MESSAGE);
              setVisible(false);
          }

        });
      }


}
