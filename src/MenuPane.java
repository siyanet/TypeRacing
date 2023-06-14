
    import javafx.application.Application;
import javafx.scene.Scene;
    import javafx.scene.SubScene;
    import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


//public class MenuPane extends Application{


     //  @Override
     //   public void start(Stage primaryStage) {
    public class MenuPane {

    public  static BorderPane getMenuPane(){
            // Create a BorderPane to hold the menus and content

            BorderPane root = new BorderPane();

            // Create the menus
            Menu homeMenu = new Menu("Home");
            MenuItem Level = new MenuItem("Level");

            MenuItem performanceMenu = new MenuItem("Performance");


            // Create the menu bar and add the menus to it
            MenuBar menuBar = new MenuBar();
            homeMenu.getItems().add(Level);
            homeMenu.getItems().add(performanceMenu);
            menuBar.getMenus().add(homeMenu);
           // menuBar.setStyle("-fx-padding: 20");

            // Set the menu bar at the top of the BorderPane

            Level.setOnAction(e->{
                ConnectToChooser.choose();
            });
            performanceMenu.setOnAction(e->{
                Stage stage = SignUp.getStage();
                stage.setScene(null);
                Scene scene = PerformanceScene.getPerformanceScene();
                stage.setScene(scene);

            });
        root.setTop(menuBar);

            // Set the content of the BorderPane
            // You can change the content dynamically as needed
            // For demonstration purposes, a simple label is used here
           

            // Create the scene
          //  Scene scene = new Scene(root, 400, 300);

           // primaryStage.setTitle("Persistent Menus Example");
           // primaryStage.setScene(scene);
           // primaryStage.show();

        return root;
        }

    /*    public static void main(String[] args) {
            launch(args);
        }*/
    }


