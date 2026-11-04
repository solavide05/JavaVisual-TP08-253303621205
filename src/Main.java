
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        // Membuat pengelola karakter
        CharacterManager manager = new CharacterManager();

        // 5 karakter awal
        manager.addCharacter(new Character("Arjuna", CharacterType.WARRIOR, 5));
        manager.addCharacter(new Character("Merlin", CharacterType.MAGE, 3));
        manager.addCharacter(new Character("Athena", CharacterType.ARCHER, 4));
        manager.addCharacter(new Character("Leonidas", CharacterType.WARRIOR, 8));
        manager.addCharacter(new Character("Luna", CharacterType.HEALER, 6));

        // Karakter tambahan untuk TP8
        manager.addCharacter(new Character("Thor", CharacterType.WARRIOR, 10));

        // Menampilkan GUI pada Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {

            MainWindow window = new MainWindow(
                manager.getAllCharacters(),
                manager.getAverageLevel()
            );

            window.setVisible(true);
        });
    }
}
