import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class login extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Pane pane = new Pane();

        Label label = new Label();
        label.setText("create Account");
        label.layoutXProperty().bind(pane.widthProperty().divide(2).subtract(10));
        label.layoutYProperty().bind(pane.heightProperty().divide(6));
        TextField textFieldName = new TextField();
        textFieldName.setMinWidth(50);
        textFieldName.layoutXProperty().bind(pane.widthProperty().divide(2).subtract(25));
        textFieldName.layoutYProperty().bind(pane.heightProperty().divide(5));
        TextField textFieldPassword = new TextField();
        textFieldPassword.setMinWidth(50);
        textFieldPassword.layoutXProperty().bind(pane.widthProperty().divide(2).subtract(25));
        textFieldPassword.layoutYProperty().bind(pane.heightProperty().divide(4));
        Button signUpButton = new Button("Sign Up");
        signUpButton.layoutXProperty().bind(pane.widthProperty().divide(2).subtract(15));
        signUpButton.layoutYProperty().bind(pane.heightProperty().divide(3));


        pane.getChildren().add(label);
        pane.getChildren().add(textFieldName);
        pane.getChildren().add(textFieldPassword);
        pane.getChildren().add(signUpButton);
        Scene scene = new Scene(pane,700,700);
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String args[]){
            launch(args);
    }
}
