package progetto.greedy;

import model.sceneController;

public class menuLoad {
      
	public static Integer menu = 1;
	public static String menuScene = "/progetto/greedy/menu.fxml";
	public static Integer game = 2;
	public static String gameScene = "/game/monete.fxml";
	public static Integer lezioni = 3;
	public static String lezioniScene = "/progetto/greedy/lezioni.fxml";
	public static Integer algoritmi = 4;
	public static String algoritmiScene = "/progetto/greedy/algoritmi.fxml";


	 public sceneController Load(sceneController controller) {
		 
			try {

			 controller.loadScene(menu, menuScene);
			 controller.loadScene(game, gameScene);
			 controller.loadScene(lezioni, lezioniScene);
			 controller.loadScene(algoritmi, algoritmiScene);
             controller.setScene(menu);

		     return(controller);
			 
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
				return(null);
			}
		
		}


}
