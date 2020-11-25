
package userinterface;
import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class UserInterface extends Application{
    
    public static int height = 1000;
    public static int width = 1000;
    
    @Override
    public void start(Stage window) {
        //log in scene: add options for add user
        
        Button logIn = new Button("Log in");
        Button addUser = new Button("Add new user");
        Button quit = new Button("Quit");
        TextField userName = new TextField("username");
        VBox boxLogIn = new VBox();
        boxLogIn.setSpacing(20);
        boxLogIn.setPrefSize(width/2, height/2);
        boxLogIn.getChildren().add(userName);
        boxLogIn.getChildren().add(logIn);
        boxLogIn.getChildren().add(addUser);
        boxLogIn.getChildren().add(quit);
        BorderPane pane1 = new BorderPane();
        
        //another vbox for creating a user to replace the vbox in this pane when button addUser is clicked
        VBox newUser = new VBox();
        TextField newUsername = new TextField();
        Button createNewUser = new Button("Create a new user");
        Button cancel = new Button("cancel");   //takes user back to log in screen
        newUser.getChildren().add(newUsername);
        newUser.getChildren().add(createNewUser);
        newUser.getChildren().add(cancel);      

        
        pane1.setPrefSize(width, height);
        pane1.setCenter(boxLogIn);
        Scene logInView = new Scene(pane1);
        
        //logged in: view of courses, add new course button
        
        Button addCourse = new Button("Add new course");
        Button logOut = new Button("Log out");
        HBox boxActions = new HBox();               //buttons that stay visible whenever logged in
        boxActions.getChildren().add(quit);
        boxActions.getChildren().add(logOut);
        boxActions.getChildren().add(addCourse);
        
        BorderPane pane2 = new BorderPane();
        
        Scene loggedIn = new Scene(pane2);
        
        //courseTable (1) - sketch
        
        TextField courseTitle = new TextField("Course Title goes here");
        HBox pointsInfo = new HBox();
        TextField number = new TextField(" # ");
        TextField points = new TextField("Points");
        TextField outOf = new TextField("out of");
        pointsInfo.setSpacing(10);
        pointsInfo.getChildren().add(number);
        pointsInfo.getChildren().add(points);
        pointsInfo.getChildren().add(outOf);
        GridPane pointsGrid = new GridPane();
        for (int row = 1; row <= 7; row++) {        // for starters 7 rows of sub credits
            for (int field = 1; field <= 3; field++) {
                if (field == 1) {
                    pointsGrid.add(new TextField(String.valueOf(row)),row,field);
                } else {
                    pointsGrid.add(new TextField(),row,field);
                }
            }
        }
        
        
        window.setTitle("Study Tracker");
        window.setScene(logInView);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(UserInterface.class);
    }
    
    
    
}
