package Prim.views;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import model.sceneController;


//gestisce i file : esercizi.fxml


public class eserciziController  implements model.ISceneController{

	sceneController sc;

    @FXML
    private Button back, next, done;
 

    @FXML
    private TextArea risposta;
    
    @FXML
    private Text secondExercise;


    @FXML
    private RadioButton rb1,rb2,rb3,rb4;
    private ToggleGroup rb = new ToggleGroup();
    
    
  //Funzioni che gestiscono il file esercizi.fxml
	@FXML
	 void verifica(ActionEvent event) {
		    risposta.clear();
		    rb1.setToggleGroup(rb);rb2.setToggleGroup(rb);rb3.setToggleGroup(rb);rb4.setToggleGroup(rb);
            if(rb2.isSelected() && (secondExercise == null)) {
            	risposta.appendText("Corretto!");
            	next.setDisable(false); 
            }
            else if (rb4.isSelected() && (secondExercise != null)) {
            	risposta.appendText("Corretto!");
            	next.setDisable(false); 	
            } 
            else {
            	risposta.setText("Sbagliato, riprova");
            	next.setDisable(true);
            }
	    }

 
	
 //Funzioni che gestiscono lo scambio tra le pagine	 
    @FXML
	 void goBack(ActionEvent event) throws IOException {
	  sc.goBack();
	  }
	    
	@FXML
	  void goNext(ActionEvent event) throws IOException {
	    sc.goNext();
	    pulisciSchermata();
      }		    

	public void pulisciSchermata() {
		   risposta.clear();
	}
	
	@Override
	public void setSceneParent(sceneController parent) {
		sc = parent;	
	}
	



    @FXML
	void initialize() {        
    	
     //FXML esercizi 1-2 
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'esercizi.fxml'.";
        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'esercizi.fxml'.";	
	    assert rb1 != null : "fx:id=\"rb1\" was not injected: check your FXML file 'esercizi.fxml'.";
	    assert rb2 != null : "fx:id=\"rb2\" was not injected: check your FXML file 'esercizi.fxml'.";
	    assert rb3 != null : "fx:id=\"rb3\" was not injected: check your FXML file 'esercizi.fxml'.";
	    assert rb4 != null : "fx:id=\"rb4\" was not injected: check your FXML file 'esercizi.fxml'.";
        assert done != null : "fx:id=\"done\" was not injected: check your FXML file 'esercizi.fxml'.";
        assert risposta != null : "fx:id=\"risposta\" was not injected: check your FXML file 'esercizi.fxml'.";
        
     //FXML esercizi2
        assert secondExercise != null : "fx:id=\"secondQuestion\" was not injected: check your FXML file 'esercizi2.fxml'.";
    }
}
