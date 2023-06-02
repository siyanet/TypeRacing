import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class GameEnviroment extends Application {
    static Line rightLine;
    static Line leftLine;
    static Camera camera;
    ImageView[] leftSideTrees = new ImageView[3];
    static ImageView [] rightSideTrees = new ImageView[3];
    static Pane sky;
static     double[]grassOnePointsX = {0.0,0.0,300.0};
   static double[] grassOnePointsY = {0.0,700.0,0.0};

  static  double[] grassTwoPointsX = {400.0,700.0,700.0};
  static  double[] grassTwoPointsY = {0.0,0.0,700.0};
  static  double[] roadPointsX = {300.0,0.0,700.0,400.0};
   static double[] roadPointsY = {0.0,700.0,700.0,0.0};
  static Canvas canvas;
  static SubScene subSceneTwo;
   static GraphicsContext gc;
    public static void draw(GraphicsContext gc, double[]grassOnePointsX,double[]grassOnePointsY,double[]grassTwoPointsX,double[]
                     grassTwoPointsY,double[]roadPointsX,double[]roadPointsY){
        gc.setFill(Color.FORESTGREEN);
        gc.fillPolygon(grassOnePointsX, grassOnePointsY,grassOnePointsX.length);
        gc.fillPolygon(grassTwoPointsX,grassTwoPointsY,grassTwoPointsX.length);

        gc.setFill(Color.GRAY);
        gc.fillPolygon(roadPointsX,roadPointsY,roadPointsY.length);
    }

    @Override
    public void start(Stage stage) throws Exception {
        canvas = new Canvas(700,700);
        gc = canvas.getGraphicsContext2D();
        Group root = new Group();
        Group subSceneParent = new Group();
        Pane fixedPane = new Pane();
        sky = enviromentSky.getSky();
        Pane displayPane = display.getPane();

        TextField textField = display.textField;
        textField.setOnKeyTyped(new TypeEventHandler());
        fixedPane.getChildren().add(sky);
        fixedPane.getChildren().add(displayPane);
        sky.prefWidthProperty().bind(fixedPane.widthProperty());
        sky.prefHeightProperty().bind(fixedPane.heightProperty());
        displayPane.prefHeightProperty().bind(fixedPane.heightProperty()) ;
        displayPane.prefWidthProperty().bind(fixedPane.widthProperty());
        SubScene subSceneOne = new SubScene(fixedPane,700,233);

        subSceneOne.setLayoutX(0);
        subSceneOne.setLayoutY(0);

        subSceneOne.widthProperty().bind(stage.widthProperty());
        fixedPane.prefWidthProperty().bind(stage.widthProperty());
        fixedPane.prefHeightProperty().bind(stage.heightProperty());
        subSceneOne.heightProperty().bind(stage.heightProperty().divide(3));

     /*   gc.setFill(Color.FORESTGREEN);
        gc.fillPolygon(grassOnePointsX, grassOnePointsY,grassOnePointsX.length);
        gc.fillPolygon(grassTwoPointsX,grassTwoPointsY,grassTwoPointsX.length);

       gc.setFill(Color.GRAY);
        gc.fillPolygon(roadPointsX,roadPointsY,roadPointsY.length);*/
        Group rfS = new Group();
        rfS.getChildren().add(canvas);
        subSceneTwo = new SubScene(rfS,700,467);
        subSceneTwo.setFill(Color.YELLOW);
        draw(gc,grassOnePointsX,grassOnePointsY,grassTwoPointsX,grassTwoPointsY,roadPointsX,roadPointsY);

      //  subSceneTwo.widthProperty().bind(stage.widthProperty());
      //  subSceneTwo.heightProperty().bind(stage.heightProperty());
      // canvas.widthProperty().bind(stage.widthProperty());
     // canvas.heightProperty().bind(stage.heightProperty());
       /*subSceneTwo.widthProperty().addListener((observable, oldValue,newValue) ->{
               grassOnePointsX[2] =   newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2);
               gc.setFill(Color.FORESTGREEN);
               gc.fillPolygon(grassOnePointsX,grassOnePointsY,grassOnePointsX.length);}
       );*/
        Image carimage = new Image("C:\\Users\\Siyan\\Desktop\\back-of-car-3.png");
        ImageView car = new ImageView(carimage);
        car.setLayoutX(300);
        car.setLayoutY(400);
        car.setFitHeight(149);
        car.setFitWidth(200);

        camera = new PerspectiveCamera(true);
        camera.setTranslateX(350);
        camera.setTranslateY(340);

        camera.setTranslateZ(-1300);
        camera.setFarClip(18000);
        camera.setNearClip(0.1);
        subSceneTwo.setCamera(camera);
        subSceneParent.getChildren().add(subSceneTwo);
        subSceneParent.getChildren().add(subSceneOne);

        root.getChildren().add(subSceneParent);

        Scene scene = new Scene(root,700,700);
        stage.setScene(scene);

        stage.show();

    }
    public static void main(String[] args) {
        Application.launch(args);
    }

}
