import javafx.scene.Scene;
import javafx.stage.Stage;

public class Beginner extends Level{
    @Override
    public void start() {
        Stage stage = SignUp.getStage();
        Scene scene= environment.getEnvironmentScene(4,stage);
        environment.levelIndicator = 1;
        stage.setScene(scene);
    }
}
