import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//public class Report extends Application {
public class Report{
    static int total;
    static int speed;
    static int accuracy;

    static Scene scene;
   // @Override
   // public void start(Stage stage) throws Exception {
    public static Scene getReportScene(){
        speed = TypeEventHandler.correctWord / 60;
        total = TypeEventHandler.correctWord + TypeEventHandler.wrongWord;
        accuracy = (total - TypeEventHandler.wrongWord) / total *100;
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
        sliderSpeed.setMax(CalculateReport.expectedSpeed);
        sliderSpeed.setValue(speed);
        Label rate = new Label();
        if(speed >= CalculateReport.expectedSpeed){
            rate.setTextFill(Color.GREEN);
        }
        else if(speed < CalculateReport.expectedSpeed){
            rate.setTextFill(Color.RED);
        }
        rate.textProperty().bind(sliderSpeed.valueProperty().asString("Speed"+"%.2f"+ "CPM"));

        sliderSpeed.getStyleClass().add("slider-speed");
        sliderSpeed.setDisable(true);


        Slider sliderAccuracy = new Slider();
        sliderAccuracy.setMin(0);
        sliderAccuracy.setMax(CalculateReport.expectedAccuracy);
        sliderAccuracy.setValue(accuracy);
        Label rateAccuracy = new Label();
        if(accuracy >= CalculateReport.expectedAccuracy){
       rateAccuracy.setTextFill(Color.GREEN);}
        if(accuracy < CalculateReport.expectedAccuracy){
            rateAccuracy.setTextFill(Color.RED);
        }
        rateAccuracy.textProperty().bind(sliderAccuracy.valueProperty().asString("Accuracy"+"%.2f"));

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

        scene = new Scene(pane,700,700);
        scene.getStylesheets().add("Styles.css");
        return scene;
       // stage.setScene(scene);
       // stage.show();
    }
  /*  public static void main(String[]args){
        Application.launch();
    }*/
}
