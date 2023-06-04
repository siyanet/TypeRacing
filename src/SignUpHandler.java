import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class SignUpHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        Register register = new Register();
        register.register();
    }
}
