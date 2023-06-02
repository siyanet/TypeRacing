import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class enviromentSky {
    private static Pane pane;
    public static Pane getSky(){
        Rectangle sky = new Rectangle();
       pane = new Pane();
        pane.setMinWidth(500);
        sky = new Rectangle(0, 0);
        sky.widthProperty().bind(pane.widthProperty());
        sky.heightProperty().bind(pane.heightProperty());
        sky.setStrokeWidth(-4);
      //  sky.setTranslateZ(-350);
        Image skyimage = new Image("C:\\Users\\Siyan\\Desktop\\sky.jpg");
        ImagePattern skyimagepattern = new ImagePattern(skyimage);
        sky.setFill(skyimagepattern);
        pane.getChildren().add(sky);
        return pane;
    }
    }
