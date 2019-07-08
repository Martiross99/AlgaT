package progetto.greedy;	

import java.io.IOException;

import Kruskal.model.SceneLoader_Kruskal;
import Prim.model.primLoad;
import intro_KP.model.introLoad;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import lezione1.introSceneLoader;
import model.sceneController;

//classe che gestisce tutti controller delle lezioni, li inserisce in un array e gestisce le funzioni di interscambio

public class progettoController extends Application{


        protected Integer controllerCorrente;     //mantiene l'indice del sceneController attualmente in esecuzione
        
		protected sceneController[] progetto ;    //array che contiene tutti i sceneController del progetto
		
		
		public progettoController() {
			this.controllerCorrente = 0;
			this.progetto = new sceneController[5];
		}
		
		
		public void load() {                        //carica i sceneController dentro l'array
			
		   	try {
				
		   		sceneController mainController = new sceneController();
				menuLoad main = new menuLoad();
				mainController = main.Load(mainController);
				
				sceneController kruskalController = new sceneController();
				SceneLoader_Kruskal kruskal = new SceneLoader_Kruskal();
				kruskalController = kruskal.Load(kruskalController);
				
				sceneController primController = new sceneController();
				primLoad prim = new primLoad();
				primController = prim.Load(primController);
				

				sceneController introKPController = new sceneController();
				introLoad introKP = new introLoad();	
				introKPController = introKP.Load(introKPController);
				
				sceneController introController = new sceneController();
				introSceneLoader intro = new introSceneLoader();	
				introController = intro.Load(introController);


	
		   		
				progetto[0] = mainController;
				progetto[1] = introKPController;
				progetto[2] = primController;
				progetto[3] = kruskalController;	
				progetto[4] = introController;

				
				this.setStructure();                     

		 
		     } catch(Exception e) {
			e.printStackTrace();
		   }
		   	
	     }
		

        public void setStructure() {       //comunica ad ogni sceneController il progetto al quale devono fare riferimento
        	
        	for(int i = 0; i < progetto.length; i++) {
        		progetto[i].setProgetto(this);
        	}
        	
        }
		
		@Override
		public void start(Stage primaryStage) throws Exception {
			try {																//crea uno stackPane e imposta come figlio il sceneController corrente
				
		    StackPane root = new StackPane();
			root.getChildren().add(progetto[controllerCorrente]);
			
    		root.getStylesheets().add(getClass().getResource("/stylesheets/application.css").toExternalForm());
    	    root.getStyleClass().add("stackp");
    		

    	    NumberBinding ScaleX = Bindings.divide(root.widthProperty(), 1080);     //scala le dimensioni dello stackPane in relazione
    	    NumberBinding ScaleY = Bindings.divide(root.heightProperty(), 720);     //al ridimensionamento della finestra

    	    progetto[controllerCorrente].scaleXProperty().bind(ScaleX);
    	    progetto[controllerCorrente].scaleYProperty().bind(ScaleY);

    	//  Scene scene = new Scene(root, 1080, 720);
    	  //  Double x = this.larghezza();
//    	    Double x = primaryStage.getWidth() - 1080;
//    	    Double y = primaryStage.getHeight() - 720;
    		Scene scene = new Scene(root,primaryStage.getWidth()-12.800048828125,primaryStage.getHeight()-35.2000122070312);
    		

    		primaryStage.setScene(scene);

    		primaryStage.show();
    		
    		
			} catch (Exception e) {	
				System.out.println(e.getMessage());
			}
    		
		}

		
		public void gotoMenu(Stage window) throws IOException {	
			progetto[controllerCorrente].setScene(1);
			controllerCorrente = 0;                       //per andare al menu prende il sceneController in posizione zero nell'array
			try {                                             //e lo carica
			   this.start(window);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		public void loadController(Integer i, Stage window) {  //prende in input l'indice relativo al sceneController
			controllerCorrente = i;                             //che si vuole caricare e chiama la funzione start per caricarlo
			try {
				this.start(window);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void loadScene(Integer i, Stage window, Integer scena) throws IOException {   //prende in input l'indice del sceneController e l'indice della scena desiderata
																						      
			this.loadController(i,window);
			
			sceneController attuale = this.progetto[controllerCorrente];          //prende il sceneController e va avanti fino alla scena richiesta                
			
			if(attuale.getMap(attuale).containsKey(scena)) {
			while(attuale.getNode(attuale.getScenaCorrente()) != attuale.getNode(scena)) {
				attuale.goNext();
			}
		  }
		}

}
