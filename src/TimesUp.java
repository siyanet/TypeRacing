import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class TimesUp {
  /* static int speed = (int)TypeEventHandler.correctWord / 60;
   static int total = (int)TypeEventHandler.correctWord + TypeEventHandler.wrongWord;
   static int  accuracy = (int)(total - TypeEventHandler.wrongWord) / total *100;*/
   static VBox timesUpPane;
   public static VBox getTimesUpPane(){


       Label label = new Label();
   if(CalculateReport.speed >= CalculateReport.expectedSpeed && CalculateReport.accuracy >=CalculateReport.expectedAccuracy){
       label.setText("You Win");
       label.setTextFill(Color.GREEN);
    }
        else if(CalculateReport.speed < CalculateReport.expectedSpeed || CalculateReport.accuracy < CalculateReport.expectedAccuracy){
            label.setText("You Lose");
            label.setTextFill(Color.RED);
   }
        Button seeReport = new Button("See Report");

        Button nextLevel = new Button("Next Level");
       seeReport.setStyle("-fx-background-radius: 10px; -fx-padding: 10px 20px; -fx-background-color: green; -fx-text-fill: white;");
       seeReport.setPrefWidth(100);
       nextLevel.setStyle("-fx-background-radius: 10px; -fx-padding: 10px 20px; -fx-background-color: green; -fx-text-fill: white;");
       nextLevel.setPrefWidth(100);
        timesUpPane = new VBox(20);
        timesUpPane.setAlignment(Pos.TOP_CENTER);
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,40));
        timesUpPane.setPrefWidth(300);
        //timesUpPane.setPrefHeight(300);
        timesUpPane.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD,null,null)));
        timesUpPane.getChildren().add(label);
       HBox hBox = new HBox(20);
       hBox.setAlignment(Pos.CENTER);
       hBox.getChildren().add(seeReport);
       seeReport.setOnAction(e->{
           Stage stage = SignUp.getStage();
           Scene scene = Report.getReportScene();
           stage.setScene(scene);
       });
       String indicateNext= "";
       if(environment.levelIndicator == 3){
           indicateNext = "Beginner";
       }
       else if(environment.levelIndicator == 1){
           indicateNext = "Intermediate";
       }
       else if(environment.levelIndicator == 2){
           indicateNext = "Advanced";
       }

       final String inNext = indicateNext;

       nextLevel.setOnAction((e->{
           Level level = LevelFactory.createLevel(inNext);
           level.start();

       }));

       hBox.getChildren().add(nextLevel);
       if(CalculateReport.speed >= CalculateReport.expectedSpeed && CalculateReport.accuracy >=CalculateReport.expectedAccuracy){
           nextLevel.setDisable(false);
       }
       else if(CalculateReport.speed < CalculateReport.expectedSpeed || CalculateReport.accuracy < CalculateReport.expectedAccuracy){
           nextLevel.setDisable(true);
       }

     //  timesUpPane.getChildren().add(playAgain);
       //timesUpPane.setAlignment(Pos.BOTTOM_CENTER);
       hBox.setLayoutX(150);
       timesUpPane.getChildren().add(hBox);
       timesUpPane.setStyle("-fx-padding: 10px");
        return timesUpPane;


}}
