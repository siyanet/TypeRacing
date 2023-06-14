public class CalculateReport {
   static int expectedAccuracy;
    static int expectedSpeed;
    static int speed;
    static int total;
    static int accuracy;
    public static void calculate(){
         speed = (int)TypeEventHandler.correctWord / environment.overAllMinute;
         total = (int)(TypeEventHandler.correctWord + TypeEventHandler.wrongWord);
         accuracy = (int)(((total - TypeEventHandler.wrongWord) / total) *100);
        if(environment.levelIndicator == 1){
            expectedAccuracy = 95;
            expectedSpeed = 120;
        }
        else if(environment.levelIndicator == 2){
            expectedAccuracy = 98;
            expectedSpeed = 300;

        }
        else if(environment.levelIndicator == 3){
            expectedAccuracy = 99;
            expectedSpeed = 600;
        }
    }
}
