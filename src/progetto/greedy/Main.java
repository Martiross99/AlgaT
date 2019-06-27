package progetto.greedy;

import model.sceneLoader;
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	
	 
	
	@Override
	public void start(Stage primaryStage) {
		

		sceneLoader sl = new sceneLoader();
		try {
			sl.start(primaryStage);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
