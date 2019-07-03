package views;

import java.util.HashMap;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.sceneController;
import model.sceneLoader;
import progetto.greedy.Main;

public class introLoad {

	public static Integer introI = 1;
	public static String firstIntro = "/views/introduzione.fxml";
	public static Integer introII = 2;
	public static String secondIntro = "/views/introduzione2.fxml";
	public static Integer introIII = 3;
	public static String thirdIntro = "/views/introduzione3.fxml";
	public static Integer introIV = 4;
	public static String fourthIntro = "/views/introduzione4.fxml";
	
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
	 

}
