import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

//public class Report extends Application {
public class Report{
    static int total;
    static int speed;
    static int accuracy;

    static Scene scene;
    //@Override
  //  public void start(Stage stage) throws Exception {
    public static Scene getReportScene(){
        BorderPane borderPane = new BorderPane();
       // speed = TypeEventHandler.correctWord / 60;
       // total = TypeEventHandler.correctWord + TypeEventHandler.wrongWord;
       // accuracy = ((total - TypeEventHandler.wrongWord) / total) *100;
        Image imageLogo = new Image("C:\\Users\\Siyan\\Desktop\\TypeRacer_logo.png");
        ImageView logo = new ImageView(imageLogo);
        borderPane.setCenter(logo);

        VBox pane = new VBox(30);
        logo.fitWidthProperty().bind(pane.widthProperty().divide(3));
        logo.fitHeightProperty().bind(pane.heightProperty().divide(3));
        logo.setLayoutX(logo.getLayoutX() + 300);
        VBox paneOverAll = new VBox();
        VBox paneSpeed = new VBox();
        VBox paneAccuracy = new VBox();

       /* Slider sliderOverAll = new Slider();
        sliderOverAll.setMin(0);
        sliderOverAll.setMax(100);
      //  sliderOverAll.setValue(TypeEventHandler.correctWord/40);
        Label rateOverAll = new Label("good");
        rateOverAll.textProperty().bind(sliderOverAll.valueProperty().asString("goof"+"%.0f"));

        sliderOverAll.getStyleClass().add("slider-speed");
        sliderOverAll.setDisable(true);*/


        Slider sliderSpeed = new Slider();
        sliderSpeed.setMin(0);
        sliderSpeed.setMax(CalculateReport.expectedSpeed);
        sliderSpeed.setValue(CalculateReport.speed);
        Label rate = new Label();
        rate.setFont(Font.font("TIMES NEW ROMAN", FontWeight.BOLD, FontPosture.ITALIC,20));
       if(speed >= CalculateReport.expectedSpeed){
            rate.setTextFill(Color.GREEN);
        }
        else if(speed < CalculateReport.expectedSpeed){
            rate.setTextFill(Color.RED);
        }
        rate.textProperty().bind(sliderSpeed.valueProperty().asString("Speed"+"%.0f"+ "CPM"));

        sliderSpeed.getStyleClass().add("slider-speed");
        sliderSpeed.setDisable(true);


        Slider sliderAccuracy = new Slider();
        sliderAccuracy.setMin(0);
        sliderAccuracy.setMax(CalculateReport.expectedAccuracy);
        sliderAccuracy.setValue(CalculateReport.accuracy);
        Label rateAccuracy = new Label();
        rateAccuracy.setFont(Font.font("TIMES NEW ROMAN", FontWeight.BOLD, FontPosture.ITALIC,20));

        if(accuracy >= CalculateReport.expectedAccuracy){
       rateAccuracy.setTextFill(Color.GREEN);}
        if(accuracy < CalculateReport.expectedAccuracy){
            rateAccuracy.setTextFill(Color.RED);
        }
        rateAccuracy.textProperty().bind(sliderAccuracy.valueProperty().asString("Accuracy"+"%.0f"));

        sliderAccuracy.getStyleClass().add("slider-speed");
        sliderAccuracy.setDisable(true);

        HBox hBox = new HBox(30);
        hBox.setAlignment(Pos.CENTER);
        Button playAgain = new Button("play Again");
        Button nextLevel = new Button("next Level");
        playAgain.setStyle("-fx-background-radius: 30px; -fx-padding: 10px 20px; -fx-background-color: green; -fx-text-fill: white;");
        playAgain.setPrefWidth(160);
        nextLevel.setStyle("-fx-background-radius: 30px; -fx-padding: 10px 20px; -fx-background-color: green; -fx-text-fill: white;");
        nextLevel.setPrefWidth(160);
         String indicate = "";
         if(environment.levelIndicator == 1){
            indicate = "Beginner";
            environment.levelIndicator = 2;
        }
        else if(environment.levelIndicator == 2){
            indicate = "Intermediate";

            environment.levelIndicator = 3;
        }
        else if(environment.levelIndicator == 3){
            indicate = "Advanced";
            environment.levelIndicator = 1;
        }
        String indicateNext= "";
        if(environment.levelIndicator == 3){
            indicateNext = "Beginner";
            environment.levelIndicator = 1;
        }
        else if(environment.levelIndicator == 1){
            indicateNext = "Intermediate";
            environment.levelIndicator = 2;
        }
        else if(environment.levelIndicator == 2){
            indicateNext = "Advanced";
            environment.levelIndicator = 3;
        }
        final String inNext = indicateNext;
        final String in = indicate;
        playAgain.setOnAction(e->{
                Level level = LevelFactory.createLevel(in);
        level.start();
        });
        nextLevel.setOnAction((e->{
            Level level = LevelFactory.createLevel(inNext);
            level.start();

        }));
        if(CalculateReport.accuracy >= CalculateReport.expectedAccuracy && CalculateReport.speed > CalculateReport.expectedSpeed){
            nextLevel.setDisable(false);}
       else {
           nextLevel.setDisable(true);
        }
        hBox.getChildren().add(playAgain);
        hBox.getChildren().add(nextLevel);

      //  paneOverAll.getChildren().add(sliderOverAll);
      //  paneOverAll.getChildren().add(rateOverAll);
        paneSpeed.getChildren().add(sliderSpeed);
        paneSpeed.getChildren().add(rate);
        paneAccuracy.getChildren().add(sliderAccuracy);
        paneAccuracy.getChildren().add(rateAccuracy);
        pane.getChildren().add(MenuPane.getMenuPane());
        pane.getChildren().add(borderPane);
       // pane.getChildren().add(paneOverAll);
        pane.getChildren().add(paneSpeed);
        pane.getChildren().add(paneAccuracy);
        pane.getChildren().add(hBox);

        pane.setBackground(new Background(new BackgroundFill(Color.LINEN,null,null)));

        scene = new Scene(pane,700,700);
        scene.getStylesheets().add("Styles.css");
        return scene;
    //   stage.setScene(scene);
      //  stage.show();
    }
  /* public static void main(String[]args){
        Application.launch();
    }*/
}
