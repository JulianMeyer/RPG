package ui;

import objects.PlayingField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter extends JFrame implements ActionListener {
    private final PlayingField field;

    public Presenter(PlayingField field) {
        this.field = field;
    }

    public void start() {
        add(new FieldView());
        setSize(field.getXFields(), field.getYFields());
        setTitle("RPG");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
