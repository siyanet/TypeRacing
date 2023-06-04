import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;



public class GameLoop {



public static void gameLoop(GraphicsContext gc){
    new AnimationTimer(){

        @Override
        public void handle(long l) {
            update();
            render(gc);
        }
    }.start();
}
    public static void  update(){
        GameEnviroment.grassOnePointsY[0] = GameEnviroment.grassOnePointsY[0] +30;
        GameEnviroment.grassOnePointsY[1] = GameEnviroment.grassOnePointsY[2] +30;

        GameEnviroment.grassTwoPointsY[0] = GameEnviroment.grassTwoPointsY[0]  + 30;
        GameEnviroment.grassTwoPointsY[2] = GameEnviroment.grassTwoPointsY[2]  + 30;

        GameEnviroment.roadPointsY[0] =GameEnviroment.roadPointsY[0] + 30;
        GameEnviroment.roadPointsY[3] =GameEnviroment.roadPointsY[3] +30;

    }
    public static void render(GraphicsContext gc){
    gc.clearRect(0.0,0.0,700.0,467.0);
   GameEnviroment.draw(GameEnviroment.gc,GameEnviroment.grassOnePointsX,GameEnviroment.grassOnePointsY,GameEnviroment.grassTwoPointsX,GameEnviroment.grassTwoPointsY,GameEnviroment.roadPointsX,GameEnviroment.roadPointsY);

    }}


