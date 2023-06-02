import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Grass {
    /*private static Pane grass;


    public Polygon getGrass(){
        Polygon grassside1 = new Polygon();
        grassside1.setFill(Color.FORESTGREEN);
        grassside1.setStrokeWidth(0);
        Double[] pointsone = {  0.0,233.3,
                0.0,700.0,
                200.0,233.3};
        grassside1.getPoints().addAll(pointsone);
        grass.widthProperty().addListener((observable, oldValue, newValue) ->
                grassside1.getPoints().setAll(
                        0.0, 0.0,
                        newValue.doubleValue() , newValue.doubleValue(),
                        newValue.doubleValue() / 4 + , 0.0
                ));

    }
}
    Polygon polygon = new Polygon();
        polygon.setFill(Color.BLUE);

                // Define the points for the polygon
                Double[] points = {100.0, 100.0, 200.0, 200.0, 300.0, 100.0};
                polygon.getPoints().addAll(points);

                // Bind polygon points to the pane size
                pane.widthProperty().addListener((observable, oldValue, newValue) ->
                polygon.getPoints().setAll(
                0.0, 0.0,
                newValue.doubleValue() / 2, newValue.doubleValue(),
                newValue.doubleValue(), 0.0
                ));

                pane.heightProperty().addListener((observable, oldValue, newValue) ->
                polygon.getPoints().setAll(
                0.0, 0.0,
                pane.getWidth() / 2, pane.getHeight(),
                pane.getWidth(), 0.0
                ));
*/}