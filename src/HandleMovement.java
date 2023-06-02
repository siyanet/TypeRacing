public class HandleMovement {
   static double accelration = 0.1;
    public static void move(){
    environment.rightSideTrees[0].translateXProperty().set(environment.rightSideTrees[0].getTranslateX() + accelration * 0.8);

    environment.rightSideTrees[0].translateYProperty().set(environment.rightSideTrees[0].getTranslateY() + accelration * 4.6);
    environment.rightSideTrees[0].fitHeightProperty().set(environment.rightSideTrees[0].getFitHeight() + accelration * 10);
    environment.rightSideTrees[0].fitWidthProperty().set(environment.rightSideTrees[0].getFitWidth() + accelration * 10);
    environment.camera.setTranslateZ(environment.camera.getTranslateZ() + 50);
    environment.camera.setTranslateY(environment.camera.getTranslateY() - 30);
    System.out.println("key is entered");

   // environment.sky.setTranslateY(-(environment.camera.getTranslateY()));
   // environment.sky.setTranslateZ(-(environment.camera.getTranslateZ()));
}
}
