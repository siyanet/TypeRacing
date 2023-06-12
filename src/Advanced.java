import javafx.scene.Scene;
import javafx.stage.Stage;

public class Advanced extends Level{
    @Override
    public void start() {
        Stage stage = SignUp.getStage();
        Scene scene= environment.getEnvironmentScene(2,stage);
        environment.levelIndicator = 3;
        stage.setScene(scene);
    }
}
