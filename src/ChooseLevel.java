public class ChooseLevel {

    public static void chooseLevel(String levelType){
        Level level = LevelFactory.createLevel(levelType);
        level.start();
    }
}
