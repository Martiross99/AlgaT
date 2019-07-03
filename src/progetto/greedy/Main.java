package progetto.greedy;

import model.sceneController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import intro_KP.model.introLoad;
import Prim.model.primLoad;

import java.util.HashMap;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {


		try{

			
//			primLoad intro = new primLoad();
//			intro.start(primaryStage);
			


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
