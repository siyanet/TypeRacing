import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class PerformanceScene  {
    static TableView<String[]> tableView;
    public static Scene getPerformanceScene(){


      //  public class PerformanceScene extends Application {


                tableView = new TableView<>();
                VBox root = new VBox(tableView);
                Pane pane = MenuPane.getMenuPane();
                Pane mainPane = new Pane();
                mainPane.getChildren().add(pane);
                mainPane.getChildren().add(root);




                retrieveData();
        Scene scene = new Scene(mainPane, 700, 700);
        return scene;
            }

            public static void retrieveData() {
                try {
                    // Establish database connection
                    Connection connection = ConnectDatabase.getConnection();

                    // Create a statement object
                    Statement statement = connection.createStatement();

                    // Execute SQL query to retrieve data
                    String query = "SELECT * FROM " + environment.userName;
                    ResultSet resultSet = statement.executeQuery(query);

                    // Get result set metadata to retrieve column names
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();

                    // Create table columns dynamically
                    for (int i = 2; i <= columnCount; i++) {
                        final int columnIndex = i;
                        TableColumn<String[], String> column = new TableColumn<>(metaData.getColumnName(i));
                        column.setCellValueFactory(cellData -> {
                            String[] row = cellData.getValue();
                            if (row != null && row.length >= columnIndex) {
                                return new SimpleStringProperty(row[columnIndex - 1]);
                            }
                            return new SimpleStringProperty("");
                        });
                        tableView.getColumns().add(column);
                    }

                    // Populate table data
                    while (resultSet.next()) {
                        String[] row = new String[columnCount];
                        for (int i = 2; i <= columnCount; i++) {
                            row[i - 1] = resultSet.getString(i);
                        }
                        tableView.getItems().add(row);
                    }

                    // Close the resources
                    resultSet.close();
                    statement.close();
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
