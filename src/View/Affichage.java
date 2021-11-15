package View;

import View.Person.AffichageAddPerson;
import View.Person.AffichageDeletePerson;
import View.Room.AffichageAddRoom;
import View.Room.AffichageDeleteRoom;
import View.TimeSlot.AffichageAddTimeSlot;
import View.TimeSlot.AffichageDeleteTimeSlot;

import java.awt.event.*;
import javax.swing.*;

public class Affichage extends JFrame implements ActionListener {
    static JFrame frame;

    public Affichage(){
    }

    public void Fenetre(){
        // créer un frame
        frame = new JFrame("Architecture Logicielle");

        // créer un objet
        Affichage obj = new Affichage();

        // créer un panneau
        JPanel panel = new JPanel();
        JButton btnAddSalle = new JButton("Créer une salle");
        JButton btnSupSalle = new JButton("Supprimer une salle");
        JButton btnAddPerson = new JButton("Créer une personne");
        JButton btnSuppPerson = new JButton("Supprimer une personne");
        JButton btnAddTimeSlot = new JButton("Créer un créneau");
        JButton btnSuppTimeSlot = new JButton("Supprimer un créneau");

        // ajouter un listener au bouton
        btnAddSalle.addActionListener(obj);
        btnSupSalle.addActionListener(obj);
        btnAddPerson.addActionListener(obj);
        btnSuppPerson.addActionListener(obj);
        btnAddTimeSlot.addActionListener(obj);
        btnSuppTimeSlot.addActionListener(obj);

        // ajouter le bouton au panneau
        panel.add(btnAddSalle);
        panel.add(btnSupSalle);
        panel.add(btnAddPerson);
        panel.add(btnSuppPerson);
        panel.add(btnAddTimeSlot);
        panel.add(btnSuppTimeSlot);

        frame.add(panel);
        frame.setSize(500, 200);
        frame.show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        switch (s) {
            case "Créer une personne":
                AffichageAddPerson aap = new AffichageAddPerson();
                aap.affichage(frame, e);
                break;
            case "Supprimer une personne":
                AffichageDeletePerson adp = new AffichageDeletePerson();
                adp.affichage(frame, e);
                break;
            case "Créer une salle":
                AffichageAddRoom aar = new AffichageAddRoom();
                aar.affichage(frame, e);
                break;
            case "Supprimer une salle":
                AffichageDeleteRoom adr = new AffichageDeleteRoom();
                adr.affichage(frame, e);
                break;
            case "Créer un créneau":
                AffichageAddTimeSlot aats = new AffichageAddTimeSlot();
                aats.affichage(frame, e);
                break;
            case "Supprimer un créneau":
                AffichageDeleteTimeSlot adts = new AffichageDeleteTimeSlot();
                adts.affichage(frame, e);
                break;
        }
    }
}
