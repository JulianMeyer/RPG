package objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    //Item beschreibung
    private String name;
    private String description;
    @Setter
    private boolean zustand = false;
    //item einfluss
    private int health = 0;
    private int mana = 0;
    private int pyhisicalPower = 0;
    private int magicalPower = 0;


}
