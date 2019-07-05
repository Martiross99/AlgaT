package progetto.greedy;

import model.sceneController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import intro_KP.model.introLoad;
import Prim.model.primLoad;

import java.util.HashMap;

import Kruskal.model.SceneLoader_Kruskal;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {


		try {
			
			progettoController progetto = new progettoController();
			progetto.load();
			progetto.start(primaryStage);
		    StackPane root = new StackPane();
//		    
//		    root.getChildren().addAll(menu.getController(0),menu.getController(1)); 
//		    root.getStylesheets().add(getClass().getResource("/stylesheets/application.css").toExternalForm());
//		    root.getStyleClass().add("stackp");
//		    
//		    Scene scene = new Scene(root);
//		    primaryStage.setScene(scene);
		     
//		     primaryStage.setMaximized(true);   
//		     primaryStage.setResizable(false);
//		     primaryStage.show();
			
//			SceneLoader_Kruskal sc = new SceneLoader_Kruskal();
//			sceneController main = new sceneController();
//			main=sc.Load(main);
//			StackPane root = new StackPane();
//		    
//		    root.getChildren().add(main); 
//		    root.getStylesheets().add(getClass().getResource("/stylesheets/application.css").toExternalForm());
//		    root.getStyleClass().add("stackp");
//		    
//		    Scene scene = new Scene(root);
//		    primaryStage.setScene(scene);		     
//		     primaryStage.setMaximized(true);   
//		     primaryStage.setResizable(false);
//		     primaryStage.show();
//			

//			AnchorPane mPane = FXMLLoader.load(getClass().getResource("/Kruskal/views/Intro.fxml"));
//			Scene mScene = new Scene(mPane);
//			primaryStage.setScene(mScene);
//			primaryStage.show();

		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
