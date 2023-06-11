import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.ResultSet;

public class displayword extends Application {
     static Pane pane;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
         String []word = new String[50] ;
         pane = new VBox();
        Pane pane1 = new StackPane();
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(100);
        rectangle.setWidth(700);
        rectangle.setFill(Color.ALICEBLUE);
        TextField textField = new TextField();
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
        Text text = new Text();
       text.setText(word[0]);
        textField.setOnKeyTyped(event-> {
            if(event.getCode().equals(word[0].charAt(1))){
               // move.dosomething();
            }
        }      );
        pane1.getChildren().add(rectangle);
        pane1.getChildren().add(text);
        pane.getChildren().add(pane1);
        pane.getChildren().add(textField);
        Scene scene = new Scene(pane,700,700);
        stage.setScene(scene);
        stage.show();

    }
    public static Pane getPane(){
        return pane;
    }
}
