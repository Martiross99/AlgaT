package Prim.model;

import java.util.HashMap;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.sceneController;

public class primLoad {

		 public static Integer prim = 1;
		 public static String primScene = "/Prim/views/prim.fxml";
		 public static Integer overView = 2;
		 public static String overViewScene = "/Prim/views/overView.fxml";
		 public static Integer concept = 3;
		 public static String conceptScene = "/Prim/views/concept.fxml";
		 public static Integer defProblem = 4;
		 public static String defProblemScene = "/Prim/views/defProblem.fxml";
		 public static Integer idea = 5;
		 public static String ideaScene = "/Prim/views/idea.fxml";
		 public static Integer correttezza = 6;
		 public static String correttezzaScene = "/Prim/views/correttezza.fxml";
		 public static Integer implementation = 7;
		 public static String implementScene = "/Prim/views/implementation.fxml";
		 public static Integer pseudoCodice = 8;
		 public static String codiceScene = "/Prim/views/pseudocodice.fxml";
		 public static Integer esecuzione = 9;
		 public static String exeScene = "/Prim/views/esecuzione.fxml";
		 public static Integer efficienza = 10;
		 public static String efficiencyScene = "/Prim/views/efficienza.fxml";
		 public static Integer esercizi = 11;
		 public static String eserciziScene = "/Prim/views/esercizi.fxml";
		 public static Integer domande = 12;
		 public static String domandeScene = "/Prim/views/domande.fxml";
		 public static Integer domande2 = 13;
		 public static String domande2Scene = "/Prim/views/domande2.fxml";
		 public static Integer esercizi2 = 14;
		 public static String esercizi2Scene = "/Prim/views/esercizi2.fxml";


	//     public Stage stage;
	     
	     
	    public sceneController Load(sceneController controller) {
				try {

				 controller.loadScene(prim, primScene);
				 controller.loadScene(overView, overViewScene);
				 controller.loadScene(concept, conceptScene);
				 controller.loadScene(defProblem, defProblemScene);
				 controller.loadScene(idea, ideaScene);
				 controller.loadScene(correttezza, correttezzaScene);
				 controller.loadScene(implementation, implementScene);
				 controller.loadScene(pseudoCodice, codiceScene);
				 controller.loadScene(esecuzione, exeScene);
				 controller.loadScene(efficienza, efficiencyScene);
				 controller.loadScene(esercizi, eserciziScene);
				 controller.loadScene(domande, domandeScene);
				 controller.loadScene(domande2, domande2Scene);
				 controller.loadScene(esercizi2, esercizi2Scene);
				 
	             controller.setScene(prim);
	 
			     return(controller);
				 
				} catch (Exception e) {
					
					System.out.println(e.getMessage());
					return(null);
				}
			
			}


//		@Override
//		public void start(Stage primaryStage) throws Exception {
//			
//			sceneController controller = new sceneController();
//			
//			 controller.loadScene(prim, primScene);
//			 controller.loadScene(overView, overViewScene);
//			 controller.loadScene(concept, conceptScene);
//			 controller.loadScene(defProblem, defProblemScene);
//			 controller.loadScene(idea, ideaScene);
//			 controller.loadScene(correttezza, correttezzaScene);
//			 controller.loadScene(implementation, implementScene);
//			 controller.loadScene(pseudoCodice, codiceScene);
//			 controller.loadScene(esecuzione, exeScene);
//			 controller.loadScene(efficienza, efficiencyScene);
//			 controller.loadScene(esercizi, eserciziScene);
//			 controller.loadScene(domande, domandeScene);
//			 controller.loadScene(domande2, domande2Scene);
//			 controller.loadScene(esercizi2, esercizi2Scene);
//			 
//             controller.setScene(prim);
//             
//         	StackPane root = new StackPane();
//    		root.getChildren().add(controller);
//    		
//    		root.getStylesheets().add(getClass().getResource("/stylesheets/application.css").toExternalForm());
//    	    root.getStyleClass().add("stackp");
//    		
//    		Scene scene = new Scene(root);
//
//
//    		primaryStage.setScene(scene);
//    		primaryStage.show();
//			
//		}

}
