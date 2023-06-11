public class Intermediate extends Level {
    @Override
    public void start() {
        environment.timeline.setCycleCount(180);
        environment.remainingSeconds = 180;
    }
}
