package objects;

import lombok.Getter;

import javax.swing.*;
import java.awt.*;

@Getter
public class PlayingField {

    private Integer xFields;
    private Integer yFields;
    private Image defaultBG;

    public PlayingField(Integer xFields, Integer yFields) {
        this.xFields = xFields;
        this.yFields = yFields;
        loadImage();
    }

    private void loadImage() {
        ImageIcon ii = new ImageIcon("src/main/Resources/BG/Chessboard1000x1000w100x100T.png");
        defaultBG = ii.getImage();
    }
}
