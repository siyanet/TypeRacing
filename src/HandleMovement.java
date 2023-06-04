public class HandleMovement {
   static double accelration = 0.1;
    public static void move(){
   // environment.rightSideTrees[0].translateXProperty().set(environment.rightSideTrees[0].getTranslateX() + accelration * 0.8);

  //  environment.rightSideTrees[0].translateYProperty().set(environment.rightSideTrees[0].getTranslateY() + accelration * 4.6);
  //  environment.rightSideTrees[0].fitHeightProperty().set(environment.rightSideTrees[0].getFitHeight() + accelration * 10);
  //  environment.rightSideTrees[0].fitWidthProperty().set(environment.rightSideTrees[0].getFitWidth() + accelration * 10);
    GameEnviroment.camera.setTranslateZ(GameEnviroment.camera.getTranslateZ() + 50);
    GameEnviroment.camera.setTranslateY(GameEnviroment.camera.getTranslateY() - 30);
        GameEnviroment.grassOnePointsY[0] = GameEnviroment.grassOnePointsY[0] -30;
        GameEnviroment.grassOnePointsY[2] = GameEnviroment.grassOnePointsY[2] -30;

        GameEnviroment.grassTwoPointsY[0] = GameEnviroment.grassTwoPointsY[0]  - 30;
        GameEnviroment.grassTwoPointsY[1] = GameEnviroment.grassTwoPointsY[1]   -30;
      //  GameEnviroment.subSceneTwo.setLayoutY(GameEnviroment.subSceneTwo.getLayoutY() - 30);
        GameEnviroment.cameraPane.setLayoutY(GameEnviroment.cameraPane.getLayoutY() - 30);
        GameEnviroment.cameraPane.setPrefWidth(GameEnviroment.cameraPane.getPrefWidth() + 20);
        GameEnviroment.gc.moveTo(GameEnviroment.subSceneTwo.getLayoutX(), GameEnviroment.subSceneTwo.getLayoutY());

        GameEnviroment.subSceneTwo.setHeight(GameEnviroment.subSceneTwo.getHeight() + 100);
       // GameEnviroment.cameraPane.setLayoutY()(GameEnviroment.cameraPane.getTranslateY() + 10);

        GameEnviroment.roadPointsY[0] =GameEnviroment.roadPointsY[0] - 30;
        GameEnviroment.roadPointsY[3] =GameEnviroment.roadPointsY[3] -30;
        GameEnviroment.gc.clearRect(0,0,700,700);
       GameEnviroment.draw(GameEnviroment.gc,GameEnviroment.grassOnePointsX,GameEnviroment.grassOnePointsY,GameEnviroment.grassTwoPointsX,GameEnviroment.grassTwoPointsY,GameEnviroment.roadPointsX,GameEnviroment.roadPointsY);
   // GameLoop.gameLoop(GameEnviroment.gc);
   // GameEnviroment.canvas.setHeight(GameEnviroment.canvas.getHeight() + 30);
   // GameEnviroment.grassOnePointsY[0]= GameEnviroment.grassOnePointsY[0] + 70;
  //  GameEnviroment.grassOnePointsY[2]= GameEnviroment.grassOnePointsY[2] + 70;
    //GameEnviroment.draw(GameEnviroment.gc,,200,200,200,200,200);
    // GameEnviroment.gc.clearRect(0,0,GameEnviroment.canvas.getWidth(),GameEnviroment.canvas.getHeight());
   // GameEnviroment.draw(GameEnviroment.gc,GameEnviroment.grassOnePointsX,GameEnviroment.grassOnePointsY,GameEnviroment.grassTwoPointsX,GameEnviroment.grassTwoPointsY,GameEnviroment.roadPointsX,GameEnviroment.roadPointsY);
   // GameEnviroment.subSceneTwo.setHeight(GameEnviroment.subSceneTwo.getHeight() + 30);
   // GameEnviroment.canvas.setHeight(GameEnviroment.canvas.getWidth() + 30);



   // GameEnviroment.draw(GameEnviroment.gc,GameEnviroment.grassOnePointsX,GameEnviroment.grassOnePointsY,GameEnviroment.grassTwoPointsX,GameEnviroment.grassTwoPointsY,GameEnviroment.roadPointsX,GameEnviroment.roadPointsY);
  //  System.out.println("key is entered");

   // environment.sky.setTranslateY(-(environment.camera.getTranslateY()));
   // environment.sky.setTranslateZ(-(environment.camera.getTranslateZ()));
}
}