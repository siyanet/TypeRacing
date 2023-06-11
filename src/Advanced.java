import javafx.scene.Scene;
import javafx.stage.Stage;

public class Advanced extends Level{
    @Override
    public void start() {
        Stage stage = SignUp.getStage();
        Scene scene= EnvironmentTwo.getEnvironmentTwoScene(2,stage);
        stage.setScene(scene);
    }
}
