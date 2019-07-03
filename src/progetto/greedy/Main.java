package progetto.greedy;

import model.sceneController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import model.sceneLoader;
import views.introLoad;

import java.util.HashMap;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {

		try {
			sceneController main = new sceneController();
			
			sceneLoader sl = new sceneLoader();
			
			introLoad intro = new introLoad();
			
			sl.Load(main);
			intro.Load(main);
			
		    StackPane root = new StackPane();
		    
		    root.getChildren().add(main);   
		
		    Scene scene = new Scene(root);
		    primaryStage.setScene(scene);
		     
//		     primaryStage.setMaximized(true);   
//		     primaryStage.setResizable(false);
		     primaryStage.show();

//		try{
//			AnchorPane mPane = FXMLLoader.load(getClass().getResource("menu.fxml"));
//			Scene mScene = new Scene(mPane);
//			primaryStage.setScene(mScene);
//			primaryStage.show();
//
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
