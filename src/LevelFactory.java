public class LevelFactory {
    public static Level createLevel(String type){
        if(type.equalsIgnoreCase("Beginner")){
            return new Beginner();
        }
        else if(type.equalsIgnoreCase("Intermediate")){
            return new Intermediate();
        }
        else if(type.equalsIgnoreCase("Advanced")){
            return new Advanced();
        }
        else{
            throw new IllegalArgumentException("invalid type" + type);
        }
    }
}
