

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;

import javafx.scene.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;



//public class environment extends Application {
public class environment {

    static Polyline road;
    static Polygon roadCenterTwo;
    static Polygon roadCenter;
    static ImageView car;
    static ImageView carTwo;
    static Line rightLine;
    static Line leftLine;
    static Camera camera;
    static ImageView [] leftSideTrees = new ImageView[3];
    static ImageView [] rightSideTrees = new ImageView[3];
    static Pane sky;
    static Pane pane;
    static double cameraTranslateY = 350;
    static double cameraTranslateZ = -1300;
    static double remainingSeconds = 0;
    static Label timeLabel;
    static Timeline timeline;
    boolean play;
    static Scene scene;
   static  int opponentCarY = 0;
   static int opponentCarX = 0;
   static Timeline opponentTimeline;
   static int levelIndicator;

   // @Override
   // public void start(Stage stage) throws Exception {
    public static Scene getEnvironmentScene(int minute,Stage stage){
        remainingSeconds = 60 *minute;
        pane = new Pane();
        Canvas canvas = new Canvas(700,700);
        GraphicsContext gc = canvas.getGraphicsContext2D();
       Group root = new Group();
       Group subSceneParent = new Group();
       Pane fixedPane = new Pane();

       // pane.setMinWidth(500);
         sky = enviromentSky.getSky();
        Pane displayPane = display.getPane();
        timeLabel = new Label();
        timeLabel.setText("Remaining Seconds: " + remainingSeconds + "S");
        TextField textField = display.textField;
        Button buttonPlay = new Button("Play");
        Button buttonPause = new Button("pause");
        buttonPause.setLayoutX(550);
        buttonPlay.setLayoutX(600);
        textField.setOnKeyTyped(new TypeEventHandler());
        textField.setDisable(true);
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event->{
            remainingSeconds--;
            if(remainingSeconds >=0){
                environment.timeLabel.setText("Remaining seconds: " + environment.remainingSeconds);}}));
        timeline.setOnFinished(e->{
            textField.setDisable(true);
            CalculateReport.calculate();
            ConnectToScene.connectReport();
        });
        opponentTimeline = new Timeline(new KeyFrame(Duration.seconds(0.5),event->{
            opponentCarY-=5;
            opponentCarX-=1;
            OpponetMove.move(opponentCarX,opponentCarY);
        }));
        opponentTimeline.setCycleCount(minute * 120);
       /* if(remainingSeconds > 0){


            }

        else{
            timeline.stop();
            System.out.println("game over");
        }*/
        timeline.setCycleCount(minute * 60);
        buttonPlay.setOnAction(e->{
            if(remainingSeconds >0){
            textField.setDisable(false);
            timeline.play();
            opponentTimeline.play();
           }

        });
        buttonPause.setOnAction(e->{
            timeline.pause();
            textField.setDisable(true);
            opponentTimeline.pause();
        });
        fixedPane.getChildren().add(sky);
        fixedPane.getChildren().add(timeLabel);
        fixedPane.getChildren().add(buttonPause);
        fixedPane.getChildren().add(buttonPlay);
        displayPane.setLayoutY(40);
       // displayPane.setLayoutX();
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
       // subSceneParent.getChildren().add(subSceneOne);

        Polygon grassside1 = new Polygon();
        grassside1.setFill(Color.FORESTGREEN);
       grassside1.setStrokeWidth(0);
        /*double[] pointsOne = {  0.0,0.0,
                0.0,700.0,
                200.0,0.0};*/
        double[]pointsOne = {0.0,0.0,200.0};
        double[] pointOneIndex = {0.0,700.0,0.0};
        //grassside1.getPoints().addAll(pointOne);
        gc.setFill(Color.FORESTGREEN);
        gc.fillPolygon(pointsOne, pointOneIndex,pointsOne.length);
        pane.widthProperty().addListener((observable, oldValue, newValue) ->
                grassside1.getPoints().setAll(
                        0.0, 0.0,
                        0.0, 700.0,
                        newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2) , 0.0
                ));
        pane.heightProperty().addListener((observable, oldValue, newValue) ->
                grassside1.getPoints().setAll(
                        0.0, 0.0,
                        0.0 , newValue.doubleValue(),
                        pane.getWidth() / 4 + pane.getWidth()/4/2, 0.0
                ));

       // grassside1.setStrokeWidth(0);
       Polygon grassside2 = new Polygon();
        Double[] pointstwo = { 500.0,0.0,
                700.0,0.0,
                700.0,700.0};

        grassside2.getPoints().addAll(pointstwo);
        pane.widthProperty().addListener((observable, oldValue, newValue) ->
                grassside2.getPoints().setAll(
                        newValue.doubleValue() / 2 + (newValue.doubleValue() / 8), 0.0,
                        newValue.doubleValue(), 700.0,
                        newValue.doubleValue()  , 0.0
                ));
        pane.heightProperty().addListener((observable, oldValue, newValue) ->
                grassside2.getPoints().setAll(
                        pane.getWidth() / 2 + ( pane.getWidth() / 8) ,0.0 ,
                        pane.getWidth(), 0.0,
                        pane.getWidth() , newValue.doubleValue()
                ));
        grassside2.setFill(Color.FORESTGREEN);
        grassside2.setStrokeWidth(0);

        road = new Polyline();
        Double []roadpoints = { pane.getWidth() / 4 + pane.getWidth() /4/2,0.0,
                0.0,700.0,
                700.0,700.0,
                pane.getWidth() / 4 + (pane.getWidth() /4 /2) + pane.getWidth() / 4 ,0.0
        };
        road.getPoints().addAll(roadpoints);
        pane.widthProperty().addListener((observable, oldValue, newValue) ->
                road.getPoints().setAll(
                       newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2), 0.0,
                        0.0,700.0,
                        newValue.doubleValue(), 700.0,
                        newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2) + (newValue.doubleValue() / 4), 0.0
                ));
       pane.heightProperty().addListener((observable, oldValue, newValue) ->
                road.getPoints().setAll(
                       pane.getWidth() / 4 + pane.getWidth() /4/2, 0.0 ,
                        0.0, newValue.doubleValue(),
                        pane.getWidth(), newValue.doubleValue(),
                        pane.getWidth() / 4 + (pane.getWidth() /4 /2) + pane.getWidth() / 4, 0.0
                ));
        road.setFill(Color.GRAY);
        road.setStrokeWidth(0);



        roadCenter = new Polygon();
        Double [] centerpoints = { 361.0,233.3,
                356.0,266.0,
                366.0,266.0,
                364.0,233.3};

        roadCenter.getPoints().addAll(centerpoints);
        roadCenter.setFill(Color.YELLOW);
        pane.widthProperty().addListener((observable, oldValue, newValue) ->
                roadCenter.getPoints().setAll(
                        newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2) + (newValue.doubleValue() /4/2.112), 233.3,
                        newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2) + (newValue.doubleValue() /4/2.25),266.0,
                        newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2) + (newValue.doubleValue() / 4/1.75), 266.0,
                        newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2) + (newValue.doubleValue() / 4/1.875), 233.3
                ));
        pane.heightProperty().addListener((observable, oldValue, newValue) ->
                roadCenter.getPoints().setAll(
                        pane.getWidth() / 4 + pane.getWidth() /4/2 + pane.getWidth() /4/2.112, newValue.doubleValue() / 3 ,
                        pane.getWidth() / 4 + pane.getWidth() /4/2 + pane.getWidth() /4/2.25, 266.0,
                        pane.getWidth() /4 + pane.getWidth()/4/2 + pane.getWidth()/4/1.75, 266.0,
                        pane.getWidth() /4 + pane.getWidth()/4/2 + pane.getWidth()/4/1.875, newValue.doubleValue() / 3
                ));
        roadCenterTwo = new Polygon();
        Double[] centerpointstwo = { 362.0,350.3,
                356.0,410.0,
                374.0,410.0,
                368.0,350.3};
        roadCenterTwo.getPoints().addAll(centerpointstwo);
        roadCenterTwo.setFill(Color.YELLOW);
     pane.widthProperty().addListener((observable, oldValue, newValue) ->
             roadCenterTwo.getPoints().setAll(
                     newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2) + (newValue.doubleValue() /4/2.112), pane.getHeight()/3 + pane.getHeight() /3/2.30,
                     newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2) + (newValue.doubleValue() /4/2.25),pane.getHeight()/3 + pane.getHeight() /3/1.15,
                     newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2) + (newValue.doubleValue() / 4/1.75), pane.getHeight()/3 + pane.getHeight() /3/1.15,
                     newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2) + (newValue.doubleValue() / 4/1.875),  pane.getHeight()/3 + pane.getHeight() /3/2.30
             ));
     pane.heightProperty().addListener((observable, oldValue, newValue) ->
             roadCenterTwo.getPoints().setAll(
                     pane.getWidth() / 4 + pane.getWidth() /4/2 + pane.getWidth() /4/2.112, newValue.doubleValue() / 3  + newValue.doubleValue()/3/2.30,
                     pane.getWidth() / 4 + pane.getWidth() /4/2 + pane.getWidth() /4/2.25, newValue.doubleValue()/3 + newValue.doubleValue()/3/1.5,
                     pane.getWidth() /4 + pane.getWidth()/4/2 + pane.getWidth()/4/1.75, newValue.doubleValue()/3 + newValue.doubleValue()/3/1.5,
                     pane.getWidth() /4 + pane.getWidth()/4/2 + pane.getWidth()/4/1.875, newValue.doubleValue() / 3 + newValue.doubleValue()/3/2.3
             ));

        Polygon roadCenterThree = new Polygon();

        Double[] centerPointsthree = { 360.0,550.3,
                350.0,650.0,
                380.0,650.0,
                370.0,550.3};
        roadCenterThree.getPoints().addAll(centerPointsthree);
        roadCenterThree.setFill(Color.YELLOW);
     pane.widthProperty().addListener((observable, oldValue, newValue) ->{
             roadCenterThree.getPoints().setAll(
                     newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2) + (newValue.doubleValue() /4/2.112), pane.getHeight() - 125,
                     newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2) + (newValue.doubleValue() /4/2.25),pane.getHeight() - 50,
                     newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2) + (newValue.doubleValue() / 4/1.75), pane.getHeight() - 50,
                     newValue.doubleValue() / 4 + (newValue.doubleValue() / 4 /2) + (newValue.doubleValue() / 4/1.875),  pane.getHeight() - 125
             ); });
     pane.heightProperty().addListener((observable, oldValue, newValue) ->
             roadCenterThree.getPoints().setAll(
                     pane.getWidth() / 4 + pane.getWidth() /4/2 + pane.getWidth() /4/2.112, newValue.doubleValue() - 125,
                     pane.getWidth() / 4 + pane.getWidth() /4/2 + pane.getWidth() /4/2.25, newValue.doubleValue() - 50,
                     pane.getWidth() /4 + pane.getWidth()/4/2 + pane.getWidth()/4/1.75, newValue.doubleValue() - 50,
                     pane.getWidth() /4 + pane.getWidth()/4/2 + pane.getWidth()/4/1.875, newValue.doubleValue() -125
             ));

        Image carimage = new Image("C:\\Users\\Siyan\\Desktop\\back-of-car-3.png");
         car = new ImageView(carimage);
        car.setLayoutX(150);
        car.setLayoutY(470);
        car.setFitHeight(149);
        car.setFitWidth(200);
        car.layoutXProperty().bind(pane.widthProperty().divide(5));
        pane.widthProperty().addListener((observable, oldValue, newValue)-> {
                    if (newValue.doubleValue() > oldValue.doubleValue()){
                        car.layoutXProperty().bind(pane.widthProperty().divide(4));
                }
                    else{
                        car.layoutXProperty().bind(pane.widthProperty().divide(5));
                    }}

                );


        Image carImageTwo = new Image("C:\\Users\\Siyan\\Desktop\\Back-of-car-new.png");
        carTwo = new ImageView(carImageTwo);
        carTwo.setLayoutX(450);
        carTwo.setLayoutY(470);
        carTwo.setFitHeight(150);
        carTwo.setFitWidth(150);
        carTwo.layoutXProperty().bind(pane.widthProperty().divide(1.5));
        pane.widthProperty().addListener((observable, oldValue, newValue)-> {
            if (newValue.doubleValue() > oldValue.doubleValue()){
                carTwo.layoutXProperty().bind(pane.widthProperty().divide(1.7));
            }
            else{
                carTwo.layoutXProperty().bind(pane.widthProperty().divide(1.7));
            }}

        );


        Image treeimage = new Image("C:\\Users\\Siyan\\Desktop\\tree2.png");
        leftLine = new Line();


        leftLine.setStartX(0);
        leftLine.setEndX(233.3);
        leftLine.setStartY(700);
        leftLine.setEndY(0.0);
        leftLine.startYProperty().bind(pane.heightProperty());
        leftLine.endXProperty().bind(pane.widthProperty().divide(4).add(pane.widthProperty().divide(4).divide(2)) );
        //leftLine.endYProperty().bind(pane.heightProperty().divide(3));
        leftLine.setFill(Color.BLACK);


            leftSideTrees[0] = new ImageView(treeimage);
            leftSideTrees[0].setFitHeight(70);
            leftSideTrees[0].setFitWidth(50);
            leftSideTrees[0].layoutXProperty().bind(leftLine.endXProperty().subtract(leftSideTrees[0].getFitWidth()*1.4));
            leftSideTrees[0].layoutYProperty().bind(leftLine.endYProperty().add(leftSideTrees[0].getFitHeight()/1.7));

        leftSideTrees[1] = new ImageView(treeimage);
        leftSideTrees[1].setFitHeight(110);
        leftSideTrees[1].setFitWidth(85);
        leftSideTrees[1].layoutXProperty().bind(leftLine.endXProperty().divide(2).subtract(leftSideTrees[1].getFitWidth()/3));
        leftSideTrees[1].layoutYProperty().bind(leftLine.startYProperty().divide(2).subtract(leftSideTrees[1].getFitHeight()*1.4));

        leftSideTrees[2] = new ImageView(treeimage);
        leftSideTrees[2].setFitHeight(275);
        leftSideTrees[2].setFitWidth(250);
        leftSideTrees[2].layoutXProperty().bind(leftLine.startXProperty().subtract(leftSideTrees[2].getFitWidth()/3));
        leftSideTrees[2].layoutYProperty().bind(leftLine.startYProperty().subtract( leftSideTrees[2].getFitHeight()*1.4));
        rightLine = new Line();


        rightLine.setStartX(700);
        rightLine.setEndX(233.3);
        rightLine.setStartY(700);
        rightLine.setEndY(0.0);
        rightLine.startYProperty().bind(pane.heightProperty());
        rightLine.endXProperty().bind(pane.widthProperty().divide(2).add(pane.widthProperty().divide(8)));
        //rightLine.endYProperty().bind(pane.heightProperty().divide(3));
        rightLine.startXProperty().bind(pane.widthProperty());
        rightLine.setFill(Color.BLACK);
        // leftLine.setStrokeWidth(5);



        rightSideTrees[0] = new ImageView(treeimage);
        rightSideTrees[0].setFitHeight(70);
        rightSideTrees[0].setFitWidth(50);
        rightSideTrees[0].layoutXProperty().bind(rightLine.endXProperty().add(rightSideTrees[0].getFitWidth()/2));
        rightSideTrees[0].layoutYProperty().bind(rightLine.endYProperty().add(rightSideTrees[0].getFitHeight()/1.7));

        rightSideTrees[1] = new ImageView(treeimage);
        rightSideTrees[1].setFitHeight(110);
        rightSideTrees[1].setFitWidth(85);
        rightSideTrees[1].layoutXProperty().bind(rightLine.endXProperty().add(rightLine.endXProperty().divide(6)));
        rightSideTrees[1].layoutYProperty().bind(rightLine.startYProperty().divide(2).subtract(rightSideTrees[1].getFitHeight()*1.4));

        rightSideTrees[2] = new ImageView(treeimage);
        rightSideTrees[2].setFitHeight(275);
        rightSideTrees[2].setFitWidth(250);
        rightSideTrees[2].layoutXProperty().bind(rightLine.startXProperty().subtract(rightSideTrees[2].getFitWidth()/1.55));
        rightSideTrees[2].layoutYProperty().bind(rightLine.startYProperty().subtract( rightSideTrees[2].getFitHeight()*1.4));


        camera = new PerspectiveCamera(true);
		camera.setLayoutX(pane.getWidth()/2);
		camera.setTranslateY(340);

        camera.setTranslateZ(-1300);
		camera.setFarClip(18000);
		camera.setNearClip(0.1);


        pane.getChildren().add(grassside1);
        pane.getChildren().add(road);
        pane.getChildren().add(grassside2);

        pane.getChildren().add(roadCenter);
        pane.getChildren().add(roadCenterTwo);
       // pane.getChildren().add(roadCenterThree);
        pane.getChildren().add(car);
        pane.getChildren().add(carTwo);
       // pane.getChildren().add(leftSideTrees[0]);
        pane.getChildren().add(leftSideTrees[1]);
       // pane.getChildren().add(leftSideTrees[2]);
       // pane.getChildren().add(rightSideTrees[0]);
        pane.getChildren().add(rightSideTrees[1]);
       // pane.getChildren().add(rightSideTrees[2]);
        //pane.getChildren().add(leftSideTrees[2]);
        pane.getChildren().add(leftLine);
        pane.getChildren().add(rightLine);
        pane.setBackground(new Background(new BackgroundFill(Color.ROYALBLUE,null,null)));
       SubScene subSceneTwo = new SubScene(pane,700,467,true,SceneAntialiasing.BALANCED);
        Group rfS = new Group();
        rfS.getChildren().add(canvas);
      //  SubScene subSceneTwo = new SubScene(rfS,700,467);

      /* pane.setBackground(new Background(new BackgroundFill(Color.YELLOW,null,null)));
        pane.prefHeightProperty().bind(subSceneTwo.heightProperty());
        pane.prefWidthProperty().bind(subSceneTwo.widthProperty());*/
       subSceneTwo.widthProperty().bind(stage.widthProperty());
       subSceneTwo.heightProperty().bind(stage.heightProperty());
        subSceneTwo.widthProperty().addListener((observable, oldValue, newValue) ->
                camera.setLayoutX(newValue.doubleValue()/2)
        );
        subSceneTwo.setCamera(camera);
        subSceneParent.getChildren().add(subSceneTwo);
        subSceneParent.getChildren().add(subSceneOne);

        //root.getChildren().add(subSceneParent);

        scene = new Scene(subSceneParent,700,700);
       // pane.translateXProperty().bind(scene.xProperty());
       // pane.translateYProperty().bind(scene.yProperty());


       /* stage.setScene(scene);

        stage.show();*/
        return scene;

    }
  /*  public static void main(String[] args) {
        Application.launch(args);
    }*/

}
