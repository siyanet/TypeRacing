import javafx.scene.Scene;
import javafx.stage.Stage;

public class ConnectToChooser {
    public static void choose(){
        Stage stage = SignUp.getStage();
        Scene scene = LevelChooserTwo.getLevelChooserTwoScene();
        stage.setScene(scene);
    }
}
