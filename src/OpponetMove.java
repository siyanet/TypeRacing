import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

public class OpponetMove {
  // static int opponetCar = 0;
   static Timeline timeline;
    public static void move( int opponetCarX, int opponetCarY){
        /*timeline = new Timeline(new KeyFrame(Duration.seconds(0.5),event ->{
            opponetCarY -=5 ;


        }));
        timeline.setCycleCount(80);*/
        environment.carTwo.getTransforms().clear();
       // environment.carTwo.setFitWidth(environment.carTwo.getFitWidth() - 1);
        //environment.carTwo.setFitHeight(environment.carTwo.getFitHeight() - 1);
        environment.carTwo.getTransforms().add(new Translate(opponetCarX,opponetCarY));

    }
}
