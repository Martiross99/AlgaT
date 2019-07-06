package Kruskal.views;


import java.io.IOException;

import Kruskal.model.SceneLoader_Kruskal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import model.sceneController;

public class ControllerS11 implements model.ISceneController {

	sceneController sc;

    @FXML
    private RadioButton RightOpt, WrongOpt;
    private ToggleGroup Tg = new ToggleGroup();

    @FXML
    private Button Es2;

    @FXML
    private TextArea Risultato;

    @FXML
    private Button PrevB;

    @FXML
    private Button AlgoritmiMenu;

    @FXML
    void GetAnswer(ActionEvent event) {
    	
    	Risultato.clear();
    	RightOpt.setToggleGroup(Tg);
    	WrongOpt.setToggleGroup(Tg);
    	
    	if(RightOpt.isSelected()) {
    		Risultato.setFont(Font.font("Cambria", FontWeight.NORMAL, FontPosture.REGULAR, 18));
        	Risultato.setOpacity(1.00);
        	Risultato.appendText("Corretto!");
        	AlgoritmiMenu.setDisable(false);
    	}
    	
    	if(WrongOpt.isSelected()) {
    		Risultato.setFont(Font.font("Cambria", FontWeight.NORMAL, FontPosture.REGULAR, 18));
        	Risultato.setOpacity(1.00);
        	Risultato.appendText("Sbagliato, riprova");
    	}
    }
    
    @FXML
    void GoToMenu(ActionEvent event) throws IOException {
    	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	    sc.getProgetto().gotoMenu(window);	
    }


    @FXML
    void NextB(ActionEvent event) throws IOException {
    	sc.goNext();
    	
    }

    @FXML
    void PrevB(ActionEvent event) throws IOException {
    	sc.goBack();	
    }
    
  	@Override
  	public void setSceneParent(sceneController parent) {
  		sc = parent;
  		
  	}


    @FXML
    void initialize() {
        assert RightOpt != null : "fx:id=\"RightOpt\" was not injected: check your FXML file 'scena11.fxml'.";
        assert WrongOpt != null : "fx:id=\"WrongOpt\" was not injected: check your FXML file 'scena11.fxml'.";
        assert Es2 != null : "fx:id=\"Es2\" was not injected: check your FXML file 'scena11.fxml'.";
        assert Risultato != null : "fx:id=\"Risultato\" was not injected: check your FXML file 'scena11.fxml'.";
        assert PrevB != null : "fx:id=\"PrevB\" was not injected: check your FXML file 'scena11.fxml'.";

    }
}

