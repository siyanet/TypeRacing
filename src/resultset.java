import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class resultset {
   private static ResultSet selectResultSet = null;
    public static ResultSet getResultSet(){

        try{
            Connection conne = ConnectDatabase.getConnection();
            Statement selectStatement = conne.createStatement();
            selectResultSet = selectStatement.executeQuery("select * from words");
       /* while(selectResultSet.next()){
            System.out.println(selectResultSet.getString(1) + "\t" + selectResultSet.getString(2));
        }*/}

        catch (Exception e){
            e.printStackTrace();
        }
        return selectResultSet;
    }
}
