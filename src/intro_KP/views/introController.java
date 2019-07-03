package intro_KP.views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import model.sceneController;


//gestisce i file FXML : introduzione1, introduzione2, introduzione3, introduzione4.fxml


public class introController implements model.ISceneController{

	sceneController sc; 
	

    @FXML
    private Line line1, line2, taglio;
	
	@FXML
	private Button back, next,change;
	
	
//Funzioni che gestiscono l'FXML introduzione3.fxml
	
	  @FXML
	    void trasforma(ActionEvent event) {
               line1.setStroke(Color.rgb(140, 143, 154));
               line2.setStroke(Color.rgb(228, 11, 11));
	    }

	  
//Funzioni che gestiscono lo scambio delle scene 
	  
    @FXML
    void goBack(ActionEvent event) {
       sc.goBack();
    }

    @FXML
    void goNext(ActionEvent event) {
       sc.goNext();
    }
    
    @FXML
    void gotoMenu(ActionEvent event) {
       sc.gotoMenu(event);
    }
	
	@Override
	public void setSceneParent(sceneController parent) {
		sc = parent;
		
	}


	 @FXML
	 void initialize() {
		 
	//FXML introduzione3	 
	    assert change != null : "fx:id=\"change\" was not injected: check your FXML file 'introduzione3.fxml'.";
	    assert line1 != null : "fx:id=\"line1\" was not injected: check your FXML file 'introduzione3.fxml'.";
	    assert line2 != null : "fx:id=\"line2\" was not injected: check your FXML file 'introduzione3.fxml'.";
	    assert taglio != null : "fx:id=\"taglio\" was not injected: check your FXML file 'introduzione3.fxml'.";
	    if(taglio != null)  taglio.getStrokeDashArray().addAll(20d,5d);
	    
	    
	    
    	assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'introduzione.fxml'.";
        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'introduzione.fxml'.";
    }
}