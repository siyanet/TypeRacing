import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class SignInHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        LogIn login = new LogIn();
        login.logIn();
    }
}
