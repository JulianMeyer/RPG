package objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerCharacter {
    private int health = 100;
    private int mana = 100;
    private int pyhisicalPower = 1;
    private int magicalPower = 1;
    List<Item> itemList = new ArrayList<>();
    List<Object> equipmentList = new ArrayList<>();
    private Image image;

    // Die Position von der Figur auf dem spielfeld
    @Setter
    private int xPosition;
    @Setter
    private int yPosition;

    public PlayerCharacter(int health, int mana, int pyhisicalPower, int magicalPower, Item... items) {
        this.health = health;
        this.mana = mana;
        this.pyhisicalPower = pyhisicalPower;
        this.magicalPower = magicalPower;
        itemList.addAll(Arrays.asList(items));
        loadImage();
    }

    //schonmal für später geschrieben
    public String activateItem(Item item) {
        if (!item.isZustand()) {
            health += item.getHealth();
            mana += item.getMana();
            pyhisicalPower += item.getPyhisicalPower();
            magicalPower += item.getMagicalPower();
            item.setZustand(true);
            return "Item activated";
        }
        return "Item could not be activated";
    }

//ausgelagert falls man das mal anpassen will mit pfad oder so
    private void loadImage() {
        ImageIcon ii = new ImageIcon("src/main/Resources/Player/PlayerMageFFI 100x100.png");
        image = ii.getImage();
    }

}
