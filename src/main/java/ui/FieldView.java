package ui;

import objects.PlayerCharacter;
import objects.PlayingField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FieldView extends JPanel implements ActionListener {
    private final PlayingField field;
    private PlayerCharacter player;
    private boolean inGame = true; // in game im sinne von nicht in einem menü oder so
    private Image playerIcon; //kann man auch aus dem player lesen idk maybe später mal ändern
    private Image fieldIcon;  // so wie beim player icon


    private final int STEP = 100; //schrittgröße von 100 Pixeln -> sollte den Kacheln entsprechen

    public FieldView(PlayingField field, PlayerCharacter player) {
        this.field = field;
        this.player = player;
        initField();
    }

    private void initField() {
        addKeyListener(new TAdapter());
        setBackground(Color.black);
        setFocusable(true);
        playerIcon = player.getImage();
        fieldIcon = field.getDefaultBG();

        int w = fieldIcon.getWidth(this);
        int h = fieldIcon.getHeight(this);
        setPreferredSize(new Dimension(w, h));
    }


    private void move(String direction) {
        switch (direction) {
            case "right" -> drawPlayerAt(player.getXPosition() + STEP, player.getYPosition());
            case "left" -> drawPlayerAt(player.getXPosition() - STEP, player.getYPosition());
            case "up" -> drawPlayerAt(player.getXPosition(), player.getYPosition() - STEP);
            case "down" -> drawPlayerAt(player.getXPosition(), player.getYPosition() + STEP);
        }
    }

    private void drawPlayerAt(int xPosition, int yPosition) {
        player.setXPosition(xPosition);
        player.setYPosition(yPosition);
    }

    @Override
    public void paintComponent(Graphics g) {
        doDrawing(g);
    }


    private void doDrawing(Graphics g) {
        if (inGame) {
            g.drawImage(fieldIcon, 0, 0, null);
            g.drawImage(playerIcon, player.getXPosition(), player.getYPosition(), null);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("action wurde performed whatever that means, this shit was busted last time i tried to use it");
    }

    // prüft tastatur eingaben am besten nicht verändern fürs erste
    private class TAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

            if (key == KeyEvent.VK_LEFT) {
                move("left");
                repaint();
            }

            if (key == KeyEvent.VK_RIGHT) {
                move("right");
                repaint();
            }

            if (key == KeyEvent.VK_UP) {
                move("up");
                repaint();
            }

            if (key == KeyEvent.VK_DOWN) {
                move("down");
                repaint();
            }
        }
    }
}
