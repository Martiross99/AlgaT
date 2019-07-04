package progetto.greedy;	
import java.io.IOException;

import Prim.model.primLoad;
import intro_KP.model.introLoad;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.sceneController;

public class sceneLoader extends Application{

        protected Integer controllerCorrente;
		protected sceneController[] progetto = new sceneController[3] ; 
		
		
		public sceneLoader() {
			this.controllerCorrente = 0;
			try {
				this.load();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void load() {
		   	try {
		   		
		   		sceneController mainController = new sceneController();
				menuLoad main = new menuLoad();
				main.Load(mainController);
		   		
	            sceneController primController = new sceneController();
				primLoad prim = new primLoad();
				prim.Load(primController);
				
				sceneController introController = new sceneController();
				introLoad intro = new introLoad();	
				intro.Load(introController);
				
				progetto[0] = mainController;
				progetto[2] = primController;
				progetto[1] = introController;
				

		 
		     }catch(Exception e) {
			e.printStackTrace();
		   }
	     }
		
		
		public sceneController getController(Integer i) {
			return(progetto[i]);
		}


		@Override
		public void start(Stage primaryStage) throws Exception {
			StackPane root = new StackPane();
    		root.getChildren().add(progetto[controllerCorrente]);
    		
    		root.getStylesheets().add(getClass().getResource("/stylesheets/application.css").toExternalForm());
    	    root.getStyleClass().add("stackp");
    		
    		Scene scene = new Scene(root);

    		primaryStage.setScene(scene);
    		primaryStage.show();
		}
		
		public void gotoMenu(Stage window) throws IOException {
			controllerCorrente = 0;
			try {
			this.start(window);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void loadController(Integer i, Stage window) throws IOException {
			controllerCorrente = i;
			try {
				this.start(window);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
