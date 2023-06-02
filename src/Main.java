public class Main {
    // pane.getChildren().add(tree21);
    // pane.getChildren().add(tree22);
    // pane.getChildren().add(tree23);
    // pane.getChildren().add(tree24);
    //pane.getChildren().add(tree25);
    //pane.getChildren().add(camera);
       /* stage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
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
        });*/



    //pane.getChildren().add(tree1);
    // pane.getChildren().add(tree2);
    // pane.getChildren().add(tree3);
    // pane.getChildren().add(tree4);
    //pane.getChildren().add(tree5);



    /* ImageView tree1 = new ImageView(treeimage);
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
        //firstTreeRight = tree21;*/
}