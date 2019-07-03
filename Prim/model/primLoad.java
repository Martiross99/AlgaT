package model;

import java.util.HashMap;
import javafx.stage.Stage;

public class primLoad {

		 public static Integer prim = 5;
		 public static String primScene = "/views/prim.fxml";
		 public static Integer overView = 6;
		 public static String overViewScene = "/views/overView.fxml";
		 public static Integer concept = 7;
		 public static String conceptScene = "/views/concept.fxml";
		 public static Integer defProblem = 8;
		 public static String defProblemScene = "/views/defProblem.fxml";
		 public static Integer idea = 9;
		 public static String ideaScene = "/views/idea.fxml";
		 public static Integer correttezza = 10;
		 public static String correttezzaScene = "/views/correttezza.fxml";
		 public static Integer implementation = 11;
		 public static String implementScene = "/views/implementation.fxml";
		 public static Integer pseudoCodice = 12;
		 public static String codiceScene = "/views/pseudocodice.fxml";
		 public static Integer esecuzione = 13;
		 public static String exeScene = "/views/esecuzione.fxml";
		 public static Integer efficienza = 14;
		 public static String efficiencyScene = "/views/efficienza.fxml";
		 public static Integer esercizi = 15;
		 public static String eserciziScene = "/views/esercizi.fxml";
		 public static Integer domande = 16;
		 public static String domandeScene = "/views/domande.fxml";
		 public static Integer domande2 = 17;
		 public static String domande2Scene = "/views/domande2.fxml";
		 public static Integer esercizi2 = 18;
		 public static String esercizi2Scene = "/views/esercizi2.fxml";


	     public Stage stage;
	     
	     
	    public sceneController Load(sceneController main) {
				try {

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
				 main.loadScene(domande, domandeScene);
				 main.loadScene(domande2, domande2Scene);
				 main.loadScene(esercizi2, esercizi2Scene);
				 
	             // main.setScene(prim);
	 
			     return(main);
				 
				} catch (Exception e) {
					
					System.out.println(e.getMessage());
					return(null);
				}
			
			}

}
