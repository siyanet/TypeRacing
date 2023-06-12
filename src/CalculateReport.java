public class CalculateReport {
   static int expectedAccuracy;
    static int expectedSpeed;
    public static void calculate(){
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
