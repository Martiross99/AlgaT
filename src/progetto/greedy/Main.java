package progetto.greedy;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import model.sceneLoader;
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	
	 
	
	@Override
	public void start(Stage primaryStage) {
		try{
			AnchorPane mPane = FXMLLoader.load(getClass().getResource("menu.fxml"));
			Scene mScene = new Scene(mPane);
			primaryStage.setScene(mScene);
			primaryStage.show();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
