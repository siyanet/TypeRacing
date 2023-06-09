import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
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
   static Image carimage = new Image("C:\\Users\\Siyan\\Desktop\\back-of-car-3.png");
  static Canvas canvas;
  static Pane cameraPane;
  static SubScene subSceneTwo;
    static double cameraTranslateY = 280;
    static double cameraTranslateZ = -900;
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
        fixedPane.prefHeightProperty().bind(stage.heightProperty().divide(3));
        subSceneOne.heightProperty().bind(stage.heightProperty().divide(3));

        cameraPane= new Pane();
        //cameraPane.setBackground(new Background(new BackgroundFill(Color.ROYALBLUE,null,null)));
       draw(gc,grassOnePointsX,grassOnePointsY,grassTwoPointsX,grassTwoPointsY,roadPointsX,roadPointsY);
        gc.drawImage(carimage,200,100,150,150);

        cameraPane.getChildren().add(canvas);

        cameraPane.setBackground(new Background(new BackgroundFill(Color.VIOLET,null,null)));
        subSceneTwo = new SubScene(cameraPane,700,700,true,SceneAntialiasing.BALANCED);
        //subSceneTwo.setFill(Color.YELLOW);


        subSceneTwo.setLayoutX(0);
        subSceneTwo.setLayoutY(0);
       //cameraPane.setLayoutY(0);
        //subSceneTwo.setHeight(700);

       subSceneTwo.widthProperty().bind(stage.widthProperty());
       subSceneTwo.heightProperty().bind(stage.heightProperty());
      //  subSceneTwo.heightProperty().bind(stage.heightProperty().divide(3).multiply(2));
        //subSceneTwo.layoutYProperty().bind(stage.heightProperty().divide(3));
        cameraPane.prefWidthProperty().bind(subSceneTwo.widthProperty());
        cameraPane.prefHeightProperty().bind(subSceneTwo.heightProperty());
        //cameraPane.layoutYProperty().bind(stage.heightProperty().divide(3));


     /*  subSceneTwo.widthProperty().addListener((observable, oldValue,newValue) ->{
               grassOnePointsX[2] =   newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2);
               gc.setFill(Color.FORESTGREEN);
               gc.fillPolygon(grassOnePointsX,grassOnePointsY,grassOnePointsX.length);}
       );*/

        ImageView car = new ImageView(carimage);
       // car.setLayoutX(300);
       // car.setLayoutY(400);
       // car.setFitHeight(149);
       // car.setFitWidth(200);


        camera = new PerspectiveCamera(true);
       // camera.setTranslateX(350);
       // camera.setTranslateY(280);

        //camera.setTranslateZ(-1000);
        camera.setTranslateX(350);
        camera.setTranslateY(340);

        camera.setTranslateZ(-1300);
        camera.setFarClip(18000);
        camera.setNearClip(0.1);
       subSceneTwo.setCamera(camera);



        subSceneParent.getChildren().add(subSceneTwo);
        subSceneParent.getChildren().add(subSceneOne);





      //  root.getChildren().add(subSceneParent);

        Scene scene = new Scene(subSceneParent,700,700);
        stage.setScene(scene);

        stage.show();

    }
    public static void main(String[] args) {
        Application.launch(args);
    }

}
