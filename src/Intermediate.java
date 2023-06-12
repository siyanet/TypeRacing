import javafx.scene.Scene;
import javafx.stage.Stage;

public class Intermediate extends Level {
    @Override
    public void start() {
        Stage stage = SignUp.getStage();
        Scene scene= environment.getEnvironmentScene(3,stage);
        environment.levelIndicator = 2;
        stage.setScene(scene);
    }
}
