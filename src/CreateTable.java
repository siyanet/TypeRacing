import java.sql.*;

public class CreateTable {
    public static void main(String args[]){
       // createTableWord();
       //insertWords();
       /* ResultSet resultSet = resultset.getResultSet();
        try{
        while(resultSet.next()) {
            System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2));
        }}
        catch(Exception e){
            e.printStackTrace();
            }*/
        createTableUserAccount();

        }


        public static void createTableWord(){
        try {

            Connection conne = ConnectDatabase.getConnection();
            Statement statment = conne.createStatement();
            statment.executeUpdate("CREATE TABLE words (word_id int PRIMARY KEY AUTO_INCREMENT, word LONGTEXT)");
            System.out.println("table is created");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        }
        public static void createTableUserAccount(){
        try{
            Connection conne = ConnectDatabase.getConnection();
            Statement statment = conne.createStatement();
            statment.executeUpdate("CREATE TABLE User_Account (id INT AUTO_INCREMENT PRIMARY KEY, Name VARCHAR(50) NOT NULL, Password VARCHAR(255) NOT NULL)");
            System.out.println("user account table is created");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        }
    public static void insertWords(){
        try{
        Connection conne = ConnectDatabase.getConnection();
            String query = "insert into words (word) values(?)";
            String[] wordone = Fileread.getWords();

            for (int i = 0; i < 50; i++) {


                PreparedStatement insertstatement = conne.prepareStatement(query);

                insertstatement.setString(1, wordone[i]);
                insertstatement.executeUpdate();
            }}
        catch (Exception e){
            e.printStackTrace();
        }

            System.out.println("words are stored at the database");
        }
        public static void createPerformanceTable(){
        try{
            Connection conne = ConnectDatabase.getConnection();
            DatabaseMetaData dbMetaData = conne.getMetaData();
            ResultSet tables = dbMetaData.getTables(null, null, environment.userName, null);
            if(tables.next()){
                System.out.println("it has been created");

            }
            else{
                String tableName = environment.userName;
                String query = "CREATE TABLE " + tableName + " (id INT AUTO_INCREMENT PRIMARY KEY, Date VARCHAR(20) NOT NULL, Speed INT NOT NULL, Accuracy INT NOT NULL)";
                PreparedStatement pStatement = conne.prepareStatement(query);
                pStatement.execute();
                System.out.println("created");

            }


        }
        catch (Exception e){
            e.printStackTrace();
        }

       }


}
