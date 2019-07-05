package progetto.greedy;	
import java.io.IOException;

import Prim.model.primLoad;
import intro_KP.model.introLoad;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.sceneController;

//classe che gestisce tutti controller delle lezioni, li inserisce in un array e gestisce le funzioni di interscambio

public class progettoController extends Application {


        protected Integer controllerCorrente;
        
		protected sceneController[] progetto ; 
		
		
		public progettoController() {
		
//		super();
			this.controllerCorrente = 0;
			this.progetto = new sceneController[3];
//			try {
//				this.load();
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
		}
		
		
		public Integer getLength() {
			return(this.progetto.length);
		}
		
		public void load() {
		   	try {
				
		   		sceneController mainController = new sceneController();
				menuLoad main = new menuLoad();
				mainController = main.Load(mainController);
				
				sceneController primController = new sceneController();
				primLoad prim = new primLoad();
				primController = prim.Load(primController);
				

				sceneController introController = new sceneController();
				introLoad intro = new introLoad();	
				introController = intro.Load(introController);
		   		
		   		
		   		

		   		
				progetto[0] = mainController;
				progetto[2] = primController;
				progetto[1] = introController;
				
				this.setStructure();

		 
		     } catch(Exception e) {
			e.printStackTrace();
		   }
		   	
	     }
		
		
//		public sceneController getController(Integer i) {
//			return(progetto[i]);
//		}

        public void setStructure() {
        	for(int i = 0; i < progetto.length; i++) {
        		progetto[i].setProgetto(this);
        	}
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
				System.out.println(e.getMessage());
			}
		}
		
		public void loadController(Integer i, Stage window) throws IOException {
			controllerCorrente = i;
			try {
				this.start(window);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void loadScene(Integer i, Stage window, Integer scena) throws IOException {
			
			this.loadController(i,window);
			
			sceneController attuale = this.progetto[controllerCorrente];
			
			while( attuale.getChildren().get(0) != attuale.getScene(scena)) {
				attuale.goNext();
			}
			
		}

}
