package ui;

import objects.PlayingField;

import javax.swing.*;

public class Presenter extends JFrame {

    public Presenter(PlayingField field) {
        start(field);
    }

    public void start(PlayingField field) {
        add(new FieldView(field));

        setResizable(false);
        pack();

        setTitle("RPG");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
