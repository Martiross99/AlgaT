package views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Line;
import model.ISceneController;
import model.sceneController;

public class exeController implements ISceneController {

	sceneController sc;
	
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    private StackPane spB,spC,spD,spE,spF,spG,spH;
    
    StackPane nodi[] = {spC,spE,spG,spF,spD,spB,spH};

    @FXML
    private CubicCurve firstCut,secondCut,thirdCut,fourthCut,fifthCut,sixthCut,seventhCut;
    
    
    CubicCurve curve[] = {firstCut,secondCut,thirdCut,fourthCut,fifthCut,sixthCut,seventhCut};


    @FXML
    void toFill(MouseEvent event) {
    	
    	StackPane x = (StackPane) event.getSource();
    	
    	if(x.equals(nodi[0])) {
    		Circle c = (Circle) x.getChildren().get(0);
        	c.setStroke(Color.CORAL);
    	}
    }
    
	@Override
	public void setSceneParent(sceneController sceneParent) {
		sc = sceneParent;	
	}

    @FXML
    void initialize() {
    	 assert spE != null : "fx:id=\"spE\" was not injected: check your FXML file 'esecuzione.fxml'.";
         assert spD != null : "fx:id=\"spD\" was not injected: check your FXML file 'esecuzione.fxml'.";
         assert spB != null : "fx:id=\"spB\" was not injected: check your FXML file 'esecuzione.fxml'.";
         assert spG != null : "fx:id=\"spG\" was not injected: check your FXML file 'esecuzione.fxml'.";
         assert spF != null : "fx:id=\"spF\" was not injected: check your FXML file 'esecuzione.fxml'.";
         assert spC != null : "fx:id=\"spC\" was not injected: check your FXML file 'esecuzione.fxml'.";
         assert spH != null : "fx:id=\"spH\" was not injected: check your FXML file 'esecuzione.fxml'.";
         
         assert firstCut != null : "fx:id=\"firstCut\" was not injected: check your FXML file 'esecuzione.fxml'.";
         assert secondCut != null : "fx:id=\"secondCut\" was not injected: check your FXML file 'esecuzione.fxml'.";
         assert thirdCut != null : "fx:id=\"thirdCut\" was not injected: check your FXML file 'esecuzione.fxml'.";
         assert fourthCut != null : "fx:id=\"fourthCut\" was not injected: check your FXML file 'esecuzione.fxml'.";
         assert fifthCut != null : "fx:id=\"fifthCut\" was not injected: check your FXML file 'esecuzione.fxml'.";
         assert seventhCut != null : "fx:id=\"seventhCut\" was not injected: check your FXML file 'esecuzione.fxml'.";
         assert sixthCut != null : "fx:id=\"sixthCut\" was not injected: check your FXML file 'esecuzione.fxml'.";

     }

}
