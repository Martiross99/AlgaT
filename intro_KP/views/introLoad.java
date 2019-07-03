package views;

import java.util.HashMap;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.sceneController;
import model.sceneLoader;

public class introLoad {

	public static Integer introI = 14;
	public static String firstIntro = "/views/introduzione.fxml";
	public static Integer introII = 15;
	public static String secondIntro = "/views/introduzione2.fxml";
	public static Integer introIII = 16;
	public static String thirdIntro = "/views/introduzione3.fxml";
	public static Integer introIV = 17;
	public static String fourthIntro = "/views/introduzione4.fxml";
	
	public Stage stage;
	
	sceneController main = new sceneController();

	public sceneController Load() {
		
		try {
		sceneController main = new sceneController();
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
	 

}
