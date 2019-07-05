package intro_KP.model;

import java.util.HashMap;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.sceneController;
import progetto.greedy.Main;

public class introLoad {

	public static Integer introI = 1;
	public static String firstIntro = "/intro_KP/views/introduzione.fxml";
	public static Integer introII = 2;
	public static String secondIntro = "/intro_KP/views/introduzione2.fxml";
	public static Integer introIII = 3;
	public static String thirdIntro = "/intro_KP/views/introduzione3.fxml";
	public static Integer introIV = 4;
	public static String fourthIntro = "/intro_KP/views/introduzione4.fxml";
	
	public Stage stage;
	

	public sceneController Load(sceneController main) {		
		try {
		main.loadScene(introI, firstIntro);
		main.loadScene(introII, secondIntro);
		main.loadScene(introIII, thirdIntro);
		main.loadScene(introIV, fourthIntro);
        main.setScene(introI);
        
	     return(main);
		 
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			return(null);
		}
	
	}


//	@Override
//	public void start(Stage primaryStage) throws Exception {
//
//         sceneController main = new sceneController();	
//         
//         main.loadScene(introI, firstIntro);
// 		 main.loadScene(introII, secondIntro);
// 		 main.loadScene(introIII, thirdIntro);
// 		 main.loadScene(introIV, fourthIntro);
//         main.setScene(introI);
//         
//     	StackPane root = new StackPane();
//		root.getChildren().add(main);
//		
//		root.getStylesheets().add(getClass().getResource("/stylesheets/application.css").toExternalForm());
//	    root.getStyleClass().add("stackp");
//	    
//		Scene scene = new Scene(root);
//
//
//		primaryStage.setScene(scene);
//		primaryStage.show();
//         
//         
//	}
	 

}
