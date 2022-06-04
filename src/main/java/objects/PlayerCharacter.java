package objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

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

    public PlayerCharacter(int health, int mana, int pyhisicalPower, int magicalPower, Item... items) {
        this.health = health;
        this.mana = mana;
        this.pyhisicalPower = pyhisicalPower;
        this.magicalPower = magicalPower;
        itemList.addAll(Arrays.asList(items));
    }

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

}
