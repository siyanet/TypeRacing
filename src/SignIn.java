import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class SignIn extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        HBox hBox = new HBox();
        Pane paneSignIn = new Pane();
        Pane paneHello = new Pane();
        VBox vBoxSign = new VBox(30);
        vBoxSign.setAlignment(Pos.CENTER);
        VBox vBoxHello = new VBox(20);
        vBoxHello.setAlignment(Pos.CENTER);


        Label labelSignIn = new Label();
        labelSignIn.setText("Sign In");

        Label labelHello = new Label();
        labelHello.setText("Hello");

        Label labelTextOne = new Label();
        labelTextOne.setText("Enter your Personal Details");

        Label labelTextTwo = new Label();
        labelTextTwo.setText("Start a Journey With Us");


        labelSignIn.setFont(Font.font("Bodoni Mt Black", FontPosture.ITALIC,40));
        labelSignIn.setTextFill(Color.FORESTGREEN);
        labelHello.setFont(Font.font("Bodoni Mt Black", FontPosture.ITALIC,40));
        labelHello.setTextFill(Color.WHITE);
        labelTextTwo.setFont(Font.font("VERDANA", FontPosture.ITALIC,20));
        labelTextTwo.setTextFill(Color.WHITE);
        labelTextOne.setFont(Font.font("VERDANA", FontPosture.ITALIC,20));
        labelTextOne.setTextFill(Color.WHITE);
        // labelCreateAccount.layoutXProperty().bind(vboxOne.widthProperty().divide(2).subtract(labelCreateAccount.getWidth()));
        // labelCreateAccount.layoutYProperty().bind(vboxOne.heightProperty().divide(6));
        TextField textFieldName = new TextField();
        textFieldName.setMinWidth(50);
        // textFieldName.layoutXProperty().bind(pane.widthProperty().divide(2).subtract(25));
        // textFieldName.layoutYProperty().bind(pane.heightProperty().divide(5));
        TextField textFieldPassword = new TextField();
        textFieldPassword.setMinWidth(50);
        // textFieldPassword.layoutXProperty().bind(pane.widthProperty().divide(2).subtract(25));
        // textFieldPassword.layoutYProperty().bind(pane.heightProperty().divide(4));
        Button signUpButton = new Button("Sign Up");
        signUpButton.setStyle("-fx-background-radius: 30px; -fx-padding: 10px 20px; -fx-background-color: green; -fx-text-fill: white;");
        signUpButton.setPrefWidth(160);
        Button signInButton = new Button("Sign In");
        signInButton.setStyle("-fx-background-radius: 30px; -fx-padding: 10px 20px; -fx-background-color: green; -fx-text-fill: white;");
        signInButton.setPrefWidth(160);


        // signUpButton.setTextFill(Color.WHITE);
        //signUpButton.setBackground(new Background(new BackgroundFill(Color.FORESTGREEN,null,null)));
        // signUpButton.layoutXProperty().bind(pane.widthProperty().divide(2).subtract(15));
        // signUpButton.layoutYProperty().bind(pane.heightProperty().divide(3));
        paneHello.setBackground(new Background(new BackgroundFill(Color.FORESTGREEN,null,null)));
        paneSignIn.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
        vBoxSign.getChildren().add(labelSignIn);
        vBoxSign.getChildren().add(textFieldName);
        vBoxSign.getChildren().add(textFieldPassword);
        vBoxSign.getChildren().add(signInButton);

        vBoxHello.getChildren().add(labelHello);
        vBoxHello.getChildren().add(labelTextOne);
        vBoxHello.getChildren().add(labelTextTwo);
        vBoxHello.getChildren().add(signUpButton);
        paneSignIn.getChildren().add(vBoxSign);
        paneHello.getChildren().add(vBoxHello);
        hBox.getChildren().add(paneSignIn);
        hBox.getChildren().add(paneHello);

        Scene scene = new Scene(hBox,700,700);
        paneHello.prefWidthProperty().bind(scene.widthProperty().divide(2));
        paneHello.prefHeightProperty().bind(scene.heightProperty());
        paneSignIn.prefWidthProperty().bind(scene.widthProperty().divide(2));
        paneSignIn.prefHeightProperty().bind(scene.heightProperty());
        vBoxSign.prefHeightProperty().bind(paneSignIn.prefHeightProperty().divide(2));
        vBoxSign.prefWidthProperty().bind(paneSignIn.prefWidthProperty());
        vBoxSign.layoutYProperty().bind(paneSignIn.prefHeightProperty().divide(2).subtract(vBoxSign.prefHeightProperty().divide(2)));

        vBoxHello.prefHeightProperty().bind(paneHello.prefHeightProperty().divide(2));
        vBoxHello.prefWidthProperty().bind(paneHello.prefWidthProperty());
        vBoxHello.layoutYProperty().bind(paneHello.prefHeightProperty().divide(2).subtract(vBoxHello.prefHeightProperty().divide(2)));
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String args[]){
        launch(args);
    }
    }

