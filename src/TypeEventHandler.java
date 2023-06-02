
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;



public class TypeEventHandler implements EventHandler<KeyEvent>{
    int i = 0;
    int j = 0;
    int k = 0;
    int correctWord = 0;
    int wrongWord = 0;
    @Override
    public void handle(KeyEvent keyEvent) {
        String[] word = display.word;
        TextField textField = display.textField;
        char a = word[j].charAt(i);


        if(i < word[j].length() - 1){

        String text = textField.getText();
        char b = text.charAt(i);
        if (1 == 1){
            System.out.println("ok");

            correctWord++;
            HandleMovement.move();

        }
        else{
            System.out.println("no");
            wrongWord++;        }


        i++;}
        else{
        display.textField.setOnAction(e-> {
            j++;
            display.text.setText(word[j]);
            display.textField.setText("");
            i = 0;
        } );}


    }}

