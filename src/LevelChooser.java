import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class LevelChooser extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane parent = new Pane();
        Image backgroundImage = new Image("C:\\Users\\Siyan\\Downloads\\1798247.jpg");
        parent.setBackground(new Background(new BackgroundImage(backgroundImage,null,null,null,null)));

        Pane subParent = new HBox(5);
        VBox subSubParentOne = new VBox(25);
        subSubParentOne.setAlignment(Pos.CENTER);
        VBox subSubParentTwo = new VBox(20);
        subSubParentTwo.setAlignment(Pos.CENTER);
        VBox subSubParentThree = new VBox(20);
        subSubParentThree.setAlignment(Pos.CENTER);
        Pane levelOne = new Pane();
        Pane levelTwo = new Pane();
        Pane levelThree = new Pane();
        subParent.setPrefWidth(600);
        subParent.setPrefHeight(250);

        Label beginner = new Label("Beginner");
        Label intermidate = new Label("Intermidate");
        Label advanced = new Label("advanced");

        beginner.setFont(Font.font("Bodoni Mt Black", FontPosture.ITALIC,25));
        intermidate.setFont(Font.font("Bodoni Mt Black", FontPosture.ITALIC,25));
        advanced.setFont(Font.font("Bodoni Mt Black", FontPosture.ITALIC,25));
        beginner.setTextFill(Color.YELLOW);
        intermidate.setTextFill(Color.YELLOW);
        advanced.setTextFill(Color.YELLOW);
        Image carOne = new Image("C:\\Users\\Siyan\\Downloads\\gamecar3.png");
        Image carTwo = new Image("C:\\Users\\Siyan\\Downloads\\gamecar2.png");
        Image carThree = new Image("C:\\Users\\Siyan\\Downloads\\gamecar1.png");
        ImageView carOneView = new ImageView(carOne);
        ImageView carTwoView = new ImageView(carTwo);
        ImageView carThreeView = new ImageView(carThree);
        subSubParentOne.setBackground(new Background(new BackgroundFill(Color.FORESTGREEN,null,null)));
        subSubParentTwo.setBackground(new Background(new BackgroundFill(Color.FORESTGREEN,null,null)));
        subSubParentThree.setBackground(new Background(new BackgroundFill(Color.FORESTGREEN,null,null)));
        subSubParentOne.getChildren().add(beginner);
        subSubParentTwo.getChildren().add(intermidate);
        subSubParentThree.getChildren().add(advanced);
        subSubParentOne.getChildren().add(carOneView);
        subSubParentTwo.getChildren().add(carTwoView);
        subSubParentThree.getChildren().add(carThreeView);
        subParent.getChildren().add(subSubParentOne);
        subParent.getChildren().add(subSubParentTwo);
        subParent.getChildren().add(subSubParentThree);
    //  subParent.setBackground(new Background(new BackgroundFill(Color.FORESTGREEN,null,null)));
        parent.getChildren().add(subParent);



      //  beginner.setPrefSize();



        Scene scene = new Scene(parent,700,700);

        subParent.prefWidthProperty().bind(scene.widthProperty().divide(1.3));
        subParent.prefHeightProperty().bind(scene.heightProperty().divide(2.7));
       subParent.layoutXProperty().bind(scene.widthProperty().divide(2).subtract(scene.widthProperty().divide(2.6)));
       subParent.layoutYProperty().bind(scene.heightProperty().divide(2).subtract(subParent.getPrefHeight()/2));
       subSubParentOne.prefWidthProperty().bind(subParent.prefWidthProperty().divide(3));
       subSubParentTwo.prefWidthProperty().bind(subParent.prefWidthProperty().divide(3));
       subSubParentThree.prefWidthProperty().bind(subParent.prefWidthProperty().divide(3));
       subSubParentOne.setOnMouseClicked(e-> ChooseLevel.chooseLevel("Beginner"));
       subSubParentTwo.setOnMouseClicked(e-> ChooseLevel.chooseLevel("Intermediate"));
       subSubParentThree.setOnMouseClicked(e->ChooseLevel.chooseLevel("Advanced"));

       /* subParent.widthProperty().addListener((observable, oldValue,newValue) ->{
            beginner.setFont(Font.font("Bodoni Mt Black", FontPosture.ITALIC,45));
            intermidate.setFont(Font.font("Bodoni Mt Black", FontPosture.ITALIC,45));
            advanced.setFont(Font.font("Bodoni Mt Black", FontPosture.ITALIC,45));}
        );*/
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args){

        Application.launch(args);
    }
}
