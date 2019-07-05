package Kruskal.views;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import model.sceneController;

public class ControllerS8 implements model.ISceneController {

	sceneController sc;
	
    @FXML
    private RadioButton WrongOpt1, RightOpt, WrongOpt2, WrongOpt3;
    private ToggleGroup Tg = new ToggleGroup();
    
    @FXML
    private Button Es2;

    @FXML
    private TextArea Risultato;

    @FXML
    private Button PrevB;

    @FXML
    private Button NextB;

    @FXML
    void GetAnswer(ActionEvent event) {
    	
    	Risultato.clear();
    	RightOpt.setToggleGroup(Tg);
    	WrongOpt1.setToggleGroup(Tg);
    	WrongOpt2.setToggleGroup(Tg);
    	WrongOpt3.setToggleGroup(Tg);
    	
    	if(RightOpt.isSelected()) {
    		Risultato.setFont(Font.font("Cambria", FontWeight.NORMAL, FontPosture.REGULAR, 18));
        	Risultato.setOpacity(1.00);
        	Risultato.appendText("Corretto!");
        	NextB.setDisable(false);
    	}
    	
    	if(WrongOpt1.isSelected()||WrongOpt2.isSelected()||WrongOpt3.isSelected()) {
    		Risultato.setFont(Font.font("Cambria", FontWeight.NORMAL, FontPosture.REGULAR, 18));
        	Risultato.setOpacity(1.00);
        	Risultato.appendText("Sbagliato, riprova");
    	}
    	
    		
    	
    }


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
        assert WrongOpt1 != null : "fx:id=\"WrongOpt1\" was not injected: check your FXML file 'scena8.fxml'.";
        assert RightOpt != null : "fx:id=\"RightOpt\" was not injected: check your FXML file 'scena8.fxml'.";
        assert WrongOpt2 != null : "fx:id=\"WrongOpt2\" was not injected: check your FXML file 'scena8.fxml'.";
        assert WrongOpt3 != null : "fx:id=\"WrongOpt3\" was not injected: check your FXML file 'scena8.fxml'.";
        assert Es2 != null : "fx:id=\"Es2\" was not injected: check your FXML file 'scena8.fxml'.";
        assert Risultato != null : "fx:id=\"Risultato\" was not injected: check your FXML file 'scena8.fxml'.";
        assert PrevB != null : "fx:id=\"PrevB\" was not injected: check your FXML file 'scena8.fxml'.";
        assert NextB != null : "fx:id=\"NextB\" was not injected: check your FXML file 'scena8.fxml'.";

    }
}

