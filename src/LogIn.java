import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LogIn {
    public void logIn(){

        AlertMessage alertLogIn = new AlertMessage();
        if(SIGNINTWO.textFieldName.getText().isEmpty()){
            alertLogIn.errorMessage("Please enter user Name");
        }
        else if(SIGNINTWO.textFieldPassword.getText().isEmpty()){
            alertLogIn.errorMessage("please enter Password");
        }
        else{
            try{
            String selectData ="Select Name, Password from User_Account where Name=? and Password=?";
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement preparedStatement= connection.prepareStatement(selectData);
            preparedStatement.setString(1,SIGNINTWO.textFieldName.getText());
            Encryptor encryptor = new Encryptor();
            String hashed = encryptor.encryptPassword(SIGNINTWO.textFieldPassword.getText());
            preparedStatement.setString(2,hashed);
                ResultSet resultSet = preparedStatement.executeQuery();
                if(resultSet.next()){
                    ConnectToChooser.choose();
                    environment.userName = resultSet.getString(1);




                }
                else{
                    alertLogIn.errorMessage("UserName and password do not match");
                }




            }
            catch (Exception e){
                e.printStackTrace();
            }


        }
    }
}
