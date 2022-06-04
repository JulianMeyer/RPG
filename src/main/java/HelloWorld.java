import objects.Item;
import objects.PlayerCharacter;
import objects.PlayingField;
import ui.Presenter;

public class HelloWorld {
    public static void main(String[] args) {
        PlayerCharacter playerCharacter = new PlayerCharacter(100, 100, 1, 1, new Item());
        Presenter presenter = new Presenter(new PlayingField(100, 100));
        presenter.start();
        presenter.setVisible(true);

    }
}
