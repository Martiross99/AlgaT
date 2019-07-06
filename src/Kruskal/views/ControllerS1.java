package Kruskal.views;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import model.sceneController;


public class ControllerS1 implements model.ISceneController {
	
	sceneController sc;
    

    @FXML
    private Button PrevB, NextB, ES;

    @FXML
    private AnchorPane Esercizio;

    @FXML
    private Button Opt1, Opt2;

    @FXML
    private Label Risposta;

    @FXML
    void ApriAlertBox(ActionEvent event) {
    	Esercizio.setVisible(true);
    }
    


    @FXML
    void RightOpt(ActionEvent event) {
    	
    	Risposta.setOpacity(1.00);
    	Risposta.setText("CORRETTO, BRAVO!");
    	Risposta.setDisable(false);
    	
    }

    @FXML
    void WrongOpt(ActionEvent event) {

    	Risposta.setOpacity(1.00);
    	Risposta.setText("SBAGLIATO");
    	Risposta.setDisable(false);

    }
    
    
	@Override
	public void setSceneParent(sceneController parent) {
		sc = parent;
		
	}

    @FXML
    void NextB(ActionEvent event) throws IOException {
    	sc.goNext();
    	
    	Esercizio.setVisible(false);
    }

    @FXML
    void PrevB(ActionEvent event) throws IOException {
    	sc.goBack();	
    }
    
    
    
    
    @FXML
    void initialize() {
        assert PrevB != null : "fx:id=\"PrevB\" was not injected: check your FXML file 'scena1.fxml'.";
        assert NextB != null : "fx:id=\"NextB\" was not injected: check your FXML file 'scena1.fxml'.";
        assert ES != null : "fx:id=\"ES\" was not injected: check your FXML file 'scena1.fxml'.";
        assert Esercizio != null : "fx:id=\"Esercizio\" was not injected: check your FXML file 'scena1.fxml'.";
        assert Opt1 != null : "fx:id=\"Opt1\" was not injected: check your FXML file 'scena1.fxml'.";
        assert Opt2 != null : "fx:id=\"Opt2\" was not injected: check your FXML file 'scena1.fxml'.";
        assert Risposta != null : "fx:id=\"Risposta\" was not injected: check your FXML file 'scena1.fxml'.";

    }
}

