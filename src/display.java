import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.sql.ResultSet;

public class display {
    static TextField textField;
    static String []word = new String[50] ;
    static Text text;
    private static Pane pane;
    public static Pane getPane(){

    pane = new VBox();
    Pane pane1 = new StackPane();
    Rectangle rectangle = new Rectangle();
        rectangle.setHeight(20);
        rectangle.setWidth(700);
        rectangle.setFill(Color.ALICEBLUE);
     textField = new TextField();
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
        pane1.getChildren().add(rectangle);
        pane1.getChildren().add(text);
        pane.getChildren().add(pane1);
        pane.getChildren().add(textField);
return pane;
}}
