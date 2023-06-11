import javafx.scene.transform.Translate;

public class HandleMovement {
   static double accelration = 0.1;
    public static void move(){
   // environment.rightSideTrees[0].translateXProperty().set(environment.rightSideTrees[0].getTranslateX() + accelration * 0.8);

  // environment.rightSideTrees[0].translateYProperty().set(environment.rightSideTrees[0].getTranslateY() + accelration * 6.6);
  // environment.rightSideTrees[0].fitHeightProperty().set(environment.rightSideTrees[0].getFitHeight() + accelration * 10);
  // environment.rightSideTrees[0].fitWidthProperty().set(environment.rightSideTrees[0].getFitWidth() + accelration * 10);
    //GameEnviroment.camera.setTranslateZ(GameEnviroment.camera.getTranslateZ() + 3);
    //GameEnviroment.camera.setTranslateY(GameEnviroment.camera.getTranslateY() - 3);



/*      GameEnviroment.cameraTranslateY -=3;
      GameEnviroment.cameraTranslateZ -=3;

        if(GameEnviroment.cameraTranslateY <= 100){
           GameEnviroment.cameraTranslateY = 280;
           GameEnviroment.cameraTranslateZ = -1300;
        }
        Translate translate = new Translate();
        translate.setY(GameEnviroment.cameraTranslateY);
        translate.setZ(GameEnviroment.cameraTranslateZ);
        GameEnviroment.camera.getTransforms().clear();
        GameEnviroment.camera.getTransforms().add(translate);


 */
     //   environment.car.getTransforms().clear();
     //   environment.car.getTransforms().add(new Translate(environment.car.getLayoutX(),environment.car.getTranslateY()))
  //  GameEnviroment.cameraPane.setLayoutY(GameEnviroment.cameraPane.getLayoutY() - 30);
       // GameEnviroment.grassOnePointsY[0] = GameEnviroment+.grassOnePointsY[0] -30;
      //  GameEnviroment.grassOnePointsY[2] = GameEnviroment.grassOnePointsY[2] -30;
       /* for (int i = 1; i < GameEnviroment.roadPointsY.length; i ++) {
            double initialY = GameEnviroment.roadPointsY[i];
            GameEnviroment.roadPointsY[i] = GameEnviroment.camera.getTranslateY() + initialY;
        }*/

      //  GameEnviroment.grassTwoPointsY[0] = GameEnviroment.grassTwoPointsY[0]  - 30;
       // GameEnviroment.grassTwoPointsY[1] = GameEnviroment.grassTwoPointsY[1]   -30;
      //  GameEnviroment.subSceneTwo.setLayoutY(GameEnviroment.subSceneTwo.getLayoutY() - 30);
     //   GameEnviroment.cameraPane.setLayoutY(GameEnviroment.cameraPane.getLayoutY() - 30);
      //  GameEnviroment.cameraPane.setPrefWidth(GameEnviroment.cameraPane.getPrefWidth() + 20);
       // GameEnviroment.gc.moveTo(GameEnviroment.subSceneTwo.getLayoutX(), GameEnviroment.subSceneTwo.getLayoutY());

       // GameEnviroment.subSceneTwo.setHeight(GameEnviroment.subSceneTwo.getHeight() + 100);
       // GameEnviroment.cameraPane.setLayoutY()(GameEnviroment.cameraPane.getTranslateY() + 10);

    //    GameEnviroment.roadPointsY[0] =GameEnviroment.roadPointsY[0] - 30;
     //   GameEnviroment.roadPointsY[3] =GameEnviroment.roadPointsY[3] -30;
      //  GameEnviroment.gc.clearRect(0,0,GameEnviroment.canvas.getWidth(),GameEnviroment.canvas.getHeight());
     //  GameEnviroment.draw(GameEnviroment.gc,GameEnviroment.grassOnePointsX,GameEnviroment.grassOnePointsY,GameEnviroment.grassTwoPointsX,GameEnviroment.grassTwoPointsY,GameEnviroment.roadPointsX,GameEnviroment.roadPointsY);
      // GameEnviroment.gc.drawImage(GameEnviroment.carimage,200,carLayoutY,150,150);
       // GameLoop.gameLoop(GameEnviroment.gc);
   // GameEnviroment.canvas.setHeight(GameEnviroment.canvas.getHeight() + 30);
   // GameEnviroment.grassOnePointsY[0]= GameEnviroment.grassOnePointsY[0] + 70;
  //  GameEnviroment.grassOnePointsY[2]= GameEnviroment.grassOnePointsY[2] + 70;
    //GameEnviroment.draw(GameEnviroment.gc,,200,200,200,200,200);
    // GameEnviroment.gc.clearRect(0,0,GameEnviroment.canvas.getWidth(),GameEnviroment.canvas.getHeight());
    // GameEnviroment.draw(GameEnviroment.gc,GameEnviroment.grassOnePointsX,GameEnviroment.grassOnePointsY,GameEnviroment.grassTwoPointsX,GameEnviroment.grassTwoPointsY,GameEnviroment.roadPointsX,GameEnviroment.roadPointsY);
   // GameEnviroment.subSceneTwo.setHeight(GameEnviroment.subSceneTwo.getHeight() + 30);
   // GameEnviroment.canvas.setHeight(GameEnviroment.canvas.getWidth() + 30);
        //the loop for environment

         environment.camera.setTranslateY(environment.camera.getTranslateY() - 3);
       environment.camera.setTranslateZ(environment.camera.getTranslateZ() + 3);
        environment.car.setLayoutY(environment.car.getLayoutY() - 3);
       if(environment.car.getLayoutY() == 70){
            environment.car.setLayoutY(400);
            environment.camera.setTranslateY(340);
            environment.camera.setTranslateZ(-1300);
        }
       environment.camera.getTransforms().clear();
       environment.camera.getTransforms().add(new Translate(environment.camera.getLayoutX(),environment.camera.getTranslateY(),environment.camera.getTranslateZ()));
       environment.car.getTransforms().clear();
       environment.car.getTransforms().add(new Translate(environment.car.getLayoutX(),environment.car.getTranslateY()));

        //double cameraY = environment.camera.getTranslateY();
       // double cameraZ = environment.camera.getTranslateZ();
      /*  environment.cameraTranslateY -=3;
        environment.cameraTranslateZ -=3;

        if(environment.cameraTranslateY <= 200){
      environment.cameraTranslateY =340;
      environment.cameraTranslateZ =-1300;
        }
        Translate translate = new Translate();
        translate.setY(environment.cameraTranslateY);
        translate.setZ(environment.cameraTranslateZ);
        environment.camera.getTransforms().clear();
        environment.camera.getTransforms().add(new Translate(0,environment.camera.getTranslateY() - 3,environment.camera.getTranslateZ() + 3));
*/
       // double carX = environment.car.getLayoutX();
      //  double carY = environment.car.getLayoutY();
      //  double carWidth = environment.car.getFitWidth();
      //  double carHeight = environment.car.getFitHeight();
       // carY -= 5; // Example movement, adjust as needed


        // Check if the car reaches the loop point



        /*double cameraTranslateZ = environment.camera.getTranslateZ();
        double cameraTranslateY = environment.camera.getTranslateY();

        cameraTranslateZ += 3;
        cameraTranslateY -= 3;// Example movement, adjust as needed

        // Check if the camera reaches the loop point
        if (environment.cameraTranslateY <= 300) {
            // Reset the car position

            cameraTranslateZ = -1300;
            cameraTranslateY = 340; // Set it back to the beginning
        }
        environment.car.getTransforms().clear();
        environment.car.getTransforms().add(new Translate(carX, carY));
        environment.camera.getTransforms().clear();
        environment.camera.getTransforms().add(new Translate(350, cameraTranslateY, cameraTranslateZ));

        */
       // environment.road.setTranslateY(environment.road.getTranslateY() - 30);
       // environment.pane.setTranslateY(environment.pane.getTranslateY() - 20);
       /* for (Double pointY : environment.road.getPoints()) {
            environment.road.translateYProperty().bind(environment.camera.translateYProperty().multiply(-1));
        }*/
       // GameEnviroment.gc.clearRect(0,0,700,700);


 //  GameEnviroment.draw(GameEnviroment.gc,GameEnviroment.grassOnePointsX,GameEnviroment.grassOnePointsY,GameEnviroment.grassTwoPointsX,GameEnviroment.grassTwoPointsY,GameEnviroment.roadPointsX,GameEnviroment.roadPointsY);
  //  System.out.println("key is entered");

   // environment.sky.setTranslateY(-(environment.camera.getTranslateY()));
   // environment.sky.setTranslateZ(-(environment.camera.getTranslateZ()));





    }
}