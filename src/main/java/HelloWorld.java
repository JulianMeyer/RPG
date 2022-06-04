import objects.Item;
import objects.PlayerCharacter;
import objects.PlayingField;
import ui.Presenter;

import javax.swing.*;
import java.awt.*;

public class HelloWorld {
    public static void main(String[] args) {
        PlayerCharacter playerCharacter = new PlayerCharacter(100, 100, 1, 1, new Item());
        PlayingField field = new PlayingField(500, 500);
        EventQueue.invokeLater(() -> {
            JFrame game = new Presenter(field);
            game.setVisible(true);
        });
    }
}
