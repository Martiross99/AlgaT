package model;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class sceneLoader extends Application{
	
	 public static Integer prim = 1;
	 public static String primScene = "/views/prim.fxml";
	 public static Integer overView = 2;
	 public static String overViewScene = "/views/overView.fxml";
	 public static Integer concept = 3;
	 public static String conceptScene = "/views/concept.fxml";
	 public static Integer defProblem = 4;
	 public static String defProblemScene = "/views/defProblem.fxml";
	 public static Integer idea = 5;
	 public static String ideaScene = "/views/idea.fxml";
	 public static Integer correttezza = 6;
	 public static String correttezzaScene = "/views/correttezza.fxml";
	 public static Integer implementation = 7;
	 public static String implementScene = "/views/implementation.fxml";
	 public static Integer pseudoCodice = 8;
	 public static String codiceScene = "/views/pseudocodice.fxml";
	 public static Integer esecuzione = 9;
	 public static String exeScene = "/views/esecuzione.fxml";
	 public static Integer efficienza = 10;
	 public static String efficiencyScene = "/views/efficienza.fxml";
	 public static Integer esercizi = 11;
	 public static String eserciziScene = "/views/esercizi.fxml";
	 public static Integer esercizi2 = 12;
	 public static String esercizi2Scene = "/views/esercizi2.fxml";
	 public static Integer esercizi3 = 13;
	 public static String esercizi3Scene = "/views/esercizi3.fxml";
	 
	 
     public Stage stage;
     
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		 sceneController main = new sceneController();
		 main.loadScene(prim, primScene);
		 main.loadScene(overView, overViewScene);
		 main.loadScene(concept, conceptScene);
		 main.loadScene(defProblem, defProblemScene);
		 main.loadScene(idea, ideaScene);
		 main.loadScene(correttezza, correttezzaScene);
		 main.loadScene(implementation, implementScene);
		 main.loadScene(pseudoCodice, codiceScene);
		 main.loadScene(esecuzione, exeScene);
		 main.loadScene(efficienza, efficiencyScene);
		 main.loadScene(esercizi, eserciziScene);
		 main.loadScene(esercizi2, esercizi2Scene);
		 main.loadScene(esercizi3, esercizi3Scene);
		 
		 main.setScene(sceneLoader.esercizi3);
	        
	        Group root = new Group();
	        root.getChildren().add(main);
	        
//	        DoubleProperty size = new SimpleDoubleProperty(primaryStage.getHeight());
//	        DoubleProperty x = new SimpleDoubleProperty();
//	        x.bind(size);
//	        
	        Scene scene = new Scene(root,1080,720);
	        
	        primaryStage.setScene(scene);
	        
	       // primaryStage.setResizable(false);
	        primaryStage.show();
	}
	

}
