package Kruskal.views;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.sceneController;

//CONTROLLER DI intro.fxml E scena2.fxml

public class CKruskal_02 implements model.ISceneController {
	
	sceneController sc;
	

	
    @FXML
    private Button NextB;

    @FXML
    private Button PrevB;

    

    @Override
	public void setSceneParent(sceneController parent) {
		sc = parent;
		
	}

    @FXML
    void NextB(ActionEvent event) throws IOException {
    	sc.goNext();
    }

    @FXML
    void PrevB(ActionEvent event) throws IOException {
    	sc.goBack();	
    }
    

    @FXML
    void initialize() {
        assert NextB != null : "fx:id=\"NextB\" was not injected: check your FXML file 'Intro.fxml'.";
        assert PrevB != null : "fx:id=\"PrevB\" was not injected: check your FXML file 'Intro.fxml'.";

    }

}
