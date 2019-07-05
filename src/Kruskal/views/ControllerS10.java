package Kruskal.views;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

import model.sceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerS10 implements model.ISceneController {

    sceneController sc;

    @FXML
    private TextField Tentativo;

    @FXML
    private Button Dom1;

    @FXML
    private TextArea Risultato;

    @FXML
    private Button Riprova;

    @FXML
    private Button NextB;

    @FXML
    private Button PrevB;

    @FXML
    void Clear(ActionEvent event) {
    	
    	Tentativo.clear();
    	Risultato.clear();
    	
    }

    @FXML
    void GetAnswer(ActionEvent event) {

    	String prova = Tentativo.getText();
    	prova = prova.trim();
    	if(prova.length()!=0) {
    		try {	
    			Scanner scanner = new Scanner (new File("src/algatgiusto/risposte2_K.txt"));
    			boolean found = false;
    			while(scanner.hasNext()) {
    				String a = scanner.nextLine();
    				if(a.equals(prova)) {
    					Risultato.appendText("Corretto!"); 
    					found = true;
    					NextB.setDisable(false);
    				}
    			}
    			if(!found) Risultato.appendText("Sbagliato, riprova");
    	        scanner.close(); }
    		catch(FileNotFoundException ex) {
    			System.out.println("Unable to open file 'risposte2_K.txt'");                
    		        }
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
        assert Tentativo != null : "fx:id=\"Tentativo\" was not injected: check your FXML file 'scena10.fxml'.";
        assert Dom1 != null : "fx:id=\"Dom1\" was not injected: check your FXML file 'scena10.fxml'.";
        assert Risultato != null : "fx:id=\"Risultato\" was not injected: check your FXML file 'scena10.fxml'.";
        assert Riprova != null : "fx:id=\"Riprova\" was not injected: check your FXML file 'scena10.fxml'.";
        assert NextB != null : "fx:id=\"NextB\" was not injected: check your FXML file 'scena10.fxml'.";
        assert PrevB != null : "fx:id=\"PrevB\" was not injected: check your FXML file 'scena10.fxml'.";

    }
}
