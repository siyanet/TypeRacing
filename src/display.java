import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;

import java.sql.ResultSet;

public class display {
    static TextField textField;
    static String []word = new String[50] ;
    static Text text;
    private static Pane pane;
    public static Pane getPane(){

    pane = new VBox(5);
    Pane pane1 = new StackPane();
    Rectangle rectangle = new Rectangle();
        rectangle.setHeight(30);
      //  rectangle.widthProperty().bind(pane1.widthProperty());
        rectangle.setFill(Color.WHITESMOKE);
     textField = new TextField();
     textField.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE,null,null)));
        textField.setStyle("-fx-font-size: 20px; -fx-text-fill: black; -fx-alignment: center;");
    ResultSet result = resultset.getResultSet();
        try{
        int i = 0;
        while(result.next() && i < 50){

            word[i] = result.getString(2);
            i++;
        }}

        catch(Exception e){
        e.printStackTrace();
    }
        text = new Text();
       text.setText(word[0]);
       text.setFill(Color.CHOCOLATE);
       text.setTextAlignment(TextAlignment.CENTER);

       pane1.prefWidthProperty().bind(environment.fixedPane.widthProperty());
       rectangle.widthProperty().bind(pane1.widthProperty());
        text.setFont(Font.font("TIMES NEW ROMAN", FontWeight.NORMAL, FontPosture.REGULAR,18));


        pane1.getChildren().add(rectangle);
        pane1.getChildren().add(text);
        pane.getChildren().add(pane1);
        pane.getChildren().add(textField);
return pane;
}}
