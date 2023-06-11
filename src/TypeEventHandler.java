
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.util.Duration;


public class TypeEventHandler implements EventHandler<KeyEvent>{
    int i = 0;
    int j = 0;
    int k;
   static int correctWord = 0;
   static int wrongWord = 0;

    @Override
    public void handle(KeyEvent keyEvent) {
        if("\b".equals(keyEvent.getCharacter())){
            //textField.setText(textField.getText().substring(0, textField.getText().length() - 3));
            i--;
            if(k == 1){
                correctWord--;
            }
            else if(k == -1){
                wrongWord--;
            }
        }
       else{
            String[] word = display.word;
            TextField textField = display.textField;
            if (i < word[j].length()) {
                char a = word[j].charAt(i);
                String text = textField.getText();
                if(i < text.length()) {
                    char b = text.charAt(i);

                String bString = Character.toString(b);
                if (a == b) {
                    System.out.println("ok");
                    correctWord++;
                    k = 1;
                    HandleMovementTwo.moveTwo();
                    i++;
                } else {
                    System.out.println("no");
                    wrongWord++;
                    k = -1;
                    i++;
                }}
            } else {
                display.textField.setOnAction(e -> {
                    j++;
                    display.text.setText(word[j]);
                    display.textField.setText("");
                    i = 0;
                });
            }}}
    }



