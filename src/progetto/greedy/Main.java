package progetto.greedy;

import model.sceneController;
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
			sceneLoader sl = new sceneLoader();
			sceneController Prim = sl.Load();
			
			introLoad introduzione = new introLoad();
			sceneController Intro = introduzione.Load();
			Prim.addMap(Intro);
			
		    StackPane root = new StackPane();
		    root.getChildren().addAll(Intro);   
		
		    Scene scene = new Scene(root);
		    primaryStage.setScene(scene);
		     
//		     primaryStage.setMaximized(true);   
//		     primaryStage.setResizable(false);
		     primaryStage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
