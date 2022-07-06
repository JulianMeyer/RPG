package ui;

import objects.PlayerCharacter;
import objects.PlayingField;

import javax.swing.*;

public class Presenter extends JFrame {

    private PlayerCharacter player;

    public Presenter(PlayingField field, PlayerCharacter player) {
        this.player = player;
        start(field);
    }

    public void start(PlayingField field) {
        FieldView comp = new FieldView(field, player);
        add(comp);
        setResizable(false);
        pack();
        setTitle("RPG");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

}
