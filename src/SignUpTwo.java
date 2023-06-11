import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class SignUpTwo {/*
    public static Scene getSignUpTwo(){
        static PasswordField textFieldPassword;
        static TextField textFieldName;
        static Scene signUpScene;
        static HBox hBox;
        @Override
        public void start(Stage stage) throws Exception {
            hBox = new HBox();
            Pane paneCreate = new Pane();
            Pane paneWelcome = new Pane();
            VBox vBoxCreate = new VBox(30);
            vBoxCreate.setAlignment(Pos.CENTER);
            VBox vBoxWelcome = new VBox(20);
            vBoxWelcome.setAlignment(Pos.CENTER);


            Label labelCreateAccount = new Label();
            labelCreateAccount.setText("create Account");

            Label labelWelcome = new Label();
            labelWelcome.setText("Welcome Back");

            Label labelTextOne = new Label();
            labelTextOne.setText("To Keep Connected With us");

            Label labelTextTwo = new Label();
            labelTextTwo.setText("log in with your personal info");


            labelCreateAccount.setFont(Font.font("Bodoni Mt Black", FontPosture.ITALIC,40));
            labelCreateAccount.setTextFill(Color.FORESTGREEN);
            labelWelcome.setFont(Font.font("Bodoni Mt Black", FontPosture.ITALIC,40));
            labelWelcome.setTextFill(Color.WHITE);
            labelTextTwo.setFont(Font.font("VERDANA", FontPosture.ITALIC,20));
            labelTextTwo.setTextFill(Color.WHITE);
            labelTextOne.setFont(Font.font("VERDANA", FontPosture.ITALIC,20));
            labelTextOne.setTextFill(Color.WHITE);
            // labelCreateAccount.layoutXProperty().bind(vboxOne.widthProperty().divide(2).subtract(labelCreateAccount.getWidth()));
            // labelCreateAccount.layoutYProperty().bind(vboxOne.heightProperty().divide(6));
            textFieldName = new TextField();
            textFieldName.setMinWidth(50);
            textFieldName.setPromptText("Enter Your Name");
            // textFieldName.layoutXProperty().bind(pane.widthProperty().divide(2).subtract(25));
            // textFieldName.layoutYProperty().bind(pane.heightProperty().divide(5));
            textFieldPassword = new PasswordField();
            textFieldPassword.setMinWidth(50);
            textFieldPassword.setPromptText("Enter Your Password");
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
            paneWelcome.setBackground(new Background(new BackgroundFill(Color.FORESTGREEN,null,null)));
            paneCreate.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
            vBoxCreate.getChildren().add(labelCreateAccount);
            vBoxCreate.getChildren().add(textFieldName);
            vBoxCreate.getChildren().add(textFieldPassword);
            vBoxCreate.getChildren().add(signUpButton);

            vBoxWelcome.getChildren().add(labelWelcome);
            vBoxWelcome.getChildren().add(labelTextOne);
            vBoxWelcome.getChildren().add(labelTextTwo);
            vBoxWelcome.getChildren().add(signInButton);
            paneCreate.getChildren().add(vBoxCreate);
            paneWelcome.getChildren().add(vBoxWelcome);
            hBox.getChildren().add(paneWelcome);
            hBox.getChildren().add(paneCreate);
            signUpScene = new Scene(hBox,700,700);
            paneWelcome.prefWidthProperty().bind(signUpScene.widthProperty().divide(2));
            paneWelcome.prefHeightProperty().bind(signUpScene.heightProperty());
            paneCreate.prefWidthProperty().bind(signUpScene.widthProperty().divide(2));
            paneCreate.prefHeightProperty().bind(signUpScene.heightProperty());
            vBoxCreate.prefHeightProperty().bind(paneCreate.prefHeightProperty().divide(2));
            vBoxCreate.prefWidthProperty().bind(paneCreate.prefWidthProperty());
            vBoxCreate.layoutYProperty().bind(paneCreate.prefHeightProperty().divide(2).subtract(vBoxCreate.prefHeightProperty().divide(2)));

            vBoxWelcome.prefHeightProperty().bind(paneWelcome.prefHeightProperty().divide(2));
            vBoxWelcome.prefWidthProperty().bind(paneWelcome.prefWidthProperty());
            vBoxWelcome.layoutYProperty().bind(paneWelcome.prefHeightProperty().divide(2).subtract(vBoxWelcome.prefHeightProperty().divide(2)));
            signUpButton.setOnAction(new SignUpHandler());

            stage.setScene(signUpScene);
            //  stage.setScene(SignIn.signInScene);
       /* signInButton.setOnAction(e->{
            stage.setScene(SignIn.signInScene);
        });
            // Scene one = SIGNINTWO.getSignInHBox();

            signInButton.setOnAction(e->{
                stage.setScene(null);
                stage.setScene(SIGNINTWO.getSignInHBox());
            });
    }*/
}
