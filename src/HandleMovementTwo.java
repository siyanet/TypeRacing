import javafx.scene.transform.Translate;

public class HandleMovementTwo {
   static  double cameraY = 0;
   static double cameraZ = 0;
   static double carY = 0;
   static double carX = 0;
   static double accelartionX0 = -3;
   static double accelartionX1 = -3;
   static double accelartionX = -3;
   static double accelartionRX = 2;
   static double acclerationY = 3;
   static double accelerationLY = 3;
   static double[] accelerationX = {-3,-3,-3};
   static double[] accelerationY = {3,3,3};

   static double accelerationRoad = 5;
   static double accelerationRoad2= 0;
   static double heightTranslate = 4;
   static double widthTranslate = 2;

    public static void moveTwo(){


        cameraY-=3;
        cameraZ+=3;
        carY -=5;
        carX +=1;
       accelartionX-=3;
        accelartionRX+=2;
        accelerationRoad+=3;
        accelerationRoad2+=3;

        acclerationY+=3;
        accelerationLY +=3;
        /*for(int i = 0; i<3;i++){
            accelerationX[i]-=3;
            accelerationY[i]+=3;
        }*/

        Translate translate = new Translate();

        if(cameraZ >= 230){


            cameraY =0;
            cameraZ =0;
            carY = 0;
            carX = 0;
            translate.setY(0);
            translate.setZ(0);

        }
        else{
            translate.setY(cameraY);
            translate.setZ(cameraZ);

        }
        environment.camera.getTransforms().clear();
        environment.camera.getTransforms().add(translate);
        environment.car.getTransforms().clear();
       // environment.car.setFitHeight(environment.car.getFitHeight() - 0.5);
     //   environment.car.setFitWidth(environment.car.getFitWidth() - 0.5);
        environment.car.getTransforms().add(new Translate(carX,carY));

        environment.leftSideTrees[2].setScaleX(accelartionX);
        environment.leftSideTrees[2].setScaleY(acclerationY);
      /* for(int i = 0; i < 3;i++){

            if(environment.leftSideTrees[2].getFitWidth() >= 290  && i==2){
                environment.leftSideTrees[2].setFitWidth(70);
                environment.leftSideTrees[2].setFitHeight(50);

                environment.leftSideTrees[2].layoutXProperty().bind(environment.leftLine.endXProperty().subtract(environment.leftSideTrees[2].getFitWidth()*1.4));
                environment.leftSideTrees[2].layoutYProperty().bind(environment.leftLine.endYProperty().add(environment.leftSideTrees[2].getFitHeight()/1.7));
             accelerationX[2]=0;
             accelerationY[2]=0;
            }
            environment.leftSideTrees[i].getTransforms().clear();
            environment.leftSideTrees[i].setFitHeight(environment.leftSideTrees[i].getFitHeight()+heightTranslate);
           environment.leftSideTrees[i].setFitWidth(environment.leftSideTrees[i].getFitWidth()+ widthTranslate);
            environment.leftSideTrees[i].getTransforms().add(new Translate(accelerationX[i],accelerationY[i]));
        }*/

        if(environment.leftSideTrees[1].getFitWidth() >= 200){
            environment.leftSideTrees[1].setFitWidth(70);
            environment.leftSideTrees[1].setFitHeight(50);

            environment.leftSideTrees[1].layoutXProperty().bind(environment.leftLine.endXProperty().subtract(environment.leftSideTrees[1].getFitWidth()*1.4));
            environment.leftSideTrees[1].layoutYProperty().bind(environment.leftLine.endYProperty().add(environment.leftSideTrees[1].getFitHeight()/1.7));
            accelartionX= 0;
            accelerationLY=0;
        }
        environment.leftSideTrees[1].getTransforms().clear();
        environment.leftSideTrees[1].setFitHeight(environment.leftSideTrees[1].getFitHeight()+heightTranslate);
        environment.leftSideTrees[1].setFitWidth(environment.leftSideTrees[1].getFitWidth()+ widthTranslate);
        environment.leftSideTrees[1].getTransforms().add(new Translate(accelartionX,accelerationLY));


       /* for(int i = 0; i<3;i++){
            environment.leftSideTrees[i].setFitHeight(environment.leftSideTrees[i].getFitHeight()+heightTranslate);
            environment.leftSideTrees[i].setFitWidth(environment.leftSideTrees[i].getFitWidth()+ widthTranslate);
            environment.leftSideTrees[i].setTranslateX(environment.leftSideTrees[i].getTranslateX()-8);
            environment.leftSideTrees[i].setTranslateY(environment.leftSideTrees[i].getTranslateY()+10);

        }*/
        if(environment.rightSideTrees[1].getFitWidth() >= 250){
            environment.rightSideTrees[1].setFitHeight(70);
            environment.rightSideTrees[1].setFitWidth(50);
            environment.rightSideTrees[1].layoutXProperty().bind(environment.rightLine.endXProperty().add(environment.rightSideTrees[0].getFitWidth()/2));
            environment.rightSideTrees[1].layoutYProperty().bind(environment.rightLine.endYProperty().add(environment.rightSideTrees[0].getFitHeight()/1.7));
        accelartionRX=0;
        acclerationY=0;}

      /*  for(int i = 0; i < 3;i++){
            environment.rightSideTrees[i].getTransforms().clear();
           environment.rightSideTrees[i].setFitHeight(environment.rightSideTrees[i].getFitHeight()+heightTranslate);
           environment.rightSideTrees[i].setFitWidth(environment.rightSideTrees[i].getFitWidth()+ widthTranslate);
            environment.rightSideTrees[i].getTransforms().add(new Translate(accelartionRX,acclerationY));

        }*/
        environment.rightSideTrees[1].getTransforms().clear();
        environment.rightSideTrees[1].setFitHeight(environment.rightSideTrees[1].getFitHeight()+heightTranslate);
        environment.rightSideTrees[1].setFitWidth(environment.rightSideTrees[1].getFitWidth()+widthTranslate);
        environment.rightSideTrees[1].getTransforms().add(new Translate(accelartionRX,acclerationY));


        environment.rightSideTrees[1].getTransforms().clear();
        environment.rightSideTrees[1].setFitHeight(environment.rightSideTrees[1].getFitHeight()+heightTranslate);
        environment.rightSideTrees[1].setFitWidth(environment.rightSideTrees[1].getFitWidth()+widthTranslate);
        environment.rightSideTrees[1].getTransforms().add(new Translate(accelartionRX,acclerationY));

        if(accelerationRoad >= 350){
            accelerationRoad= -600;
        }
        if(accelerationRoad2>=450){
            accelerationRoad2=0;
        }

        environment.roadCenterTwo.getTransforms().clear();
        environment.roadCenterTwo.getTransforms().add(new Translate(0,accelerationRoad));
        environment.roadCenter.getTransforms().clear();
        environment.roadCenter.getTransforms().add(new Translate(0,accelerationRoad2));


    }
}
