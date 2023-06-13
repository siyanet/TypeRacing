import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StorePerformance {
    public static void storePerformance(){
        try {
            LocalDateTime currentDateTime = LocalDateTime.now();

            // Define the desired date format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            // Format the current time and date using the formatter
            String formattedDateTime = currentDateTime.format(formatter);


            CreateTable.createPerformanceTable();
            Connection conne = ConnectDatabase.getConnection();

            String query = "INSERT INTO " + environment.userName + " (Date, Speed, Accuracy) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = conne.prepareStatement(query);

            preparedStatement.setString(1,formattedDateTime);
            preparedStatement.setInt(2,CalculateReport.speed);
            preparedStatement.setInt(3,CalculateReport.accuracy);
            preparedStatement.executeUpdate();
            System.out.println("stored");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
