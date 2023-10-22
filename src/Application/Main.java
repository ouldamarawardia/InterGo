package Application;

import java.io.IOException;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	    

	 @Override
	    public void start(Stage primaryStage) {
		 	
		 	Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource("/interfaces/Home.fxml")); 
		        primaryStage.setScene(new Scene(root));
		        primaryStage.setTitle("InterGO");
		        primaryStage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 	

	    }

    public static void main(String[] args) {
    	
        launch();
    }

}