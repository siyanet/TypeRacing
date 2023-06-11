import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Report extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox pane = new VBox(30);
        VBox paneOverAll = new VBox();
        VBox paneSpeed = new VBox();
        VBox paneAccuracy = new VBox();

        Slider sliderOverAll = new Slider();
        sliderOverAll.setMin(0);
        sliderOverAll.setMax(100);
        sliderOverAll.setValue(TypeEventHandler.correctWord/40);
        Label rateOverAll = new Label("good");
        rateOverAll.textProperty().bind(sliderOverAll.valueProperty().asString("goof"+"%.2f"));

        sliderOverAll.getStyleClass().add("slider-speed");
        sliderOverAll.setDisable(true);


        Slider sliderSpeed = new Slider();
        sliderSpeed.setMin(0);
        sliderSpeed.setMax(100);
        sliderSpeed.setValue(TypeEventHandler.correctWord/40);
        Label rate = new Label("good");
        rate.textProperty().bind(sliderSpeed.valueProperty().asString("goof"+"%.2f"));

        sliderSpeed.getStyleClass().add("slider-speed");
        sliderSpeed.setDisable(true);


        Slider sliderAccuracy = new Slider();
        sliderAccuracy.setMin(0);
        sliderAccuracy.setMax(100);
        sliderAccuracy.setValue(TypeEventHandler.correctWord/40);
        Label rateAccuracy = new Label("good");
        rateAccuracy.textProperty().bind(sliderAccuracy.valueProperty().asString("goof"+"%.2f"));

        sliderAccuracy.getStyleClass().add("slider-speed");
        sliderAccuracy.setDisable(true);

        HBox hBox = new HBox(30);
        hBox.setAlignment(Pos.CENTER);
        Button playAgain = new Button("play Again");
        Button nextLevel = new Button("next Level");
        hBox.getChildren().add(playAgain);
        hBox.getChildren().add(nextLevel);

        paneOverAll.getChildren().add(sliderOverAll);
        paneOverAll.getChildren().add(rateOverAll);
        paneSpeed.getChildren().add(sliderSpeed);
        paneSpeed.getChildren().add(rate);
        paneAccuracy.getChildren().add(sliderAccuracy);
        paneAccuracy.getChildren().add(rateAccuracy);
        pane.getChildren().add(paneOverAll);
        pane.getChildren().add(paneSpeed);
        pane.getChildren().add(paneAccuracy);
        pane.getChildren().add(hBox);

        Scene scene = new Scene(pane,700,700);
        scene.getStylesheets().add("Styles.css");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[]args){
        Application.launch();
    }
}
