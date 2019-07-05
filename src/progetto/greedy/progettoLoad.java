package progetto.greedy;

import Prim.model.primLoad;
import intro_KP.model.introLoad;
import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.sceneController;

public class progettoLoad extends Application {

	
	progettoController progetto = new progettoController();
	

	
//	public void load() {
//		
//		try {
//			
//			sceneController mainController = new sceneController();
//			menuLoad main = new menuLoad();
//			mainController = main.Load(mainController);
//			
//			progetto.loadController(mainController) ;
//			
//	   		
//            sceneController primController = new sceneController();
//			primLoad prim = new primLoad();
//			primController = prim.Load(primController);
//			
//			progetto.loadController(primController);
//			
//			sceneController introController = new sceneController();
//			introLoad intro = new introLoad();	
//			introController = intro.Load(introController);
//			
//			progetto.loadController(introController);
//			
//			
//			
//			//return(progetto);
//			
//		} catch (Exception e) {
//			
//			System.out.println(e.getMessage());
//		//	return(null);
//			
//		}
//		
//	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
         progetto.start(primaryStage);
		
	}
	
	
}
