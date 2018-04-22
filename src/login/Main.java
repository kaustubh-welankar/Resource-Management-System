package login;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    static private Stage ps;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        ps = primaryStage;
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 338, 200));
        primaryStage.show();
    }

    public static Stage getStage(){
        return ps;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
