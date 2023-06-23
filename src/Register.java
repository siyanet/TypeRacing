import java.security.NoSuchAlgorithmException;
import java.sql.*;

public class Register {
    public void register(){
        AlertMessage alert = new AlertMessage();
if(SignUp.textFieldName.getText().isEmpty() || SignUp.textFieldPassword.getText().isEmpty()){
    alert.errorMessage("All fields are required");
} else if (SignUp.textFieldPassword.getText().length() < 8) {
    alert.errorMessage("Invalid Password at least 8 characters are required");
}
else{
    String checkUserName = "select Name from User_Account where Name ='" +  SignUp.textFieldName.getText() +"'";
    try{
        Connection connection = ConnectDatabase.getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(checkUserName);
      //  System.out.println("ok");
       if(result.next()){
            alert.errorMessage("The user name is taken");
      }
        else{
            Encryptor encryptor = new Encryptor();
           String hashed = encryptor.encryptPassword(SignUp.textFieldPassword.getText());
           String insertData = "INSERT INTO User_Account (Name, Password) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertData);
            preparedStatement.setString(1,SignUp.textFieldName.getText());
            preparedStatement.setString(2, hashed);
            preparedStatement.executeUpdate();
            alert.sucessMessage("you are registered successfully");

       }

    }
    catch (Exception e){
        e.printStackTrace();
    }

}
}
}
