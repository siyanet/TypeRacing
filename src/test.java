import javafx.application.Application;
import javafx.scene.Camera;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class test extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        Rectangle rect = new Rectangle(230,230,80,20);
        rect.setFill(Color.BEIGE);
        Camera camera = new PerspectiveCamera(true);
        camera.setLayoutX(250);
        camera.setLayoutY(250);
        camera.translateZProperty().set(-500);
        Pane pane = new Pane();
        pane.getChildren().add(rect);

        Scene scene = new Scene(pane,500,500);
        scene.setCamera(camera);
        stage.addEventHandler(KeyEvent.KEY_PRESSED, event ->{
            camera.translateZProperty().add(100);
            System.out.println("ok");
                });
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
