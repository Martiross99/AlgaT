package progetto.greedy;

import model.sceneController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import model.introLoad;
import model.primLoad;

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
			
			primLoad prim = new primLoad();
			
			introLoad intro = new introLoad();
			
			prim.Load(main);
			intro.Load(main);
			
		    StackPane root = new StackPane();
		    
		    root.getChildren().add(main); 
//		    root.getStylesheets().add(getClass().getResource("/progetto/greedy/application.css").toExternalForm());
//		    root.getStyleClass().add("stackp");
		    
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
