package objects;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class MenuBar {
    private int health;
    private int mana;

    private Image image;

    public MenuBar(PlayerCharacter playerCharacter) {
        loadFromPlayer(playerCharacter);
        loadImage();
    }

    private void loadFromPlayer(PlayerCharacter playerCharacter) {
        this.health = playerCharacter.getHealth();
        this.mana = playerCharacter.getMana();
    }

    private void loadImage() {
        ImageIcon ii = new ImageIcon("src/main/Resources/Menu/menubar001.png");
        image = ii.getImage();
    }
}
