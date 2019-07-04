package progetto.greedy;

import Prim.model.primLoad;
import intro_KP.model.introLoad;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import model.sceneController;

public class menuLoad {
      
	public static Integer menu = 1;
	public static String menuScene = "/progetto/greedy/menu.fxml";
	public static Integer lezioni = 2;
	public static String lezioniScene = "/progetto/greedy/lezioni.fxml";
	public static Integer algoritmi = 3;
	public static String algoritmiScene = "/progetto/greedy/algoritmi.fxml";
//	public static Integer concept = 3;
//	public static String conceptScene = "/Prim/views/concept.fxml";
//	public static Integer defProblem = 4;
//	public static String defProblemScene = "/Prim/views/defProblem.fxml";

	 public sceneController Load(sceneController main) {
			try {

			 main.loadScene(menu, menuScene);
			 main.loadScene(lezioni, lezioniScene);
			 main.loadScene(algoritmi, algoritmiScene);
             main.setScene(menu);

		     return(main);
			 
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
				return(null);
			}
		
		}


}
