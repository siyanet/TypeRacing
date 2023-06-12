import javafx.scene.Scene;
import javafx.stage.Stage;

public class ConnectToScene {
    public static void connectReport(){
        Stage stage = SignUp.getStage();
        Scene scene = Report.getReportScene();
        stage.setScene(scene);
    }
}
