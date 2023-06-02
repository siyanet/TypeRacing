import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class enviro extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        pane.setMinWidth(500);
        Rectangle sky = new Rectangle(0,0);
        sky.widthProperty().bind(pane.widthProperty());
        sky.heightProperty().bind(pane.heightProperty().divide(3));
        sky.setStrokeWidth(-4);
        sky.setTranslateZ(-350);
        Image skyimage = new Image("C:\\Users\\Siyan\\Desktop\\sky.jpg");
        ImagePattern skyimagepattern = new ImagePattern(skyimage);
        sky.setFill(skyimagepattern);
        pane.getChildren().add(sky);

        Polygon waterside1 = new Polygon();


        waterside1.getPoints().addAll(new Double[] {
                0.0,233.3,
                0.0,700.0,
                200.0,233.3

        });
        Image waterimage = new Image("C:\\Users\\Siyan\\Pictures\\Lake_Tana,_Ethiopia.jpg");
        ImagePattern waterimagepattern = new ImagePattern(waterimage);

        waterside1.setFill(Color.FORESTGREEN);
        waterside1.setStrokeWidth(0);
        waterside1.setTranslateZ(-300);
        waterside1.setScaleZ(-100);

        Polyline road = new Polyline();
        road.getPoints().addAll(new Double[] {
                200.0,233.3,
                0.0,700.0,
                700.0,700.0,
                500.0,233.3

        });
        //road.setScaleX(1);
        //road.setScaleY(1);
        //road.setScaleZ(6);
        //road.setTranslateZ(40);
        road.setFill(Color.GRAY);
        road.setStrokeWidth(0);



        Polygon roadCenter = new Polygon();
        roadCenter.getPoints().addAll(new Double[] {
                361.0,233.3,
                356.0,266.0,
                366.0,266.0,
                364.0,233.3

        });
        roadCenter.setFill(Color.YELLOW);
        Polygon roadCenterTwo = new Polygon();
        roadCenterTwo.getPoints().addAll(new Double[] {
                362.0,350.3,
                356.0,410.0,
                374.0,410.0,
                368.0,350.3

        });
        roadCenterTwo.setFill(Color.YELLOW);

        Polygon roadCenterThree = new Polygon();
        roadCenterThree.getPoints().addAll(new Double[] {
                360.0,550.3,
                350.0,650.0,
                380.0,650.0,
                370.0,550.3

        });
        roadCenterThree.setFill(Color.YELLOW);
        Polygon lastRoadCenter = new Polygon();
        lastRoadCenter = roadCenter;
        Polygon waterside2 = new Polygon();


        waterside2.getPoints().addAll(new Double[] {
                500.0,233.3,
                700.0,233.3,
                700.0,700.0

        });
        waterside2.setFill(Color.FORESTGREEN);
        waterside2.setStrokeWidth(0);
        Image carimage = new Image("C:\\Users\\Siyan\\Desktop\\back-of-car-3.png");
        ImageView car = new ImageView(carimage);
        car.setLayoutX(300);
        car.setLayoutY(400);
        car.setFitHeight(149);
        car.setFitWidth(200);
        Image treeimage = new Image("C:\\Users\\Siyan\\Desktop\\tree2.png");
        ImageView tree1 = new ImageView(treeimage);
        tree1.setLayoutX(-25);
        tree1.setLayoutY(400);
        tree1.setFitHeight(300);
        tree1.setFitWidth(150);
        ImageView tree2 = new ImageView(treeimage);
        tree2.setLayoutX(40);
        tree2.setLayoutY(325);
        tree2.setFitHeight(150);
        tree2.setFitWidth(150);
        ImageView tree3 = new ImageView(treeimage);
        tree3.setLayoutX(90);
        tree3.setLayoutY(250);
        tree3.setFitHeight(100);
        tree3.setFitWidth(150);
        ImageView tree4= new ImageView(treeimage);
        tree4.setLayoutX(130);
        tree4.setLayoutY(220);
        tree4.setFitHeight(50);
        tree4.setFitWidth(125);
        ImageView tree5= new ImageView(treeimage);
        tree5.setLayoutX(160);
        tree5.setLayoutY(225);
        tree5.setFitHeight(10);
        tree5.setFitWidth(90);
        ImageView lastTreeLeft = new ImageView();
        //lastTreeLeft = tree4;

        ImageView tree21 = new ImageView(treeimage);
        tree21.setLayoutX(580);
        tree21.setLayoutY(400);
        tree21.setFitHeight(300);
        tree21.setFitWidth(150);
        ImageView tree22 = new ImageView(treeimage);
        tree22.setLayoutX(510);
        tree22.setLayoutY(325);
        tree22.setFitHeight(150);
        tree22.setFitWidth(150);
        ImageView tree23 = new ImageView(treeimage);
        tree23.setLayoutX(460);
        tree23.setLayoutY(250);
        tree23.setFitHeight(100);
        tree23.setFitWidth(150);
        ImageView tree24= new ImageView(treeimage);
        tree24.setLayoutX(440);
        tree24.setLayoutY(220);
        tree24.setFitHeight(50);
        tree24.setFitWidth(125);
        ImageView tree25= new ImageView(treeimage);
        tree25.setLayoutX(438);
        tree25.setLayoutY(225);
        tree25.setFitHeight(25);
        tree25.setFitWidth(90);
        ImageView trees[] = {tree1,tree2,tree3,tree4};
        //lastTreeRight = tree24;
        //firstTreeRight = tree21;
		/*Camera camera = new PerspectiveCamera(true);
		camera.translateXProperty().set(0);
		camera.translateYProperty().set(0);
		camera.translateZProperty().set(-100);
		camera.setFarClip(1000);
		camera.setNearClip(0.1); */
        pane.getChildren().add(waterside1);
        pane.getChildren().add(road);
        pane.getChildren().add(waterside2);
        pane.getChildren().add(car);
        pane.getChildren().add(roadCenter);
        pane.getChildren().add(roadCenterTwo);
        pane.getChildren().add(roadCenterThree);
        pane.getChildren().add(tree1);
        pane.getChildren().add(tree2);
        pane.getChildren().add(tree3);
        pane.getChildren().add(tree4);
        //pane.getChildren().add(tree5);

        pane.getChildren().add(tree21);
        pane.getChildren().add(tree22);
        pane.getChildren().add(tree23);
        pane.getChildren().add(tree24);
        //pane.getChildren().add(tree25);
        //pane.getChildren().add(camera);
        stage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            switch(event.getCode()) {
                case UP:
                    tree1.translateZProperty().set(tree1.getTranslateZ() + 10);
                    tree1.setLayoutX(tree1.getLayoutX() - 3);
                    tree1.setLayoutY(tree1.getLayoutY() + 100);
                    tree1.setFitHeight(tree1.getFitHeight() + 2);
                    tree1.setFitWidth(tree1.getFitWidth() + 2);

                    tree2.translateZProperty().set(tree2.getTranslateZ() + 10);
                    tree2.setLayoutX(tree2.getLayoutX() - 3);
                    tree2.setLayoutY(tree2.getLayoutY() + 100);
                    tree2.setFitHeight(tree2.getFitHeight() + 2);
                    tree2.setFitWidth(tree2.getFitWidth() + 2);


                    tree3.translateZProperty().set(tree3.getTranslateZ() + 10);
                    tree3.setLayoutX(tree3.getLayoutX() - 3);
                    tree3.setLayoutY(tree3.getLayoutY() + 100);
                    tree3.setFitHeight(tree3.getFitHeight() + 2);
                    tree3.setFitWidth(tree3.getFitWidth() + 2);

                    tree4.translateZProperty().set(tree4.getTranslateZ() + 10);
                    tree4.setLayoutX(tree4.getLayoutX() - 3);
                    tree4.setLayoutY(tree4.getLayoutY() + 100);
                    tree4.setFitHeight(tree4.getFitHeight() + 2);
                    tree4.setFitWidth(tree4.getFitWidth() + 2);

                    tree5.translateZProperty().set(tree5.getTranslateZ() + 10);
                    tree5.setLayoutX(tree5.getLayoutX() - 3);
                    tree5.setLayoutY(tree5.getLayoutY() + 100);
                    tree5.setFitHeight(tree5.getFitHeight() + 2);
                    tree5.setFitWidth(tree5.getFitWidth() + 2);

                    tree21.translateZProperty().set(tree21.getTranslateZ() + 10);
                    tree21.setLayoutX(tree21.getLayoutX() + 3);
                    tree21.setLayoutY(tree21.getLayoutY() + 100);
                    tree21.setFitHeight(tree21.getFitHeight() + 2);
                    tree21.setFitWidth(tree21.getFitWidth() + 2);

                    tree22.translateZProperty().set(tree22.getTranslateZ() + 10);
                    tree22.setLayoutX(tree22.getLayoutX() + 3);
                    tree22.setLayoutY(tree22.getLayoutY() + 100);
                    tree22.setFitHeight(tree22.getFitHeight() + 2);
                    tree22.setFitWidth(tree22.getFitWidth() + 2);

                    tree23.translateZProperty().set(tree23.getTranslateZ() + 10);
                    tree23.setLayoutX(tree23.getLayoutX() + 3);
                    tree23.setLayoutY(tree23.getLayoutY() + 100);
                    tree23.setFitHeight(tree23.getFitHeight() + 2);
                    tree23.setFitWidth(tree23.getFitWidth() + 2);

                    tree24.translateZProperty().set(tree24.getTranslateZ() + 10);
                    tree24.setLayoutX(tree24.getLayoutX() + 3);
                    tree24.setLayoutY(tree24.getLayoutY() + 100);
                    tree24.setFitHeight(tree24.getFitHeight() + 2);
                    tree24.setFitWidth(tree24.getFitWidth() + 2);

                    tree25.translateZProperty().set(tree25.getTranslateZ() + 10);
                    tree25.setLayoutX(tree25.getLayoutX() + 3);
                    tree25.setLayoutY(tree25.getLayoutY() + 100);
                    tree25.setFitHeight(tree25.getFitHeight() + 2);
                    tree25.setFitWidth(tree25.getFitWidth() + 2);

                    roadCenter.translateZProperty().set(roadCenter.getTranslateZ() + 10);
                    roadCenter.setLayoutY(roadCenter.getLayoutY() + 100);
                    roadCenter.setScaleY(roadCenter.getScaleY() + 0.1);
                    roadCenter.setScaleX(roadCenter.getScaleX() + 0.1);

                    roadCenterTwo.translateZProperty().set(roadCenterTwo.getTranslateZ() + 10);
                    roadCenterTwo.setLayoutY(roadCenterTwo.getLayoutY() + 100);
                    roadCenterTwo.setScaleY(roadCenterTwo.getScaleY() + 0.1);
                    roadCenterTwo.setScaleX(roadCenterTwo.getScaleX() + 0.1);

                    roadCenterThree.translateZProperty().set(roadCenterThree.getTranslateZ() + 10);
                    roadCenterThree.setLayoutY(roadCenterThree.getLayoutY() + 100);
                    roadCenterThree.setScaleY(roadCenterThree.getScaleY() + 0.1);
                    roadCenterThree.setScaleX(roadCenterThree.getScaleX() + 0.1);


                    if(tree1.getLayoutY() > 700){
                        tree1.setLayoutX(130);
                        tree1.setLayoutY(150);
                        tree1.setFitHeight(90);
                        tree1.setFitWidth(125);}
                    if(tree2.getLayoutY() > 700){
                        tree2.setLayoutX(130);
                        tree2.setLayoutY(150);
                        tree2.setFitHeight(90);
                        tree2.setFitWidth(125);}

                    if(tree3.getLayoutY() > 700){
                        tree3.setLayoutX(130);
                        tree3.setLayoutY(150);
                        tree3.setFitHeight(90);
                        tree3.setFitWidth(125);}

                    if(tree4.getLayoutY() > 700){
                        tree4.setLayoutX(130);
                        tree4.setLayoutY(150);
                        tree4.setFitHeight(90);
                        tree4.setFitWidth(125);}

                    if(tree5.getLayoutY() > 700){
                        tree5.setLayoutX(130);
                        tree5.setLayoutY(150);
                        tree5.setFitHeight(90);
                        tree5.setFitWidth(125);}

                    if(tree21.getLayoutY() > 700) {
                        tree21.setLayoutX(440);
                        tree21.setLayoutY(220);
                        tree21.setFitHeight(50);
                        tree21.setFitWidth(125);

                    }
                    if(tree22.getLayoutY() > 700) {
                        tree22.setLayoutX(440);
                        tree22.setLayoutY(220);
                        tree22.setFitHeight(50);
                        tree22.setFitWidth(125);

                    }

                    if(tree23.getLayoutY() > 700) {
                        tree23.setLayoutX(440);
                        tree23.setLayoutY(220);
                        tree23.setFitHeight(50);
                        tree23.setFitWidth(125);

                    }

                    if(tree24.getLayoutY() > 700) {
                        tree24.setLayoutX(440);
                        tree24.setLayoutY(220);
                        tree24.setFitHeight(50);
                        tree24.setFitWidth(125);

                    }

                    if(tree25.getLayoutY() > 700) {
                        tree25.setLayoutX(440);
                        tree25.setLayoutY(220);
                        tree25.setFitHeight(50);
                        tree25.setFitWidth(125);

                    }

                    if(roadCenterThree.getLayoutY() > 700) {
                        roadCenterThree.setLayoutY(233);

                    }

                    if(roadCenterTwo.getLayoutY() > 700) {
                        roadCenterTwo.setLayoutY(233);

                    }

                    if(roadCenter.getLayoutY() > 700) {
                        roadCenter.setLayoutY(233);

                    }
                    //car.translateXProperty().set(car.getTranslateX() - 5);
                    //car.translateYProperty().set(car.getTranslateY() - 5);
                    //car.translateZProperty().set(car.getTranslateY() - 1);
                    break;
                case DOWN:
                    tree1.translateZProperty().set(tree1.getTranslateZ() -10);
                    tree1.translateYProperty().set(tree1.getTranslateY() - 10);
                    tree1.translateXProperty().set(tree1.getTranslateX() + 3);
                    tree1.setFitHeight(tree1.getFitHeight() - 2);
                    tree1.setFitWidth(tree1.getFitWidth() - 2);

                    tree2.translateZProperty().set(tree2.getTranslateZ() - 10);
                    tree2.translateYProperty().set(tree2.getTranslateY() - 10);
                    tree2.translateXProperty().set(tree2.getTranslateX() + 3);
                    tree2.setFitHeight(tree2.getFitHeight() - 2);
                    tree2.setFitWidth(tree2.getFitWidth() - 2);

                    tree3.translateZProperty().set(tree3.getTranslateZ() - 10);
                    tree3.translateYProperty().set(tree3.getTranslateY() - 10);
                    tree3.translateXProperty().set(tree3.getTranslateX() + 3);
                    tree3.setFitHeight(tree3.getFitHeight() - 2);
                    tree3.setFitWidth(tree3.getFitWidth() - 2);

                    tree4.translateZProperty().set(tree4.getTranslateZ() - 10);
                    tree4.translateYProperty().set(tree4.getTranslateY() - 10);
                    tree4.translateXProperty().set(tree4.getTranslateX() + 3);
                    tree4.setFitHeight(tree4.getFitHeight() - 2);
                    tree4.setFitWidth(tree4.getFitWidth() - 2);


                    tree5.translateZProperty().set(tree5.getTranslateZ() - 10);
                    tree5.translateYProperty().set(tree5.getTranslateY() - 10);
                    tree5.translateXProperty().set(tree5.getTranslateX() + 3);
                    tree5.setFitHeight(tree5.getFitHeight() - 2);
                    tree5.setFitWidth(tree5.getFitWidth() - 2);

                    tree21.translateZProperty().set(tree21.getTranslateZ() -10);
                    tree21.translateYProperty().set(tree21.getTranslateY() - 10);
                    tree21.translateXProperty().set(tree21.getTranslateX() - 3);
                    tree21.setFitHeight(tree21.getFitHeight() - 2);
                    tree21.setFitWidth(tree21.getFitWidth() - 2);


                    tree22.translateZProperty().set(tree22.getTranslateZ() - 10);
                    tree22.translateYProperty().set(tree22.getTranslateY() - 10);
                    tree22.translateXProperty().set(tree22.getTranslateX() - 3);
                    tree22.setFitHeight(tree22.getFitHeight() - 2);
                    tree22.setFitWidth(tree22.getFitWidth() - 2);

                    tree23.translateZProperty().set(tree23.getTranslateZ() - 10);
                    tree23.translateYProperty().set(tree23.getTranslateY() - 10);
                    tree23.translateXProperty().set(tree23.getTranslateX() - 3);
                    tree23.setFitHeight(tree23.getFitHeight() - 2);
                    tree23.setFitWidth(tree23.getFitWidth() - 2);

                    tree24.translateZProperty().set(tree24.getTranslateZ() - 10);
                    tree24.translateYProperty().set(tree24.getTranslateY() - 10);
                    tree24.translateXProperty().set(tree24.getTranslateX() - 3);
                    tree24.setFitHeight(tree24.getFitHeight() - 2);
                    tree24.setFitWidth(tree24.getFitWidth() - 2);

                    tree25.translateZProperty().set(tree25.getTranslateZ() - 10);
                    tree25.translateYProperty().set(tree25.getTranslateY() - 10);
                    tree25.translateXProperty().set(tree25.getTranslateX() - 3);
                    tree25.setFitHeight(tree25.getFitHeight() - 2);
                    tree25.setFitWidth(tree25.getFitWidth() - 2);


                    roadCenter.translateZProperty().set(roadCenter.getTranslateZ() - 10);
                    roadCenter.translateYProperty().set(roadCenter.getTranslateY() - 10);
                    roadCenter.setScaleY(roadCenter.getScaleY() - 0.1);
                    roadCenter.setScaleX(roadCenter.getScaleX() - 0.1);

                    roadCenterTwo.translateZProperty().set(roadCenterTwo.getTranslateZ() - 10);
                    roadCenterTwo.translateYProperty().set(roadCenterTwo.getTranslateY() - 10);
                    roadCenterTwo.setScaleY(roadCenterTwo.getScaleY() - 0.1);
                    roadCenterTwo.setScaleX(roadCenterTwo.getScaleX() - 0.1);

                    roadCenterThree.translateZProperty().set(roadCenterThree.getTranslateZ() - 10);
                    roadCenterThree.translateYProperty().set(roadCenterThree.getTranslateY() - 10);
                    roadCenterThree.setScaleY(roadCenterThree.getScaleY() - 0.1);
                    roadCenterThree.setScaleX(roadCenterThree.getScaleX() - 0.1);

                    break;

            }
        });
        Scene scene = new Scene(pane,700,700);
        stage.setScene(scene);
        stage.show();

    }


}

